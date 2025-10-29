package p3;

public class P3_main {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		int k = 1;
		if(i<j) {
			System.out.print("A");
		}
		if(i<k) {
			System.out.print("B");
		}
		if(j<k) {
			System.out.print("C");
		}
		// TODO Auto-generated method stub

	}

}

 //i<j  i<k  j<k erwartet:ABC Test(i=1,j=2,k=3) korrekt
 //i>=j i<k  j<k erwartet:BC Test(i=1,j=1,k=2) korrekt
 //i<j  i>=k j<k erwartet:AC Test(nicht mathematisch möglich)
 //i<j  i<k  j>=k erwartet:AB Test(i=1,j=2,k=2) korrekt
 //i>=j i>=k j<k erwartet:C Test(i=2,j=1,k=2) korrekt
 //i>=j i<k  j>=k erwartet:B Test(nicht mathematisch möglich)
 //i<j  i>=k j>=k erwartet:A Test(i=1,j=2,k=1) korrekt
 //i>=j i>=k j>=k erwartet:- Test(i=1,j=1,k=1)