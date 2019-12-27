package Java_1227;

import java.util.Scanner;

class noMoney {
	public noMoney() {System.out.println("잔액부족");}
}
public class JavaIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액 입력");
		
		int money = sc.nextInt();
		int coke = 800;
		int water = 300;
		int vitamin = 1000;
		
		System.out.println("메뉴를 골라라 \n"
				+ "1.콜라 : " + coke + "원\n"
				+ "2.생수 : " + vitamin + "원\n"
				+ "3.물 : " + water + "원\n");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			if(coke<money) {
				System.out.println("콜라");
			}else {
				System.out.println("잔액부족");
			}
		}
		if(choice == 2) {
			if(water<money) {
				System.out.println("물");
			}else {
				System.out.println("잔액부족");
			}
		}
		if(choice == 3) {
			if(vitamin<money) {
				System.out.println("비타민");
			}else {
				System.out.println("잔액부족");
			}
		}
		if(choice <= 4) {
			System.out.println("안대");
		}
		sc.close();
	}
}
