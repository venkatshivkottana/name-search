package com.search.analytics.phonesearch.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameSearchDao {

	private static final List<String> names;

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
		return names.stream().filter(s -> s.toLowerCase().contains(input.toLowerCase())).collect(Collectors.toList());
	}
}
