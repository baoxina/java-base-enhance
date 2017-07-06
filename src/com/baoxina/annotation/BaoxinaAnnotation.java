package com.baoxina.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  Ԫ����

	Ҳ��Ԫע�⣬�Ƿ��ڱ������һ��ע�����ǰ�� ���Ƕ�ע��һ�����ơ�ֻ�������� @Retention �� @Target
	
	@Retention ������˵����ע������������ڡ�������������������
	
	RetentionPolicy.SOURCE  : ע��ֻ������Դ�ļ���
	
	RetentionPolicy.CLASS  : ע�Ᵽ����class�ļ��У��ڼ��ص�JVM�����ʱ����
	
	RetentionPolicy.RUNTIME  : ע�Ᵽ���ڳ��������ڼ䣬��ʱ����ͨ�������ö�����ĳ�����ϵ�����ע�⡣
	
	@Target :  ����˵����ע����Ա���������ЩԪ��֮ǰ��
	
	ElementType.TYPE��˵����ע��ֻ�ܱ�������һ����ǰ��
	
	ElementType.FIELD��˵����ע��ֻ�ܱ�������һ������ֶ�ǰ��
	
	ElementType.METHOD��˵����ע��ֻ�ܱ�������һ����ķ���ǰ��
	
	ElementType.PARAMETER��˵����ע��ֻ�ܱ�������һ����������ǰ��
	
	ElementType.CONSTRUCTOR��˵����ע��ֻ��������һ����Ĺ��췽��ǰ��
	
	ElementType.LOCAL_VARIABLE��˵����ע��ֻ��������һ���ֲ�����ǰ��
	
	ElementType.ANNOTATION_TYPE��˵����ע��ֻ��������һ��ע������ǰ��
	
	ElementType.PACKAGE��˵����ע��ֻ��������һ������ǰ��
	
	ע��Ķ��壺

	ע��Ķ���ʹ�ùؼ��� @interface ,��������һ��ע��@Rentention(arg) ����@Target(args) , �������£�
	
	@Rentention(RetentionPolicy.RUNTIME)
	
	public @interface Annotation01 {
	
	//���幫����final��̬����
	
	.....
	
	//���Թ����ĳ��󷽷�
	
	......
	
	}
	
	������������ע��
	
	@Override  ����������дһ������ʱ���ڷ����ϼ�@Override�������Ƿ��������ֳ���ʱ���������ͻᱨ�� �������£�
	
	@Retention(RetentionPolicy.SOURCE )
	
	public   @interface  Override
	
	@Deprecated  ������ʾĳ��������Ի򷽷��Ѿ���ʱ�������������ʱ�������Ժͷ�������@Deprecated���Ρ� �������£�
	
	@Retention(RetentionPolicy.RUNTIME)
	
	public   @interface  Deprecated
	
	@SuppressWarnings  ����ѹ�Ƴ����г����ľ��档 �������£�
	
	@Retention(RetentionPolicy.SOURCE )
	
	public   @interface  SuppressWarnings 
 *
 */
@Target({ElementType.TYPE,ElementType.METHOD})//Ԫע��
@Retention(RetentionPolicy.RUNTIME)//Ԫע��
public @interface BaoxinaAnnotation {
	String color() default "red";
	String value() default "abc";
	int[] arrayAttr() default {1,2,3};
	Class<?> clz() default String.class;
	Class<?>[] clzs() default String.class;
	MetaAnnotation annotation() default @MetaAnnotation("haha");
	EnumTest.TrrificLamp lamp();
}
