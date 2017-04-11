package com.verma.wsController;

import javax.ws.rs.Consumes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import antlr.collections.List;

@Controller
public class ConsumesWS {
	
	@RequestMapping("/lestfriends")
	@Consumes("application/xml")
	public void getAllFriends(){
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:9066/hello/world";
		Object lhm = restTemplate.getForObject(url, Object.class);
				System.out.println(lhm);
		return;
	}
	

}
