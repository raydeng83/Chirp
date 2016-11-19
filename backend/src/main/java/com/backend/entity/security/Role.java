package com.backend.entity.security;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by z00382545 on 10/20/16.
 */

@Document
public class Role {
    @Id
    private String id;

    private String name;

    private Set<UserRole> userRoles = new HashSet<>();

    public Role() {

    }

    public String getRoleId() {
        return id;
    }

    public void setRoleId(int roleId) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }


}
