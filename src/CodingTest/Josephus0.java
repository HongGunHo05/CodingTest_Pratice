package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Josephus0 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1;i<=n;i++) { // 1���� n������ ���� �־��ش�
			queue.offer(i);
		}
		while(!queue.isEmpty()) {//ť�� ������� ����������
			for(int i = 0;i<k-1;i++) {//k-1��ŭ ���� 1��, ������ �� �ٽ� �߰� �ѹ��� ���ش�.
			int temp = queue.poll();
			queue.offer(temp);
			}
			list.add(queue.poll());//�ѹ� �� ������ ���� list�� �־��ش�.(�� 3(K)��°�� ���� �־��ش�)
		}
		//���
		System.out.print("<");
		for(int i = 0;i<list.size();i++) {
			if(i==list.size()-1) {
				System.out.print(list.get(i)+">");
			}else {
				System.out.print(list.get(i)+", ");
			}
		}
	}

}