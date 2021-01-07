package com.search.analytics.phonesearch.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.search.analytics.phonesearch.service.NameSearchService;


@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class NameSearchController {

	@Autowired
	NameSearchService nameSearchService;
	
	Logger logger = LoggerFactory.getLogger(NameSearchController.class);
	
	@RequestMapping("/names")
	public List<String> getAllNames(@RequestParam("input") String data) {
		logger.trace("Accessed controller");
		return nameSearchService.getAllNames(data);
	}
}
