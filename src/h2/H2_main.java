package h2;

public class H2_main {

	public static void main(String[] args) {
		int i = 17;
		int j = 3;
		int k =507;
		int min;
		int max;
		
		min = i;
		if(j<i) {
			min = j;
		}
		if(k<i) {
			if(k<j) {
				min = k;
			}
		}
		
		max = i;
		if(i<j) {
			max = j;
		}
		if(i<k) {
			if(j<k) {
				max = k;
			}
		}
		System.out.println("min ist:"+ min);
		System.out.println("max ist:"+ max);
		// TODO Auto-generated method stub

	}

}
