package ng.demos.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloDocService {
	
	private MongoTemplate mongoTemplate;
	
	@Autowired
	public HelloDocService(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	public void insert() {
		HelloDocument hello = new HelloDocument();
		hello.setName("hey");
		hello.setValue("mongo");
		mongoTemplate.insert(hello);
	}
	
	
	public List<HelloDocument> findAll() {
		return mongoTemplate.findAll(HelloDocument.class);
	}
}
