package com.search.analytics.phonesearch.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.search.analytics.phonesearch.dao.NameSearchDao;

@Service
public class NameSearchService {

	public List<String> getAllNames(final String input) {
		return NameSearchDao.getAllNames(input);
	}
}
