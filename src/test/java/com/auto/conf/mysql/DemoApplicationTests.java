package com.auto.conf.mysql;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.auto.conf.mysql.dao.ColorsDao;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	ColorsDao colorsDao;

	@Test
	void testDataAccess() {
		try {			
			List<String> list = colorsDao.selectColors();
			list.forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
