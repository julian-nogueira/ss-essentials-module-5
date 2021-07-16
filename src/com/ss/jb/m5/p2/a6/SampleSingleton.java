package com.ss.jb.m5.p2.a6;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SampleSingleton {

	private static Connection conn = null;
	private static SampleSingleton instance;
	
	public static Integer instanceCount = 0;
	public static Integer callCount = 0;
	
	private SampleSingleton() {}
	
	public static SampleSingleton getInstance() {
		callCount++;
		if(instance == null) {
			synchronized (SampleSingleton.class) {
				if(instance == null) {
					instance = new SampleSingleton();
					// Do something with conn.
					instanceCount++;
				}
			}
		}
		return instance;
	}
	
	public static Connection getConn() {
		return conn;
	}
}
