package com.accenture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
    	Guesser g = context.getBean("guesser",Guesser.class);
    	Player p1 = context.getBean("player",Player.class);
    	Player p2 = context.getBean("player",Player.class);
    	Player p3 = context.getBean("player",Player.class);

    	Umpire u = context.getBean("umpire",Umpire.class);

    	System.out.println("Hello");    
		
		p1.guessNum();
		p2.guessNum();
		p3.guessNum();
		g.guessNum();
		
		System.out.println(p1.pnum);
		System.out.println(p2.pnum);
		System.out.println(p3.pnum);
		System.out.println(g.gnum);
		
		u.compare(g.gnum, p1.pnum);
		u.compare(g.gnum, p2.pnum);
		u.compare(g.gnum, p3.pnum);


    }
}
