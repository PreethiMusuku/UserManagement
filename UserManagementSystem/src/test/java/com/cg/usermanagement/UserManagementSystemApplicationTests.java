package com.cg.usermanagement;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import junit.framework.Assert;

@SpringBootTest
public class UserManagementSystemApplicationTests {
	@SuppressWarnings("deprecation")
	
		@Test
		public void testUserManagementDeleteSuccess() throws URISyntaxException {
			RestTemplate restTemplate = new RestTemplate();
			final String baseUrl = "http://localhost:7611/UserManagement/deleteuser/325";// Enter present id
			URI uri = new URI(baseUrl);
			ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.DELETE, null, String.class);
			Assert.assertEquals(200, result.getStatusCodeValue());
		}

	}
