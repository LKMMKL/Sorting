package org.testJson;

/**
 * 快速排序
 * @author lkm
 *
 */

public class test5 {
	static int[] a = {9,6,4,2,1,8,6,2,7};
	public static void sort(int left,int right){
		//表示作用指针已经相遇
		if(right < left){
			return ;
		}
		int i = left;
		int j = right;
		//基准点
		int t = a[left];
		while(i != j){
			//一定是右指针先移动，直到碰到小于基准点得数才停下来
			//当然前提是左右指针不相遇
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
		//递归操作
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
