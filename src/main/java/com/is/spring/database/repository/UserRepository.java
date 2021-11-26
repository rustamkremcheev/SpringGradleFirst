package com.is.spring.database.repository;

import com.is.spring.database.pool.ConnectionPool;

public class UserRepository {

   private final ConnectionPool connectionPool;

    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
