package com.liupeiqing.kafka.consumer.module;

import java.io.Serializable;

/**
 * @author liupeqing
 * @date 2019/2/22 10:17
 */
public class User implements Serializable {
    private String name;
    private String dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
