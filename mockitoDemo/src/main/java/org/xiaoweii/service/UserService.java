package org.xiaoweii.service;


import org.springframework.stereotype.Service;
import org.xiaoweii.dao.UserRepository;
import org.xiaoweii.entity.User;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserById(Long id) {
        return userRepository.findUserById(id);
    }
}