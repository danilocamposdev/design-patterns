package com.danilocampos.singleton;

public class SingletonLazyHolder {

	private static class instanceHolder {
		public static SingletonLazyHolder instance = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {
		super();
	}

	public static SingletonLazyHolder getInstance() {
		return instanceHolder.instance;
	}

}
