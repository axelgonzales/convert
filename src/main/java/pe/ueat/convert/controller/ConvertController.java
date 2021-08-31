package pe.ueat.convert.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import pe.ueat.convert.controller.request.ConvertRequest;
import pe.ueat.convert.controller.response.Response;
import pe.ueat.convert.services.ConvertService;


@RestController
@RequestMapping(value = "v1/convert")
@Api(value = "Convert Controller", produces = "application/json", tags = { "Convert Controller" })
public class ConvertController {
	
 	@Autowired
    private ConvertService convertService;
    
    @ApiOperation(value = "Convert Data", tags = { "Convert Controller" })
    @PostMapping(path = "convert" , consumes = {"application/json"})
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Data convert", response = Response.class),
			@ApiResponse(code = 404, message = "Not Found"),
			})
    public ResponseEntity<Response> convertData(
    		@Valid @RequestBody ConvertRequest convertRequest
    	    ){
    	return ResponseEntity.ok(this.convertService.convert(convertRequest));
    }
}
