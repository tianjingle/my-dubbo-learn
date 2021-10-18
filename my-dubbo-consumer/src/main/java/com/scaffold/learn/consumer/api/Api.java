package com.scaffold.learn.consumer.api;

import com.scaffold.learn.api.ShowApi;
import com.scaffold.learn.api.entity.Entity;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tianjl
 * @Date 2021/10/14 13:08
 * @Discription disc
 */
@RestController
public class Api {

    @Reference
    private ShowApi showApi;

    @GetMapping(value = "/test")
    public String testDubbo(){
        Entity entity = showApi.show("tianjingle",1);
        System.out.println(entity.toString());
        return entity.toString();
    }
}
