package org.xiaoweii.dao;


import org.springframework.stereotype.Repository;
import org.xiaoweii.entity.User;

@Repository
public interface UserRepository {

  User findUserById(Long id);

}