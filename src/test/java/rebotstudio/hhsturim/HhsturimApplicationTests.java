package rebotstudio.hhsturim;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
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

    private UserMapper userMapper;

    @Test
    public void test(){

        UserExample example=new UserExample();
        UserExample.Criteria criteria = example.createCriteria();

        List<User> users = userMapper.selectByExample(example);
        System.out.println(users);

    }

}

