package pe.ueat.convert.controller.response;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ResponseTest {

	@Test
    public void validateGetterSettet(){
		Response response = new Response();
		response.setConverted("24");
		response.setMessage("SUCCESS");
		assertThat( response.getConverted().equals("24") ) ;
		assertThat(response.getMessage().equals("SUCCESS"));
	}
}
