package com.accolite.singleton;
public class Singleton {
	private int prop;
	private static Singleton singletonObj;
	private Singleton(int x) {
		this.prop=x;
	}
	public static Singleton getObj(int temp) {
		if(singletonObj==null) {
			synchronized (Singleton.class) {
				if(singletonObj==null) {
					singletonObj = new Singleton(temp);
				}
			}
		}
		singletonObj.setProp(temp);
		return singletonObj;
	}
	public int getProp() {
		return prop;
	}
	public void setProp(int x) {
		prop = x;
	}
}