package com.example.demo;

import com.example.demo.dao.UserMapper;
import com.example.demo.dao.model.User;
import com.example.demo.dao.model.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataTestApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
        User user = userMapper.selectByPrimaryKey(8);
        System.out.println(user);

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAgeEqualTo(25);
        List<User> users = userMapper.selectByExample(userExample);
        System.out.println(users);
    }

}
