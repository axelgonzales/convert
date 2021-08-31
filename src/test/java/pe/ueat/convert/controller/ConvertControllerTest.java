package pe.ueat.convert.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import pe.ueat.convert.constant.Constant;
import pe.ueat.convert.controller.request.ConvertRequest;
import pe.ueat.convert.controller.response.Response;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ConvertControllerTest {

	@LocalServerPort
	private int port;
    
    @Autowired
   	private TestRestTemplate restTemplate;
    
    @Test
    public void convertOk(){
        ConvertRequest request = new ConvertRequest();
        request.setConvertType(1);
        request.setDataInput("XXI");
       
    	ResponseEntity<Response> response = this.restTemplate.postForEntity("http://localhost:" + port +"/convert/v1/convert/convert"
		  ,request,Response.class);
    	assertThat(response.getBody().getMessage()).isEqualTo(Constant.REG_INS_ACCEPTED);
		
    }
    
    
    @Test
    public void convertErrorData(){
    	 ConvertRequest request = new ConvertRequest();
         request.setConvertType(1);
         request.setDataInput("AXEL");
        
    	ResponseEntity<Response> response = this.restTemplate.postForEntity("http://localhost:" + port +"/convert/v1/convert/convert"
		  ,request,Response.class);
    	assertThat(response.getBody().getMessage()).isEqualTo("THE FIELD DATAINPUT THE VALUE TO BE CONVERTED IS INVALID FOR THIS METHOD");
		
    }
    
    @Test
    public void convertErrorType(){
    	 ConvertRequest request = new ConvertRequest();
         request.setConvertType(0);
         request.setDataInput("XXI");
       
    	ResponseEntity<Response> response = this.restTemplate.postForEntity("http://localhost:" + port +"/convert/v1/convert/convert"
		  ,request,Response.class);
    	assertThat(response.getBody().getMessage()).isEqualTo("THE FIELD CONVERTTYPE YOU MUST ENTER A VALID VALUE");
		
    }


    
}
