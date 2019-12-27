package 반복문;

import java.util.Scanner;

public class Ex_plus {
	public static void main(String[] args) {
		int a;
		int b;
		int choice;
		Scanner sc = new Scanner(System.in);
		String c;
		
		do {
			System.out.println("첫번째 정수 입력 : ");
			a = sc.nextInt();
			
			System.out.println("두번째 정수 입력 : ");
			b = sc.nextInt();
			
			System.out.println("[1]더하기 , [2]빼기");
			choice = sc.nextInt();
			if(choice == 1) {
				System.out.println(a +" 더하기 "+ b +" 는 "+ (a+b) );
			}else if(choice == 2) {
				System.out.println(a +" 빼기 "+ b +" 는 "+ (a-b) );
			}else {
			  System.out.println("할수 없어");
			}
			System.out.println("계속 하시겠습니까? y/n");
			c = sc.next();
			
		} while (!c.equals("n"));
		System.out.println("종료");
		sc.close();
	}
}
