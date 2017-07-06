package com.baoxina.annotation;
public abstract class WeekDay1 {
	private WeekDay1() {
	}
	public static final WeekDay1 SUN = new WeekDay1(){
		@Override
		public WeekDay1 nextDay() {
			return MON;
		}
	};
	
	public static final WeekDay1 MON = new WeekDay1(){
		@Override
		public WeekDay1 nextDay() {
			return TUE;
		}
	};
	
	public static final WeekDay1 TUE = new WeekDay1(){
		@Override
		public WeekDay1 nextDay() {
			return WEN;
		}
	};

	public static final WeekDay1 WEN = new WeekDay1(){
		@Override
		public WeekDay1 nextDay() {
			return THU;
		}
	};
	
	public static final WeekDay1 THU = new WeekDay1(){
		@Override
		public WeekDay1 nextDay() {
			return FRI;
		}
	};
	
	public static final WeekDay1 FRI = new WeekDay1(){
		@Override
		public WeekDay1 nextDay() {
			return SAT;
		}
	};
	
	public static final WeekDay1 SAT = new WeekDay1(){
		@Override
		public WeekDay1 nextDay() {
			return SUN;
		}
	};
	
	public abstract WeekDay1 nextDay();//���󷽷�
	
	/*public WeekDay nextDay(){
		if(this == SUN){
			return MON;
		}else{
			return SUN;
		}
	}*/
	
	@Override
	public String toString() {
		if (this == SUN){
			return "������";
		}else if(this == MON){
			return "����һ";
		}else if(this == TUE){
			return "���ڶ�";
		}else if(this == WEN){
			return "������";
		}else if(this == THU){
			return "������";
		}else if(this == FRI){
			return "������";
		}else {
			return "������";
		}
	}
}