package com.backend.crud.repository;

import com.backend.crud.model.User;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
public interface UserRepository extends MongoRepository<User, Long> {
}
