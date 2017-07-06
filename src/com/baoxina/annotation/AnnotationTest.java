package com.baoxina.annotation;

@BaoxinaAnnotation(value="aaa",annotation=@MetaAnnotation("xyz"),lamp=EnumTest.TrrificLamp.RED)
public class AnnotationTest {
	@BaoxinaAnnotation(lamp=EnumTest.TrrificLamp.GREEN)
	public static void main(String[] args) {
		if(AnnotationTest.class.isAnnotationPresent(BaoxinaAnnotation.class)){
			BaoxinaAnnotation annotation = AnnotationTest.class.getAnnotation(BaoxinaAnnotation.class);
			System.out.println(annotation.value());
			System.out.println(annotation.annotation().value());
			System.out.println(annotation.lamp().nextLamp());
			try {
				BaoxinaAnnotation annotation2 = AnnotationTest.class.getMethod("main", String[].class).getAnnotation(BaoxinaAnnotation.class);
				System.out.println(annotation2.value());
				System.out.println(annotation2.annotation().value());
				System.out.println(annotation2.lamp().nextLamp());
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}
	}
}