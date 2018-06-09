package com.rb.oauth.service.impl;

import com.rb.oauth.model.User;
import com.rb.oauth.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xujiping
 * @date 2018/6/8 17:01
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }

    @Override
    public void changePassword(Long userId, String newPassword) {

    }

    @Override
    public User findOne(Long userId) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }
}
