package org.opendevup.web;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping(value="/api")
public class AthleteCtrl {
	RestTemplate restTemplate = new RestTemplate();
	@Value("${tasks2}")
	private String ApiUrl;
	@RequestMapping(value="/employee", method = RequestMethod.GET)
	 /*@RequestMapping(value = "/getProduct/{id}",method=RequestMethod.GET)*/
	public String getProduct() {
		 
		
	     String response = restTemplate.getForObject(
	    		ApiUrl,String.class );
	    return response;
	    		  
	   }
	
	
}
