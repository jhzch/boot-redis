package com.redis;

import com.redis.utils.RedisUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
class BootRedisApplicationTests {
    @Autowired
    private RedisUtils redisUtils;

    @Test
    void contextLoads() {
        redisUtils.set("name","cute_woman");
        Map<String,Object> map = new HashMap<>();
        map.put("name","zly");
        map.put("age",30);
        map.put("sex","0");
        redisUtils.hmset("user_01",map,0);
    }


}
