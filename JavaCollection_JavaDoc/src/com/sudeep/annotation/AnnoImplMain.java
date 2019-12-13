package com.sudeep.annotation;

import java.lang.reflect.Method;

public class AnnoImplMain {

	public static void main(String... args) throws NoSuchMethodException, SecurityException {
		sayValue();

		AnnoImplMain amn = new AnnoImplMain();
		Method m = amn.getClass().getMethod("sayValue");

		AnnoInterface myAnno = m.getAnnotation(AnnoInterface.class);

		System.out.println("value : is" + myAnno.value());
	}

	@AnnoInterface(value = 10)
	public static void sayValue() {
		System.out.println("Hello Annotations");
	}
}
