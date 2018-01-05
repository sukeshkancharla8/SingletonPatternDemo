package com.accolite.singleton;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new singletonThread(1));
		Thread t1=new Thread(new singletonThread(2));
		t.start();
		t1.start();
	}
}
class singletonThread implements Runnable{
	private int threadNo;
	public singletonThread(int no) {
		// TODO Auto-generated constructor stub
		threadNo = no;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int ch;
		do {
			System.out.println("enter number to continue "+threadNo);
			Scanner sc = new Scanner(System.in);
			ch= sc.nextInt();
			Singleton s = Singleton.getObj(ch);
			System.out.println(s.getProp()+" thread "+threadNo);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (ch!=0);
	}	
}