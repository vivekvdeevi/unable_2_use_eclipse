package com.gl.testing;


import java.sql.Connection;
import java.sql.DriverManager;
import java.io.File;

import javax.*;
//import disapp.generator.model.DisappType; // JAXB generated class


public class Test1 {
	public static void main(String[] args) {
		String jdbc="jdbc:mysql//localhost:3306/lpg";
		String user="root";
		String pass="R@@t1234";
	
		try {
			System.out.println("jdbc url "+jdbc);
			try (Connection myConn = DriverManager.getConnection(jdbc,user,pass)) {
			}
			System.out.println("Connection Success");
			
		}
		catch(Exception e) {
			System.out.println(" im here");
			e.printStackTrace();
		}
	}

}
