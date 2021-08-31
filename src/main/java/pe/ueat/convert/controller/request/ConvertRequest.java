package pe.ueat.convert.controller.request;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;
import pe.ueat.convert.constant.Constant;

@Setter
@Getter
public class ConvertRequest {

	@Valid
	@NotNull(message = "dataType cannot be null")
	@Min(value = 1, message = "You must enter a valid value")
    @Max(value = 1, message = "You must enter a valid value")
	@ApiParam(value = "Default value for note", required = true, defaultValue = "1")
	private Integer convertType;
	
	@NotNull(message = "dataInput cannot be null")
	@NotEmpty
	@Pattern(regexp = "(^(?=[MDCLXVI])M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$)"
	, message = Constant.REG_INS_NOT_ACCEPTED)

			   

	private String dataInput;
	
}
