package com.search.analytics.phonesearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.search.analytics.phonesearch.service.NameSearchService;

@CrossOrigin("*")
@RestController
public class NameSearchController {

	@Autowired
	NameSearchService nameSearchService;

	@RequestMapping("/names")
	public List<String> getAllNames(@RequestParam("input") String data) {
		return nameSearchService.getAllNames(data);
	}
}
