package com.app.main;

import java.util.List;

import com.app.ioreframed.InputOutput;
import com.mongodb.DB;
import com.mongodb.MongoClient;

public class TestMain {
	public static void main(String args[]) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		List<String> dbs = mongo.getDatabaseNames();
		System.out.println(dbs);
		mongo.close();
		InputOutput io = new InputOutput();
		System.out.println("Hello");
		io.print(15);
	}

}
