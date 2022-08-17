package com.org.tav.spring.autowired;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        Employee emp=context.getBean(Employee.class);
        Passport p=new Passport();
        p.setPassNum(123456);
        p.setDateofIssue(new Date(2001,4,6));
		p.setDateofExpiry(new Date(2004,27,2));
        emp.setEmpId(12);
        emp.setEmpName("shivamm");
        System.out.println(emp.toString());
    }
}
