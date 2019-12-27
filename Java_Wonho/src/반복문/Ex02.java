package 반복문;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int week = 1;
		System.out.print("현재 몸무게 : ");
		int pWeight = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int fWeight = sc.nextInt();
		
		/*
		while(true) {
			System.out.print(week++ +"주차 감량 몸무게 : ");
			int minusWeight = sc.nextInt();
			pWeight -= minusWeight;
			if(pWeight<=fWeight) {
				System.out.println(pWeight + "kg 달성 ! 축하합니다.");
				break;
			}
			
		}*/
		
		while(pWeight > fWeight) {
			System.out.print(week++ +"주차 감량 몸무게 : ");
			int minusWeight = sc.nextInt();
			pWeight -= minusWeight;
		}
		System.out.println(pWeight + "kg 달성 ! 축하합니다.");
		
		sc.close();
	}
}
