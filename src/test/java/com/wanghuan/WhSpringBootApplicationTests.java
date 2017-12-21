package com.wanghuan;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhSpringBootApplicationTests {

	@Test
	public void contextLoads() {
		Map map = new HashMap<String,String>();
		if(map.get("test") != null) {
			System.out.println("This is not null.");
		}else {
			System.out.println("This is null.");
		}
	}

}
