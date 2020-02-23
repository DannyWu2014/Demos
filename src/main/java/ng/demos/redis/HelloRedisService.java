package ng.demos.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloRedisService {
	
	private final StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	public HelloRedisService(StringRedisTemplate template) {
		this.stringRedisTemplate = template;
	}
	
	private final String hello = "hello";
	
	public void put() {
		stringRedisTemplate.opsForValue().set(hello, "redis");
	}
	
	
	public void get() {
		String result = stringRedisTemplate.opsForValue().get(hello);
		System.out.println("-----");
		System.out.println(result);
		System.out.println("-----");
	}
}
