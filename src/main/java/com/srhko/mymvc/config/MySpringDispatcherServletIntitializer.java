package com.srhko.mymvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringDispatcherServletIntitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
