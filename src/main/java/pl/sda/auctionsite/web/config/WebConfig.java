package pl.sda.auctionsite.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    ViewResolver jspViewResolver() {
        InternalResourceViewResolver internalResourceViewResolver =
                new InternalResourceViewResolver("/WEB-INF/jsp/", ".jsp");
        return internalResourceViewResolver;
    }

}