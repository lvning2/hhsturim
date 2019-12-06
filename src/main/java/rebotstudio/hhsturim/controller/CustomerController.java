package rebotstudio.hhsturim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rebotstudio.hhsturim.entity.User;
import rebotstudio.hhsturim.service.CustomerService;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/list/{id}")
    public List<User> getById(@PathVariable Integer id){
        return customerService.getById(id);
    }

}
