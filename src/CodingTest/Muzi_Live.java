package CodingTest;

public class Muzi_Live {
	class Solution {
	    public int solution(int[] food_times, long k) {
	    	int sum = 0; // ���� �Դ� �ð��� ����
	    	int answer = 0; // ��
	    	for(int i = 0;i<food_times.length;i++) { // ���� �Դ� �ð� ���� ���
	    		sum+= food_times[i];
	    	}
	    	if(sum<=k) { // ������ �����ð����� �۰ų� ������ -1 ����
	    		return -1;
	    	}
	    	while(k!=0) { // k�� 0�� �ƴҶ����� �ݺ�
	    		int j;
	    		for(j=0;j<food_times.length;j++) { // food_times[j] �ε����� ���� k�� 1�� ����
	    			k-=1;
	    			food_times[j]-=1;
	    			if(food_times[j]==0) { // food_times[j] �ε��� ���� 0�� ������
	    				j+=1; // j 1 ����
	    				if(j>=food_times.length) break;// j�� ����Ʈ ���̺��� ��ٸ� �ݺ��� Ż��
	    			}
	    		}
	    		answer = j;// �信 j ����
	    		if(answer >= food_times.length) j = 0;// ���� ����Ʈ ���̺��� ��ٸ� j�� 0���� �ʱ�ȭ
	    		answer = j+1; // �信 j+1 ����
	    	}
	    	return answer; // ��� ���
	    	
	   }
	}

		
}
