package org.testJson;

/**
 * —°‘Ò≈≈–Ú
 * @author lkm
 *
 */
public class test {

	public static void main(String args[]) {
		int[] a = {2,1,4,2,5,8,6};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				int t;
				if(a[i] > a[j]){
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for(int k:a){
			System.out.print(k+" ");
		}	}
}
