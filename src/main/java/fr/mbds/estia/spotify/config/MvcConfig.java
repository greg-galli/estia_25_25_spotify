package fr.mbds.estia.spotify.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");

        registry
                .addResourceHandler("/templates/**")
                .addResourceLocations("classpath:/templates/");

        // Add WebJars for AdminLTE
        registry.addResourceHandler("/adminlte/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/AdminLTE/3.2.0/")
                .setCacheControl(CacheControl.maxAge(30, TimeUnit.DAYS));
    }
}