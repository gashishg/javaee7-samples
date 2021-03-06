package org.javaee7.cdi.nobeans.el.injection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * @author Arun Gupta
 */
@Named
@RequestScoped
public class ScopedBean {
    public String sayHello() {
        return "Hello there!";
    }
}
