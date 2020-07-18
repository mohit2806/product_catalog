package com.product.service;

import com.product.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
