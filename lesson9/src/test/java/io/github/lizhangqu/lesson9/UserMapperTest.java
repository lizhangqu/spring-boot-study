package io.github.lizhangqu.lesson9;

import io.github.lizhangqu.lesson9.mapper.UserMapper;
import io.github.lizhangqu.lesson9.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by lizhangqu on 2017/7/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() throws Exception {
        userMapper.insert(new User("aa", 19));
        userMapper.insert(new User("bb", 23));
        userMapper.insert(new User("cc", 28));
        Assert.assertEquals(3, userMapper.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<User> users = userMapper.getAll();
        System.out.println(users.toString());
    }

    @Test
    public void testUpdate() throws Exception {
        User user = userMapper.getOne(3L);
        System.out.println(user.toString());
        user.setUserName("neo");
        userMapper.update(user);
        Assert.assertTrue(("neo".equals(userMapper.getOne(3L).getUserName())));
    }
}