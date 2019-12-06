package rebotstudio.hhsturim.service.impl;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import rebotstudio.hhsturim.entity.Customer;
import rebotstudio.hhsturim.entity.CustomerExample;
import rebotstudio.hhsturim.entity.User;
import rebotstudio.hhsturim.mapper.CustomerMapper;
import rebotstudio.hhsturim.mapper.UserMapper;
import rebotstudio.hhsturim.service.CustomerService;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class CustomerServiceimpl implements CustomerService {

   Logger logger=  LoggerFactory.getLogger(CustomerServiceimpl.class);


    @Resource
    private CustomerMapper customerMapper;

    @Resource
    private UserMapper userMapper;

    @Override
    public List getById(Integer id) {       //获取用户的所有客户


        CustomerExample example=new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(id);
        List<Customer> customers = customerMapper.selectByExample(example);

        List<User> list=new ArrayList();
        for(Customer x:customers){
            User user = userMapper.selectByPrimaryKey(x.getCustomerid());
            list.add(user);
        }

        return list;
    }

    @Override
    public void create(Integer userId, Integer customerId) {        //为用户添加一个客户
        Customer customer=new Customer();
        customer.setUid(userId);
        customer.setCustomerid(customerId);
        customerMapper.insert(customer);
    }

    @Override
    public void delete(Integer userId, Integer customerId) {        //为用户删除一个客户

        CustomerExample example=new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(userId);
        criteria.andCustomeridEqualTo(customerId);

        customerMapper.deleteByExample(example);

    }
}






