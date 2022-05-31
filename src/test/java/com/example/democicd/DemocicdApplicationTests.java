package com.example.democicd;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemocicdApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(DemocicdApplication.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing ...");
		assertEquals(true, true);
	}

}
