package com.rezahdrm.structural.proxy;

import org.apache.log4j.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class LoggerProxy implements InvocationHandler {
    private final PersonDAO personDAO;
    private final Logger logger;

    public LoggerProxy(PersonDAO personDAO) {
        this.personDAO = personDAO;
        logger = Logger.getLogger(LoggerProxy.class);
    }

    public static PersonDAO createLoggerProxy(PersonDAO dao) {
        return (PersonDAO) Proxy.newProxyInstance(
                dao.getClass().getClassLoader(),
                dao.getClass().getInterfaces(),
                new LoggerProxy(dao));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logger.info("this " + method.getName() + "method is calling now");
        method.invoke(personDAO, args);
        logger.info("this " + method.getName() + " method calle finished now");
        return null;
    }
}
