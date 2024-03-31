package com.busycoder.bookapp.config;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.busycoder.bookapp.filters.LogFilter;
//this class is used to bootstrap ur project
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	//root context scope
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses");
		return null;
	}

	//for servlet specific context 
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses");
		return new Class[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings");
		return new String[] {"/"};
		
	}

	@Override
	protected Filter[] getServletFilters() {
		return new Filter[] {new LogFilter()};
	}

	
}
