package com.baoxina.annotation;
public class EnumTest {
	public static void main(String[] args) {
		WeekDay1 weekDay = WeekDay1.TUE;
		System.out.println(weekDay.nextDay());
		System.out.println(WeekDay1.FRI.getClass().getName());
		System.out.println(WeekDay1.class.getName());
		System.out.println(WeekDay.SUN);
		System.out.println(WeekDay.valueOf("SAT"));
		System.out.println(WeekDay.values().length);
		System.out.println(WeekDay.class.getName());
		System.out.println(TrrificLamp.GREEN.nextLamp().time);
		System.out.println(TrrificLamp.RED.nextLamp());
	}

	//每个枚举对象都会产生相应的class文件
	public enum WeekDay {
		SUN, MON(1), THU(1), WEN, THI, FRI, SAT;
		private WeekDay() {
			System.out.println("First");
		}
		private WeekDay(int day) {
			System.out.println("Second");
		}
	}

	// 交通灯枚举实例
	public enum TrrificLamp {
		RED(30) {
			@Override
			public TrrificLamp nextLamp() {
				return GREEN;
			}
		},
		GREEN(45) {
			@Override
			public TrrificLamp nextLamp() {
				return YELLOW;
			}
		},
		YELLOW(5) {
			@Override
			public TrrificLamp nextLamp() {
				return RED;
			}
		};

		public abstract TrrificLamp nextLamp();
		private int time;
		//枚举构造器私有
		private TrrificLamp(int time) {
			this.time = time;
		}
	}
}