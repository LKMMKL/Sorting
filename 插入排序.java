package org.testJson;

/**
 * ≤Â»Î≈≈–Ú
 * @author lkm
 *
 */

public class test3 {
	private static boolean less(Comparable v, Comparable w) {
	    return v.compareTo(w) < 0;
	}

	private static void swap(Comparable[] a, int i, int j) {
	    Comparable t = a[i];
	    a[i] = a[j];
	    a[j] = t;
	}
	public static void main(String args[]) {
		int[] a = {2,9,4,2,1,8,6};
		for(int i=0;i<a.length;i++){
			for(int j=i;j>0;j--){
				int t;
				if(a[j]<a[j-1]){
					t = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
				}
			}
		}
		
		for(int k:a){
			System.out.print(k+" ");
		}
	}
}
