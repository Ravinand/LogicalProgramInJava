package com.app.singleton;

import java.io.Serializable;

public class SingltonClass implements Serializable, Cloneable {

	private static final long serialVersionUID = 1888;

	private static SingltonClass instance;

	private SingltonClass() {

	}

	public static SingltonClass getInstance() {

		if (instance == null) {
			synchronized (SingltonClass.class) {
				if (instance == null) {
					instance = new SingltonClass();
				}
			}
		}

		return instance;
	}

	public Object clone() throws CloneNotSupportedException {

		return new CloneNotSupportedException("Clone Not Supported");

	}

	public Object readResolve() {
		return instance;
	}

}
