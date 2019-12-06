package rebotstudio.hhsturim.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    List getById(Integer id);   //获取用户的所有客户

    void create(Integer userId,Integer customerId);     //为用户添加一个客户

    void delete(Integer userId,Integer customerId);     //为用户删除一个客户

}

