package Java_1227;

import java.util.Scanner;

class noMoney {
	public noMoney() {System.out.println("�ܾ׺���");}
}
public class JavaIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ݾ� �Է�");
		
		int money = sc.nextInt();
		int coke = 800;
		int water = 300;
		int vitamin = 1000;
		
		System.out.println("�޴��� ���� \n"
				+ "1.�ݶ� : " + coke + "��\n"
				+ "2.���� : " + vitamin + "��\n"
				+ "3.�� : " + water + "��\n");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			if(coke<money) {
				System.out.println("�ݶ�");
			}else {
				System.out.println("�ܾ׺���");
			}
		}
		if(choice == 2) {
			if(water<money) {
				System.out.println("��");
			}else {
				System.out.println("�ܾ׺���");
			}
		}
		if(choice == 3) {
			if(vitamin<money) {
				System.out.println("��Ÿ��");
			}else {
				System.out.println("�ܾ׺���");
			}
		}
		if(choice <= 4) {
			System.out.println("�ȴ�");
		}
		sc.close();
	}
}
