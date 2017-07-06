package com.baoxina.annotation;

@BaoxinaAnnotation(value="aaa",annotation=@MetaAnnotation("xyz"))
public class AnnotationTest {
	@BaoxinaAnnotation()
	public static void main(String[] args) {
		if(AnnotationTest.class.isAnnotationPresent(BaoxinaAnnotation.class)){
			BaoxinaAnnotation annotation = AnnotationTest.class.getAnnotation(BaoxinaAnnotation.class);
			System.out.println(annotation.value());
			System.out.println(annotation.annotation().value());
			try {
				BaoxinaAnnotation annotation2 = AnnotationTest.class.getMethod("main", String[].class).getAnnotation(BaoxinaAnnotation.class);
				System.out.println(annotation2.value());
				System.out.println(annotation2.annotation().value());
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}
	}
}