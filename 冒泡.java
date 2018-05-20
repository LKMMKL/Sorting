package org.testJson;

/**
 * ц╟ещеепР
 * @author lkm
 *
 */
public class test2 {

	public static void main(String args[]) {
		int[] a = {2,9,4,2,1,8,6};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1;j++){
				int t;
				if(a[j]<a[j+1]){
					t = a[j+1];
					a[j+1] = a[j];
					a[j] = t;
				}
			}
			for(int k:a){
				System.out.print(k+" ");
			}
			System.out.println();
		}
//		
//		for(int i:a){
//			System.out.print(i+" ");
//		}
	}
}
