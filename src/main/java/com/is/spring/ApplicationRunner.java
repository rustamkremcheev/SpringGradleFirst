package com.is.spring;

import com.is.spring.database.pool.ConnectionPool;
import com.is.spring.database.repository.CompanyRepository;
import com.is.spring.database.repository.UserRepository;
import com.is.spring.ioc.Container;
import com.is.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(context.getBean("p1", ConnectionPool.class));

       ConnectionPool cp = context.getBean("p1", ConnectionPool.class);
       System.out.println(cp);
        //System.out.println(context.getBean("p1") + " \n" + context.getBean("p2"));
//        Container container = new Container();

//        ConnectionPool connectionPool = new ConnectionPool();
//        UserRepository userRepository = new UserRepository(connectionPool);
//        CompanyRepository companyRepository = new CompanyRepository(connectionPool);
//        UserService userService = new UserService(userRepository, companyRepository);

//        ConnectionPool connectionPool = container.get(ConnectionPool.class);
//        UserRepository userRepository = container.get(UserRepository.class);
//        CompanyRepository companyRepository = container.get(CompanyRepository.class);

//        UserService userService = container.get(UserService.class);
        // TODO: 17.11.2021 userService

    }

}
