package pe.ueat.convert.services;

import pe.ueat.convert.controller.request.ConvertRequest;
import pe.ueat.convert.controller.response.Response;

public interface ConvertService {

	Response convert(ConvertRequest emailRequest );
	
}
