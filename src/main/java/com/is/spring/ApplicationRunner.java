package com.is.spring;

import com.is.spring.database.pool.ConnectionPool;
import com.is.spring.database.repository.CompanyRepository;
import com.is.spring.database.repository.UserRepository;
import com.is.spring.ioc.Container;
import com.is.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(context.getBean("p1", ConnectionPool.class));

        var cp = context.getBean("p1", ConnectionPool.class);
       System.out.println(cp);
        //System.out.println(context.getBean("p1") + " \n" + context.getBean("p2"));
//        var container = new Container();

//        var connectionPool = new ConnectionPool();
//        var userRepository = new UserRepository(connectionPool);
//        var companyRepository = new CompanyRepository(connectionPool);
//        var userService = new UserService(userRepository, companyRepository);

//        var connectionPool = container.get(ConnectionPool.class);
//        var userRepository = container.get(UserRepository.class);
//        var companyRepository = container.get(CompanyRepository.class);

//        var userService = container.get(UserService.class);
        // TODO: 17.11.2021 userService

    }

}
