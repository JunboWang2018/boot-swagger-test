package com.test.wjb.pojo.person;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Wang Junbo
 * @description
 * @date 2020/1/15
 */
@ApiModel("人员")
public class Person {
    @ApiModelProperty("人员姓名")
    private String name;
    @ApiModelProperty("年龄")
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
}
