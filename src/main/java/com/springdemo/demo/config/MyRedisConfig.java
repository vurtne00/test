package com.springdemo.demo.config;

import com.springdemo.demo.modle.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.net.UnknownHostException;

@Configuration
public class MyRedisConfig {

    @Bean
    public RedisTemplate<Object,User> redisTemplate(
            RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
        RedisTemplate<Object, User> template = new RedisTemplate<Object, User>();
        template.setConnectionFactory(redisConnectionFactory);
        Jackson2JsonRedisSerializer<User> jrs = new Jackson2JsonRedisSerializer<User>(User.class);
        template.setDefaultSerializer(jrs);
        return template;
    }
}
