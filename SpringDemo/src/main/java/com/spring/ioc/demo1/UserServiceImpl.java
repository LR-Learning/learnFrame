package com.spring.ioc.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 18:34 2018/7/6
 * @Modified By:
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void save() {
        userDao.save();
    }
}
