package CodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class BigNumberRule {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		//n = �迭ũ�� / m  = ���� Ƚ�� / k = k������ �ݺ��ϰ� �ϴ� ��Ģ
		int sum = 0;//�հ�
		int[] a = new int[n]; //nũ���� �迭 ����
		

		for(int i = 0;i<n;i++) { // �迭 ���� ���� �Է�
			a[i] = sc.nextInt();
		}
		sc.close(); // scanner close
		Arrays.sort(a);//�迭 a�� ������������ ����
		int back = a[n-1]; // ���� ū ��
		int back2 = a[n-2]; // �ι�°�� ū �� 
			
			while(true) { // ��� �ݺ�
				for(int i = 0;i<k;i++) { // sum�� k��ŭ ���� ū ���� ���ϴ� for��
					if(m==0) break;// while�� Ż��
					sum+=back;//sum�� ���� ū �� ����
					m -=1; // m(Ƚ��) 1�� ����
				}
				if(m==0) break; // while�� Ż��
				sum+=back2; //sum�� �ι�°�� ū �� ����
				m-=1;//m(Ƚ��) 1�� ����
			}
			System.out.println(sum); // sum ���
		
		//�׸��� ���
		int count = (int)(m/(k+1))*k; // 6
		count+=m%(k+1); // 6+0 = 6
		System.out.println(count); // 6
		
		sum +=(count)*back; //36
		sum += (m-count)*back2; // 2*5 = 10
			
		System.out.println(sum);
		
		
	}

}
