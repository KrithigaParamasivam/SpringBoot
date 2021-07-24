package com.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Emp 
{
    public static void main( String[] args )
    {
        System.out.println( "Employee Details!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("emp.xml");
		Employee e1=(Employee)context.getBean("emp1");
		System.out.println(e1);
		
		Employee e2=context.getBean("emp2",Employee.class);
		System.out.println(e2);
		
		Employee e3=(Employee)context.getBean("emp3");
		System.out.println(e3);
		
		Employee a=(Employee)context.getBean("id1");
		a.show();
		Employee b=(Employee)context.getBean("id2");
		b.show();
		
		Employee dept=(Employee)context.getBean("emp1");
		System.out.println(dept.getDepartment().getdName());
		
	
		
		((AbstractApplicationContext) context).close();
		
    }
}
