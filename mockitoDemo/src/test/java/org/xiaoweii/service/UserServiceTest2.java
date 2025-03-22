package org.xiaoweii.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.xiaoweii.dao.UserRepository;
import org.xiaoweii.entity.User;


/**
 * @author xiaoweii
 * @create 2025-03-22 15:57
 */
@ExtendWith(MockitoExtension.class)
class UserServiceTest2 {

    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;

    @Test
    void findUserById() {
        User user = new User(1L, "fox", "221B");
        Mockito.when(userRepository.findUserById(1L)).thenReturn(user);
        assertEquals(user, userService.findUserById(1L));
    }
}