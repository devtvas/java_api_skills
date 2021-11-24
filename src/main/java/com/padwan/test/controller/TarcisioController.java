package com.padwan.test.controller;

import com.padwan.test.dto.GenericoDTO;
import com.padwan.test.service.TarcisioService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/tarcisio")
public class TarcisioController {

	private TarcisioService tarcisioService;
	
	@Autowired
	public TarcisioController(TarcisioService tarcisioService) {
		// TODO Auto-generated constructor stub
		this.tarcisioService = tarcisioService;
	}
	
	@ResponseBody
	@RequestMapping(value = "/skills", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> skills(){
		try {
			JSONObject json = new JSONObject();
			json.put("DEV_TVAS", tarcisioService.skills());
			return new ResponseEntity(json.toString(), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			  return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
