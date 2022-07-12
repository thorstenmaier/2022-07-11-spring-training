package com.trivadis.spring.user.service;

public class LogServiceImpl implements LogService {

	@Override
	public void log(String message) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(message);
	}

}
