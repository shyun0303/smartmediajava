package �ݺ���;

import java.util.Scanner;

public class ex_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	/*	while(true) {
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			if(num>10) {
				System.out.println("����Ǿ����ϴ�");
				break;
			}
		}*/
		
		int num = 0;
		while(num<10) {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
			
		}
		System.out.println("����Ǿ����ϴ�.");
		
		sc.close();
	}
}
