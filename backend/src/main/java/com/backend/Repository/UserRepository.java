package com.backend.Repository;

import com.backend.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by z00382545 on 11/17/16.
 */

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(@Param("username") String name);

    User findByEmail (@Param("email") String email);
}


