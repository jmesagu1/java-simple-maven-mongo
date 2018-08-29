package test;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MyMain {

    public static void main(String[] args) {


        MongoClient mongoClient = MongoClients.create();

        System.out.println("Connected! :" + mongoClient.toString());

    }
}
