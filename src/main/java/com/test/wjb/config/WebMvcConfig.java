package com.test.wjb.config;

import com.test.wjb.interceptor.TestIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Wang Junbo
 * @description
 * @date 2020/1/15
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TestIntercepter()).addPathPatterns().addPathPatterns("/**")
                .excludePathPatterns("swagger-ui.html")
                .excludePathPatterns("static/css/**")
                .excludePathPatterns("static/js/**")
                .excludePathPatterns("swagger-resources")
                .excludePathPatterns("/**/error")
                .excludePathPatterns("v2/api-docs");
    }
}
