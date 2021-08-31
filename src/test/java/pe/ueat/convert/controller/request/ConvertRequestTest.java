package pe.ueat.convert.controller.request;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ConvertRequestTest {

	@Test
    public void validateGetterSettet(){
		ConvertRequest convertRequest = new ConvertRequest();
		convertRequest.setConvertType(1);
		convertRequest.setDataInput("AXEL");
		assertThat( convertRequest.getConvertType() == 1 ) ;
		assertThat(convertRequest.getDataInput().equals("AXEL"));
	}
}
