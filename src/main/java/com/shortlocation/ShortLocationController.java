package com.shortlocation;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShortLocationController {


	@Autowired
	MongoTemplate mongoTemplate;

	@RequestMapping(value = "/api/v1/shortUrl", method = RequestMethod.GET)
	public ResponseEntity<String> shortUrl(@RequestParam(value = "lat") String lat,
			@RequestParam(value = "lng") String lng) {

		RestTemplate restTemplate = new RestTemplate();

		ShortUrl shortUrl = new ShortUrl();
		shortUrl.setLongUrl("https://www.google.co.in/maps/search/"+lat+"+"+lng);
		ShortUrl result = restTemplate.postForObject(
				"https://www.googleapis.com/urlshortener/v1/url?key=AIzaSyBHr966O8mjWt5M5Buc2N4LMes7_hZGVqI", shortUrl,
				ShortUrl.class);

		return new ResponseEntity<String>(result.getId(), HttpStatus.OK);

	}

}
