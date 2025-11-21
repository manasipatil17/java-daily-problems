package com.string;

public class DateAfterN {
	
//	public static boolean isLeap(int y) {
//		return(y%400==0||y%4==0&&y%100!=0);
//	}
	
	public static boolean isLeap(int y) {
		return(y%4==0||y%400==0||y%100!=0);
	}
public static void main(String[] args) {
	int days=12;
	int month=1;
	int year=2025;
	
	int[] daysInMonth= {31,28,31,30,31,30,31,31,30,31,30,31};
	int addDays=50;
	
	if(isLeap(year)) {
		daysInMonth[1]=29;
	}
	days+=addDays;
	
	while(days>daysInMonth[month-1]) {
		days-=daysInMonth[month-1];
		month++;
		
		if(month>12) {
			month=1;
			year++;
			
			if(isLeap(year)) {
				daysInMonth[1]=29;
			}
			else {
				daysInMonth[1]=28;
			}
		}
	}
	System.out.println(days+"/"+month+"/"+year);
	
	
	
	
	
	
	
	
//	int day=15;
//	int month=1;
//	int year=2025;
//	
//	int addDays=50;
//	
//	int [] daysInMonth= {31,28,31,30,31,30,31,31,30,31,30,31};
//	
//	if(isLeap(year)) {
//		daysInMonth[1]=29;
//	}
//	day+=addDays;
//	
//	while(day> daysInMonth[month-1]) {
//		day-=daysInMonth[month-1];
//		month++;
//		
//		if(month>12) {
//			month=1;
//			year++;
//			
//			if(isLeap(year)) {
//				daysInMonth[1]=29;
//			}
//			else {
//				daysInMonth[1]=28;
//			}
//		}
//	}
//	System.out.println(day+"/"+month+"/"+year);
}
}
