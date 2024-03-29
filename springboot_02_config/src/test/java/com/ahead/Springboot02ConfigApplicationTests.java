package com.ahead;

import com.ahead.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02ConfigApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private ApplicationContext ioc;

    @Test
    public void testImportResource() {
        boolean isExist = ioc.containsBean("helloService2");
        System.out.println(isExist);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }



}

