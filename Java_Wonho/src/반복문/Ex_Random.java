package �ݺ���;

import java.util.Random;
import java.util.Scanner;

public class Ex_Random {

	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("====���ϱ� ���� ====");
		
		String s = "y";
		int num = random.nextInt(100)+1;
		int num2 = random.nextInt(100)+1;
		do {
			
			
			if(!s.equals("y")){
				System.out.println("�ٽ� �Է��ϼ��� ");
			}else {
				System.out.print(num + " + " + num2 +" = ");
				int answer = sc.nextInt();
				
				if(answer == (num + num2)) {
					System.out.println("����");
					 num = random.nextInt(100)+1;
					 num2 = random.nextInt(100)+1;
				}else {
					System.out.println("����");
				}
		
			}
			System.out.println("��� ��?");
			s = sc.next();
		
		} while (!s.equals("n"));
		System.out.println("����");
		
		
			sc.close();
			
		
		}
	}

