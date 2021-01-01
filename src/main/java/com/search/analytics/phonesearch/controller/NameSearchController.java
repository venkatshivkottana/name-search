package com.search.analytics.phonesearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.search.analytics.phonesearch.service.NameSearchService;

@RestController
public class NameSearchController {

	@Autowired
	NameSearchService nameSearchService;

	@RequestMapping("/search")
	public List<String> getAllNames(@RequestParam("data") String data) {
		return nameSearchService.getAllNames(data);
	}
}
