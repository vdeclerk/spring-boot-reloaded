package com.v15k.springbootreloaded;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class WebApplicationInitializer extends SpringBootServletInitializer {


	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootReloadedApplication.class);
    }
}
