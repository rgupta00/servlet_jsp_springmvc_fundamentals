package com.busycoder;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SCL implements ServletContextListener {

	private Dog dog=null;
    public void contextInitialized(ServletContextEvent sce)  { 
    	dog=new Dog();
    	dog.setDogName("stonish");
    	
        System.out.println("contextInitialized");
        sce.getServletContext().setAttribute("dog", dog);
        
        
    }
	
    public void contextDestroyed(ServletContextEvent sce)  { 
        System.out.println("contextDestroyed");
        sce.getServletContext().removeAttribute("dog");
   }

}
