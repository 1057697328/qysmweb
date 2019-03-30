package net.lightwing.mediweb;

import net.lightwing.mediweb.commons.Constant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MediwebApplication extends SpringBootServletInitializer implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(MediwebApplication.class, args);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

            registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
            registry.addResourceHandler("/admin/**").addResourceLocations("classpath:/templates/admin/");
            registry.addResourceHandler("/pictures/**").addResourceLocations("file:"+ Constant.UPLOADPATH);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MediwebApplication.class);
    }
}
