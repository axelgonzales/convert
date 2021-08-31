package pe.ueat.convert.controller.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Response {
	
	@JsonInclude(Include.NON_EMPTY)
	private String converted;
	
	private String message;
	

	
	public Response(String message) {
		this.message = message;
	}
	

	public Response(String message, String converted) {
		this.message = message;
		this.converted = converted;
	}
	
	public Response() {
	}

	

}
