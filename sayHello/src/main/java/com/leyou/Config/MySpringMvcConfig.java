package com.leyou.Config;

import com.leyou.Intercepter.MyIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MySpringMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyIntercepter()).addPathPatterns("/user/**").excludePathPatterns("/user/hello1");
    }
}
