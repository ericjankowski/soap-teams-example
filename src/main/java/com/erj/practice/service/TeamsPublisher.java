package com.erj.practice.service;

import javax.xml.ws.Endpoint;

public class TeamsPublisher {
	public static void main(String [] args){
		int port = 6189;
		String url = "http://localhost:" + port + "/teams";
		System.out.println("Publishing...");
		Endpoint.publish(url, new Teams());
	}
}
