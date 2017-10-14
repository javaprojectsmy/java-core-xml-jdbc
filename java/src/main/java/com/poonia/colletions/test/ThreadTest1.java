package com.poonia.colletions.test;

public class ThreadTest1 implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[]){
		Thread thread1 = new Thread();
		Thread thead2 = new Thread();
		thread1.start();
		try{
			
			thread1.sleep(1000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		thread1.setPriority(1);
		System.out.println("priority of the thread"+thread1.getPriority());
		System.out.println("thread is running");
	}

}
