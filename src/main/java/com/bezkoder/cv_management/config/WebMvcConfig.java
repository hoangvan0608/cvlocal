package com.bezkoder.cv_management.config;

import com.bezkoder.cv_management.Utils.FileUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/api/cv-file/**")
                .addResourceLocations("file:/" + FileUtils.PATH_CVURL);
    }
}
