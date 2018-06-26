package com.meyj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by MeYJ on 2018/6/20.
 */
@RestController
public class TableController {

    @RequestMapping("/tableData")
    public Map<String, Object> getTableData(Integer page, Integer limit) {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("msg", "ok");
        result.put("count", "1000");

        List<UserEntity> data = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            UserEntity userEntity = new UserEntity();
            userEntity.setId(10000L + i + limit * (page - 1));
            userEntity.setUsername("user-" + (i + limit * (page - 1)));
            if (i % 2 == 0) {
                userEntity.setSex("女");
            } else {
                userEntity.setSex("男");
            }
            userEntity.setCity("城市-" + (i + limit * (page - 1)));
            userEntity.setSign("签名-" + (i + limit * (page - 1)));
            userEntity.setExperience(new Random(100000L).nextInt());
            userEntity.setLogins(new Random(100000L).nextInt());
            userEntity.setWealth(new Random(100000L).nextLong());
            userEntity.setClassify("");
            userEntity.setScore(new Random(100).nextInt());
            data.add(userEntity);
        }
        result.put("data", data);

        return result;
    }


}
