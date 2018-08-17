package mongodbjava;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class JavaMongoDb {
	public static void main(String[] args) {
		MongoClient newclient=new  MongoClient("localhost",27017);
		MongoDatabase newdb=newclient.getDatabase("emp");
		MongoCollection newcollection=newdb.getCollection("javatpoint");
		Document newdoc=new Document("name","rupa");
		newcollection.insertOne(newdoc);
	}

}
