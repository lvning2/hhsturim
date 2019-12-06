package rebotstudio.hhsturim;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import rebotstudio.hhsturim.entity.Customer;
import rebotstudio.hhsturim.entity.User;
import rebotstudio.hhsturim.entity.UserExample;
import rebotstudio.hhsturim.mapper.UserMapper;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
class HhsturimApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private DataSource dataSource;

    @Test
    public void dataSourceTest(){
        System.out.println(dataSource);

    }
    @Resource
    private UserMapper userMapper;

    @Test
    public void test(){

        List<Customer> customers = userMapper.get(1001);
        System.out.println(customers);

    }

}

