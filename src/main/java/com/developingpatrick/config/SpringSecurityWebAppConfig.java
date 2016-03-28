package com.developingpatrick.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import static com.stormpath.spring.config.StormpathWebSecurityConfigurer.stormpath;

/**
 * Created by patrick on 3/25/16.
 */
@Configuration
public class SpringSecurityWebAppConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.apply(stormpath()).and()
        .authorizeRequests()
        .antMatchers("/").permitAll();
    }
}
