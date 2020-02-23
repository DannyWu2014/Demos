package ng.demos;

import ng.demos.mongo.HelloDocService;
import ng.demos.redis.HelloRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Autowired
	private HelloRedisService helloRedisService;
	
	@Autowired
	private HelloDocService helloDocService;
	
	@Override
	public void run(String... args) throws Exception {
		helloDocService.insert();
		helloDocService.findAll();
		helloRedisService.get();
		helloRedisService.put();
	}
}
