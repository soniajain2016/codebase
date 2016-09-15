package com.designPatterns.creational.singleton;

import java.io.Serializable;

public class SingletonClass implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final SingletonClass INSTANCE = new SingletonClass();

	private SingletonClass() {

	}
	private static final  SingletonClass _instance;
	//private static volatile  SingletonClass _instance; // volatile variable

	static {synchronized (SingletonClass.class) {
		//if (_instance == null) {
			_instance = new SingletonClass();
		//}
	}
	}
	
	public static  SingletonClass getInstance()
	{return _instance;
		
	}
	/*public static synchronized SingletonClass getInstance() {
		if (_instance == null) {
			synchronized (SingletonClass.class) {
				if (_instance == null)
					_instance = new SingletonClass();
			}
		}
		return _instance;
	}*/

	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	/*
	 * public Object readResolve(){ return INSTANCE; }
	 */
}
