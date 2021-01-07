package com.search.analytics.phonesearch.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.search.analytics.phonesearch.dao.NameSearchDao;

@Service
public class NameSearchService {
	
	Logger logger = LoggerFactory.getLogger(NameSearchService.class);
	
	public List<String> getAllNames(final String input) {
		logger.trace("Accessed service");
		return NameSearchDao.getAllNames(input);
	}
}
