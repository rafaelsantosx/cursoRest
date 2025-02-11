package br.ce.rafael.rest;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class OlaMundoTest {

	@Test
	public void testeOlaMundo() {
		Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola");	
		Assert.assertTrue(response.getBody().asString().equals("Ola Mundo!"));
		Assert.assertTrue(response.statusCode() == 200);
		Assert.assertTrue("O status code deveria ser 200", response.statusCode() == 200);
		ValidatableResponse validacao = response.then();
		validacao.statusCode(200);
		
	}
	@Test
	public void testeOlaMundo2() {
		Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola");	
		Assert.assertTrue(response.statusCode() == 200);
		Assert.assertEquals(200, response.getStatusCode());
		}
	
	@Test
	public void testeOlaMundo3() {
		Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola");	
		Assert.assertTrue(response.getBody().asString().equals("Ola Mundo!"));
		
		}
	
	@Test
	public void devoConhecerOutrasFormasRestAssured() {
		RestAssured.get("http://restapi.wcaquino.me/ola").then().statusCode(201);
		
	}
	
	
}

