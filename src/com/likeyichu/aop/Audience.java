package com.likeyichu.aop;

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
}
