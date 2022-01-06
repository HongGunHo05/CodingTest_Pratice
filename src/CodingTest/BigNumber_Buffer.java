package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BigNumber_Buffer {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
			int n = Integer.parseInt(st.nextToken()); // n ��ū ����(�迭 ũ��)
			int m = Integer.parseInt(st.nextToken()); // m ��ū ����(Ƚ��)
			int k = Integer.parseInt(st.nextToken()); // k ��ū ����(��Ģ)
			int[] array = new int[n]; // nũ���� �迭 ����
			int sum = 0; // �հ�
			int index = 0; // array�迭 �ε��� ��ȣ
			
			StringTokenizer str = new StringTokenizer(br.readLine()); 
			 
			while (str.hasMoreTokens()) { // ��ū�� ���� ������
				array[index++] = Integer.parseInt(str.nextToken());//�ε��� 1�� �����ϸ鼭 ���� �Է�
			}
			Arrays.sort(array);//�迭 �������� ����
			int back = array[n-1];// ���� ū ��
			int back2 = array[n-2];// �ι�°�� ū ��
			
			while(true) { // ���� �ݺ�
				if(m == 0) break; // Ƚ���� 0�̸� while�� Ż��
				for(int i = 0;i<k;i++) { //���� ū ���� k��ŭ sum�� ����
					sum += back;
					m-=1; // Ƚ�� ����
					if(m==0) break; // Ƚ���� 0�̸� while�� Ż��
				}
				sum+=back2; // �ι�°�� ū �� sum�� ����
				m-=1; // Ƚ�� ����
			}
			System.out.println(sum); // Ƚ�� ���
	}

}
