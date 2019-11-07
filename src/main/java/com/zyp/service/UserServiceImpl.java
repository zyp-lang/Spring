package com.zyp.service;

import com.zyp.dao.UserDAO;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void regist() {
        userDAO.save();
        System.out.println("这里是UserServiceImpl类");
    }
}
