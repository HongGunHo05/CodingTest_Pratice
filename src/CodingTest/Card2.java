package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Card2{
	public static void main(String[] args) throws IOException{
		Queue<Integer> queue = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1;i<=n;i++) { // ���� �־��ش�.
			queue.offer(i);
		}
		while(queue.size()!=1) { // ť�� ũ�Ⱑ 1�� �ƴҶ�����
			queue.poll(); // ���� ���� ���� ������.
			int temp = queue.poll(); // �� ���� ���� temp�� �����Ѵ�.
			queue.offer(temp); // temp�� �ٽ� �־��ش�.
		}
		System.out.println(queue.peek()); // queue�� ù��° ���� �����ش�.
	}

}

