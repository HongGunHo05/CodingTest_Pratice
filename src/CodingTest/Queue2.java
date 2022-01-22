package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Queue2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // �Է� Ƚ��
		StringTokenizer st;
		
		for(int i = 0;i<n;i++) { 
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {//�Է��� ��ū�� �°�
			case "push": push(Integer.parseInt(st.nextToken())); break; // push�̸� ���� �Է��ϰ� �־��ش�.
			case "pop": pop(); break;
			case "size": size(); break;
			case "empty": empty(); break;
			case "front": front(); break;
			case "back": back(); break;
			}
		}
		System.out.println(sb); // ���
	}
	static int[] Queue = new int[2000000]; // ������ 2000000�����̹Ƿ� ũ�⸦ 2000000���� ����
	static int size = 0; // ť�� ũ��
	static int front = 0; // ť�� ���� �� �κ�
	static int back = 0; // ť�� ���� �� �κ�
	static StringBuilder sb = new StringBuilder();
	
	public static void push(int n) { // ť�� ���� �� �κп� ���� �ְ� ť�� ũ��� back�� ũ�⸦ ������Ų��.
		Queue[back] = n;
		size++;
		back++;
	}
	public static void pop() { // ť�� ũ�Ⱑ 0�̸� -1, �ƴϸ� ���� ���� ���� ���� �� ť�� ũ�⸦ ���δ�.
		if(size==0) {
			sb.append(-1).append("\n");
		}else {
			sb.append(Queue[front]).append("\n");
			size--;
			front++;
		}
	}
	public static void size() { // ���� ť�� ũ�� ���
		sb.append(size).append("\n");
	}
	public static void empty() { // ť�� ����ֵ��� 1 �ƴϸ� 0 ���
		if(size==0) {
			sb.append(1).append("\n");
		}else {
			sb.append(0).append("\n");
		}
	}
	public static void front() { // ť�� ���� ���� ���
		if(size==0) {
			sb.append(-1).append("\n");
		}else {
			sb.append(Queue[front]).append("\n");
		}
	}
	public static void back() { // ť�� ���� �ڸ� ���
		if(size==0) {
			sb.append(-1).append("\n");
		}else {
			sb.append(Queue[back-1]).append("\n");
		}
	}

}
