package spotify.projeto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Getatrack {

	
	@Test
	public void   getaTrack() {
		
		RequestSpecification request = RestAssured.given().auth().preemptive().oauth2("BQBjXtDVFCjsJaXwBCHqL-ZlqhQu0_lZAyCIWJaK25kwGgk4xd5qjkzk7SoeSYl2lBcL2A6nIbuUjQJdOvrFqMoeXObE_uFC-f0vjPEMYdNAnvStCdSdtT3if8d-kuPs4NwkbRVEeCqQvmI");

		request.header("Content-Type","aplication/json");
		Response response = RestAssured.get("https://api.spotify.com/v1/tracks/6rqhFgbbKwnb9MLmUQDhG6?limits=1");
		System.out.println(response.asPrettyString());
		System.out.println("");
		System.out.println("status code " + response.getStatusCode() );
		int code = response.getStatusCode();
		assertEquals (200,code);
		
	}
	@Test
	public void getaAlbum() {
		RequestSpecification request = RestAssured.given() .auth().preemptive().oauth2("BQApsGl3nlhQZHRguc4tlGPtfLaMMAIkOtTototbLn7EgLE34sOD8K_h6UkQokZ9OFF0qdiMTaZDga6qVuZ17dxWY_kOQ5Fbj9I-__vAIwHtAcrGjof2eGN9Ns1Ff7ghKaIn5YRdcOv4jE4");

		request.header("Authorization","Bearer ","Content-Type","aplication/json");
		Response response = RestAssured.get("https://api.spotify.com/v1/albums/0JKlc3z8LMvYXvAvCv1EzG");
		System.out.println(response.asPrettyString());
		System.out.println("");
		System.out.println("status code " + response.getStatusCode() );
		int code = response.getStatusCode();
		assertEquals (200,code);
		
		
	}
	
	@Test
	public void getaSeveraltracks() {
		RequestSpecification request = RestAssured.given().auth().preemptive().oauth2("BQA2mdQtcYV3wZ7JX9h9PsED0BH7pkSrp3k_wOOHRA5oA_XZPObNJHPGefkgLh27beRuLiq5VwSOR0mTrNsB3VFltseuWQievFYHHgqfK8hujUPJ-y1TzVVTyMc2P0L4JMK2JG5CM7vKkmI");

		request.header("Content-Type","aplication/json");
		Response response = RestAssured.get("https://api.spotify.com/v1/tracks/1qoRqpfQdPf0SftHDo7w4o?si=6bdb5fdd39a2412f&nd=1,1nO67wic65N413c11zKxM7?si=a2e65a9d53bd4305,3B7i9OKRRmIsSBHEbJz58Y?si=8b7771d6d7a146cf&nd=1,2a5LTDKA47NHGAAAbYMyfV?si=c98a040a7de842a2,13X42np3KJr0o2LkK1MG76?si=f5bebb494a724d27&limits=5");
		System.out.println(response.asPrettyString());
		System.out.println("");
		System.out.println("status code " + response.getStatusCode() );
		int code = response.getStatusCode();
		assertEquals (200,code);
		
		
		
		
	}
	
	}


