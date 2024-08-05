package com.patterns;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PatternsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testFactoryPattern() {
        com.patterns.factory.Client client = new com.patterns.factory.Client();
        client.execute();
	}

}
