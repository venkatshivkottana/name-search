package com.search.analytics.phonesearch.controller;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.search.analytics.phonesearch.service.NameSearchService;

@WebMvcTest(value = NameSearchController.class)
public class NameSearchControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private NameSearchService nameSearchService;

	List<String> mockNames = (List<String>) Arrays.asList("ajeeth", "venkat", "rajan");

	@Test
	public void testNamesAPI() throws Exception {

		Mockito.when(nameSearchService.getAllNames(Mockito.anyString())).thenReturn(mockNames);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/names?input=a").accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		String expected = "[ajeeth,venkat,rajan]";
		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), JSONCompareMode.LENIENT);
	}
}