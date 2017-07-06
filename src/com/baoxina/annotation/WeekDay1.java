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
	
	public abstract WeekDay1 nextDay();//抽象方法
	
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
			return "星期天";
		}else if(this == MON){
			return "星期一";
		}else if(this == TUE){
			return "星期二";
		}else if(this == WEN){
			return "星期三";
		}else if(this == THU){
			return "星期四";
		}else if(this == FRI){
			return "星期五";
		}else {
			return "星期六";
		}
	}
}