package com.poonia.core;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAnnotaion {

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, NoSuchMethodException, SecurityException,
			IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		Class<UseAnnotation> useAnnotation = UseAnnotation.class;
		try {
			Field field = useAnnotation.getDeclaredField("minMaxArray");
			if (field.isAnnotationPresent(Inject.class)) {
				Inject inject = field.getAnnotation(Inject.class);
				@SuppressWarnings("unused")
				String value = inject.value();
				MinMaxArray<Double> minMaxArrayImpl = new MinMaxArrayImpl<Double>(
						3.4, 5.6, 7.8, 8.9, 6.3);
				Object object = useAnnotation.newInstance();
				Method method = useAnnotation.getMethod("setMinMaxArray",
						MinMaxArray.class);

				method.invoke(object, minMaxArrayImpl);
				Method method1 = useAnnotation.getMethod("Display");
				method1.invoke(object);
			}
			useAnnotation.getDeclaredField("minMaxArray");
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
