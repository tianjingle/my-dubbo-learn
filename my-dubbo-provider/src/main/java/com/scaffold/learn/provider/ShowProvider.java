package com.scaffold.learn.provider;


import com.scaffold.learn.api.ShowApi;
import com.scaffold.learn.api.entity.Entity;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author tianjl
 * @Date 2021/10/12 11:04
 * @Discription disc
 */
@Service
public class ShowProvider implements ShowApi {
    @Override
    public Entity show(String name, int age) {
        System.out.println("request\tname="+name+"\tage="+age);
        Entity entity=new Entity();
        entity.setName("dubbo-"+name);
        entity.setAge(age+1);
        return entity;
    }
}
