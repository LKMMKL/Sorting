package org.testJson;

/**
 * ϣ����Shell)����
 * @author lkm
 *
 */

public class test4 {
	public static void main(String args[]) {
		int[] a = {2,9,4,2,1,8,6};
		 int N = a.length;
		    //�����Լ��趨
	        int h = 2;
	        while (h >= 1) {
	        	/**
	        	 * ��ÿ��ĵڶ�������ʼ��ǰ�Ƚ�
	        	 * �����������õ�����Ϊ2
	        	 * ���һ�� 2-4-1-6
	        	 *  �ڶ���  9-2-8
	        	 *  1.����4��2�Ƚϣ���2��4��Ȼ�󵽵ڶ����2��9�Ƚϣ���2��9
	        	 *  2.Ȼ��1��2��4�Ƚϣ���1��2��4���ٵ��ڶ���...
	        	 * ��һ��ѭ��Ϊ��һ��Ĳ������򣬵ڶ���ѭ��Ϊ�ڶ���Ĳ�������...
	        	 */
	            for (int i = h; i < N; i++)
	            	//ÿ��ִ�в�������
	            	//��Ҫ j-=h,���Ϊh
	                for (int j = i; j >= h; j -= h)
	                {
	                	int t;
	    				if(a[j]<a[j-h]){
	    					t = a[j];
	    					a[j] = a[j-h];
	    					a[j-h] = t;
	    				}
	                }
	            //�����ı�̶Ȳ�����ֻ���������Ϊ1����
	            h = h - 1;
	            System.out.println("h:"+h);
	        }
		for(int k:a){
			System.out.print(k+" ");
		}
	}
}
