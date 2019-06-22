package com.springdemo.demo;

import com.springdemo.demo.modle.User;
import com.springdemo.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    private UserService userService;
    @Autowired
    RedisTemplate<Object, User> template;

    @Test
    public void contextLoads() {
        stringRedisTemplate.opsForValue().append("myString","test");
    }

    @Test
    public void textMyRedisTemplate() {
        User user = userService.getUserInfoByUid(1);
        System.out.println(user);
        template.opsForValue().set("user01",user);
        System.out.println("存入redis成功");

    }

}
