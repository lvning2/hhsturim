package rebotstudio.hhsturim.service;

import org.springframework.stereotype.Service;
import rebotstudio.hhsturim.entity.User;

@Service
public interface LoginServie {

    User login(String username);    //登录,根据用户名获取用户信息

    User getById(Integer id);     //根据用户id获取用户信息

    void updateUser(User user);     //更改用户信息

    void createUser(User user);     //注册,创建一个用户

}


