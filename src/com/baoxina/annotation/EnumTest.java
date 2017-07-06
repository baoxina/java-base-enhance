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

	//ÿ��ö�ٶ��󶼻������Ӧ��class�ļ�
	public enum WeekDay {
		SUN, MON(1), THU(1), WEN, THI, FRI, SAT;
		private WeekDay() {
			System.out.println("First");
		}
		private WeekDay(int day) {
			System.out.println("Second");
		}
	}

	// ��ͨ��ö��ʵ��
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
		//ö�ٹ�����˽��
		private TrrificLamp(int time) {
			this.time = time;
		}
	}
}