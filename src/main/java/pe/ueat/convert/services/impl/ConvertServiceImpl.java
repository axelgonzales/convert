package pe.ueat.convert.services.impl;

import org.springframework.stereotype.Service;

import pe.ueat.convert.constant.Constant;
import pe.ueat.convert.controller.request.ConvertRequest;
import pe.ueat.convert.controller.response.Response;
import pe.ueat.convert.services.ConvertService;
import pe.ueat.convert.util.ConvertUtil;

@Service
public class ConvertServiceImpl implements ConvertService {

	@Override
	public Response convert(ConvertRequest convertRequest) {
		ConvertUtil convertUtil = new ConvertUtil();
		String msg = Constant.REG_INS_ACCEPTED;
		String converted  = "";
		switch (convertRequest.getConvertType()) {
		case 1:
			converted = convertUtil.convertRomanToInteger(convertRequest.getDataInput().trim()).toString();
			break;
		}
		
		return new Response(msg, converted);
	}


	



}
