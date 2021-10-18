package com.scaffold.learn.api.entity;

import java.io.Serializable;

/**
 * @Author tianjl
 * @Date 2021/10/12 11:00
 * @Discription disc
 */
public class Entity implements Serializable {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
