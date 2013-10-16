package com.github.springmvc;

import java.io.File;

import javax.servlet.ServletException;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AppStartup {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(AppStartup.class);

    public static void main(String[] args) {
        LOGGER.info("Tomcat Server is starting");
        final long startTime = System.currentTimeMillis();
        try
       
        {
            final Tomcat tomcat = new Tomcat();
            final String appBase = (new File("./src/main/webapp")).getAbsolutePath();
            tomcat.setPort(8080);
            tomcat.setBaseDir("target");
            tomcat.getHost().setAppBase(appBase);
            tomcat.addWebapp("/springmvc-sample", appBase);
            tomcat.start();
            LOGGER.info("Tomcat Server started in " + (System.currentTimeMillis() - startTime) + " ms");
            tomcat.getServer().await();
 
        }
        catch (LifecycleException exception)
        {
            LOGGER.error("exception=" + exception);
 
        }
        catch (ServletException exception)
        {
            LOGGER.error("exception=" + exception);
        }
 
    }
}
