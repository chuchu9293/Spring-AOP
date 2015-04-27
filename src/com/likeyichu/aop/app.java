package com.likeyichu.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext ctx ;
		ctx=new ClassPathXmlApplicationContext("com/likeyichu/aop/beans.xml");
		Performer performer=ctx.getBean("performer", Performer.class);
		performer.perform();
	
	}
}
/*the audience is taking seats
the performer is performing
clap clap 
*/