package org.testJson;

/**
 * ��������
 * @author lkm
 *
 */

public class test5 {
	static int[] a = {9,6,4,2,1,8,6,2,7};
	public static void sort(int left,int right){
		//��ʾ����ָ���Ѿ�����
		if(right < left){
			return ;
		}
		int i = left;
		int j = right;
		//��׼��
		int t = a[left];
		while(i != j){
			//һ������ָ�����ƶ���ֱ������С�ڻ�׼�������ͣ����
			//��Ȼǰ��������ָ�벻����
			while(a[j]>=t && j>i )
				j--;
			while(a[i]<=t && j>i)
				i++;

			if(i < j){
				int k;
				k = a[j];
				a[j] = a[i];
				a[i] = k;
			}
			
			
			
		}

			a[left] = a[i];
			a[i] = t;
		//�ݹ����
		sort(left,i-1);
		sort(i+1,right);
		return ;
	}
	
	public static void main(String args[]) {
		
		test5.sort(0, a.length-1);
		for(int k:a){
			System.out.print(k+" ");
		}
	}
}
