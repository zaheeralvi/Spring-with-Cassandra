package com.example.cassandra.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.cassandra.modal.User;

public interface UserRepository extends CassandraRepository<User, Integer>{

}
