package com.backend.Repository;

import com.backend.entity.security.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by z00382545 on 11/19/16.
 */
public interface RoleRepository extends MongoRepository<Role, String> {
}
