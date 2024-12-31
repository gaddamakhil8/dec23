package dec23;

import static java.lang.System.out;

public class AintersectionB {



	public static void main(String[] args) {
		int[] b = {1,2,3,4,5,6};
		int[] a = {100,200,1,2,4,300,400};
		int min = a.length < b.length?a.length:b.length;
		
		int[] aInSecb = new int[min];
		
		int index=0;
		for(int i=0;i<b.length;i++) {
			if(checkDuplicate(a,b[i])== true) {
				aInSecb[index++] = b[i];	
			}}
		out.println("A array elements");
		for(int i=0;i<a.length;i++) {
			out.print(a[i]+" ");
		}
		out.println("\n B array elements");
		for(int i=0;i<b.length;i++) {
			out.print(b[i]+" ");
		}
		out.println("\n A^B array elements");
	
		for(int i=0;i<index;i++) {
			out.print(aInSecb[i]+" ");
		}
	}

	private static boolean checkDuplicate(int[] aub, int bv) {
		
		for(int i=0;i<aub.length;i++) {
			if(aub[i] == bv) return true;
		}
		
		return false;
	}

	

	}


