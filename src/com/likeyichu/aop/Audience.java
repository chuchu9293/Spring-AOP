package com.likeyichu.aop;
import java.util.concurrent.TimeUnit;
import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	//表演之前要坐下
	public void takeSeats(){
		System.out.println("the audience is taking seats");
	}
	//表演成功，故障
	public void applause(){
		System.out.println("clap clap ");
	}
	//若表演失败 需要喝倒彩
	public void boo(){
		System.out.println("boo boo ");
	}
	//around通知
	public void watch(ProceedingJoinPoint joinPoint) throws Throwable{
		long start=System.currentTimeMillis();
		System.out.println("the performance is coming soon");
		joinPoint.proceed();
		TimeUnit.SECONDS.sleep(3);//模拟表演用时
		long end=System.currentTimeMillis();
		System.out.println("the performance last "+(end-start)+"seconds");
	}
}
