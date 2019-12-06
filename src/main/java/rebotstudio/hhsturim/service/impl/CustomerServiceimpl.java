package rebotstudio.hhsturim.service.impl;

import org.springframework.stereotype.Service;
import rebotstudio.hhsturim.service.CustomerService;

import java.util.List;

@Service
public class CustomerServiceimpl implements CustomerService {



    @Override
    public List getById(Integer id) {       //获取用户的所有客户
        return null;
    }

    @Override
    public void create(Integer userId, Integer customerId) {

    }

    @Override
    public void delete(Integer userId, Integer customerId) {

    }
}
