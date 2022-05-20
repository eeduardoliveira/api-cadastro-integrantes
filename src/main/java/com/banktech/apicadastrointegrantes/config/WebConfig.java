package com.banktech.apicadastrointegrantes.config;

import com.banktech.apicadastrointegrantes.tenant.TenantInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {

    @Deprecated
    @Override public void addInterceptors(InterceptorRegistry registry){ registry.addInterceptor(new TenantInterceptor());}
}
