package org.testJson;

/**
 * 冒泡排序优化
 * 如果数组已经有序，则可以退出循环
 * @author lkm
 *
 */
public class test2_1 {

	public static void main(String args[]) {
		int[] a = {2,9,4,2,1,8,6};
		for(int i=0;i<a.length;i++){
			boolean flag = false;
			for(int j=0;j<a.length-1;j++){
				int t;
				if(a[j]<a[j+1]){
					t = a[j+1];
					a[j+1] = a[j];
					a[j] = t;
					flag = true;
				}
			}
			for(int k:a){
				System.out.print(k+" ");
			}
			System.out.println();
			if(!flag){
				break ;
			}
		}
		
//		for(int i:a){
//			System.out.print(i+" ");
//		}
	}
}
