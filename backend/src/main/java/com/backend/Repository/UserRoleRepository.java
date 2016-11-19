package com.backend.Repository;

import com.backend.entity.security.UserRole;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by z00382545 on 11/19/16.
 */
@RepositoryRestResource(collectionResourceRel = "userRole", path = "userRole")
public interface UserRoleRepository extends MongoRepository<UserRole, String>{
}
