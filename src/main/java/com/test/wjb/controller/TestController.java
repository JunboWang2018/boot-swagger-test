package com.test.wjb.controller;

import com.test.wjb.pojo.person.Person;
import com.test.wjb.pojo.resp.APIRespJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wang Junbo
 * @description
 * @date 2020/1/15
 */
@RestController
@Api(value = "测试", description = "测试用", tags = {"测试"})
public class TestController {

    @RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation("测试接口1")
    public APIRespJson test() {
        Person person = new Person();
        person.setName("aaaa");
        person.setAge(10);
        return new APIRespJson().setData(person);
    }
}
