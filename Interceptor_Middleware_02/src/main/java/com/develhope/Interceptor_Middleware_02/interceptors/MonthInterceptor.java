package com.develhope.Interceptor_Middleware_02.interceptors;

import com.develhope.Interceptor_Middleware_02.entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


@Component
public class MonthInterceptor implements HandlerInterceptor {
Month month1= new Month(1L,1,"january","gennaio","Januar");
Month month2= new Month(2L,2,"february","febbraio","februar");
Month month3= new Month(3L,3,"march","marzo","marsch");
Month month4= new Month(4L,4,"april","aprile","april");
Month month5= new Month(5L,5,"may","maggio","mai");
Month month6= new Month(6L,6,"june","giugno","juni");
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String monthNumber = request.getHeader("monthNumber");
        if (monthNumber == null || monthNumber.isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Month number is required");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
