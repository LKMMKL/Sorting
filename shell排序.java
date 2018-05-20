package org.testJson;

/**
 * 希尔（Shell)排序
 * @author lkm
 *
 */

public class test4 {
	public static void main(String args[]) {
		int[] a = {2,9,4,2,1,8,6};
		 int N = a.length;
		    //增量自己设定
	        int h = 2;
	        while (h >= 1) {
	        	/**
	        	 * 从每组的第二个数开始向前比较
	        	 * 如我这里设置的增量为2
	        	 * 则第一组 2-4-1-6
	        	 *  第二组  9-2-8
	        	 *  1.首先4与2比较，得2，4，然后到第二组的2与9比较，得2，9
	        	 *  2.然后1与2，4比较，得1，2，4，再到第二组...
	        	 * 第一次循环为第一组的插入排序，第二次循环为第二组的插入排序...
	        	 */
	            for (int i = h; i < N; i++)
	            	//每组执行插入排序
	            	//主要 j-=h,跨度为h
	                for (int j = i; j >= h; j -= h)
	                {
	                	int t;
	    				if(a[j]<a[j-h]){
	    					t = a[j];
	    					a[j] = a[j-h];
	    					a[j-h] = t;
	    				}
	                }
	            //增量改变程度不定，只有最后增量为1就行
	            h = h - 1;
	            System.out.println("h:"+h);
	        }
		for(int k:a){
			System.out.print(k+" ");
		}
	}
}
