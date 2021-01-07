package com.search.analytics.phonesearch.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NameSearchDao {

	private static final List<String> names;
	
	static Logger logger = LoggerFactory.getLogger(NameSearchDao.class);

	static {
		names = new ArrayList<>();
		names.add("Venkat");
		names.add("Rajan Singh");
		names.add("Sudheesh Nair");
		names.add("Ajeeth Singh");
		names.add("Radha");
		names.add("Vardi");
		names.add("Victor");
	}

	public static List<String> getAllNames(final String input) {
		logger.trace("Accessed dao");
		return names.stream().filter(s -> s.toLowerCase().contains(input.toLowerCase())).collect(Collectors.toList());
	}
}
