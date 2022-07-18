
// Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
//   Note that Math.abs(n) returns the absolute value of a number.


// close10(8, 13) → 8
// close10(13, 8) → 8
// close10(13, 7) → 0

// https://codingbat.com/prob/p172021

public int close10(int a, int b) {
if(a > b) {
			for(int i = b, j = a; i<j; i++, j--) {
				if(i == 10) {
					return b;
				} else if(j == 10) {
					return a;
				} 
			}
		} else if(b > a) {
			for(int i = a, j = b; i<j; i++, j--) {
				if(i == 10) {
					return a;
				} else if(j == 10) {
					return b;
				}
			}
		} 
		return 0;
}
