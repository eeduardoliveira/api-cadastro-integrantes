package com.banktech.apicadastrointegrantes.tenant;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@Deprecated
//public class TenantInterceptor extends HandlerInterceptorAdapter
    public class TenantInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception{
        String serverName = request.getServerName();
        String tenantId = serverName.substring(0, serverName.indexOf("."));
        request.setAttribute("unidade", tenantId);
        return true;
    }

}