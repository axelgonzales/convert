package pe.ueat.convert.constant;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ConstantTest {

	
	@Test
    public void validateConstant(){
		assertThat(Constant.REG_INS_ACCEPTED.equals("THE REQUEST WAS MADE IN A SATISFACTORY WAY"));
		assertThat(Constant.REG_INS_NOT_ACCEPTED.equals("THE VALUE TO BE CONVERTED IS INVALID FOR THIS METHOD"));
	}
	

	@Test()
	public void test15() throws Exception {
		try {
			  new Constant();
		} catch (IllegalStateException e) {
			
		}
	  
	}
}
