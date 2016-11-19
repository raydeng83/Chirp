package com.backend.entity.security;


import com.backend.entity.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by z00382545 on 10/20/16.
 */

@Document
public class UserRole {
    @Id
    private String id;

    public UserRole(User user, Role role) {
        this.user = user;
        this.role = role;
    }

    @DBRef
    private User user;

    @DBRef
    private Role role;

    public UserRole() {}

    public String getUserRoleId() {
        return id;
    }

    public void setUserRoleId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


}
