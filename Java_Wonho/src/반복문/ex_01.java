package 반복문;

import java.util.Scanner;

public class ex_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	/*	while(true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			if(num>10) {
				System.out.println("종료되었습니다");
				break;
			}
		}*/
		
		int num = 0;
		while(num<10) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			
		}
		System.out.println("종료되었습니다.");
		
		sc.close();
	}
}
