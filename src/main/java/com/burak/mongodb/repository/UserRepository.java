package com.burak.mongodb.repository;

import com.burak.mongodb.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, Integer> {
}
