package com.spring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class prod
{
    public static void main( String[] args )
    {
        System.out.println( "Scopes!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("product.xml");
		
        System.out.println("---singleton---");
        Product p =(Product)context.getBean("product1");
		p.setId(1);
		p.setName("krithiga");
		System.out.println(p);
		
		Product ps =(Product)context.getBean("product1");		
		System.out.println(ps);
		
		System.out.println("---prototype---");
		Product pro =(Product)context.getBean("product2");
		pro.setId(2);
		pro.setName("divya");
		System.out.println(pro);
		
		Product pro1 =(Product)context.getBean("product2");
		System.out.println(pro1);
		
    }
}
