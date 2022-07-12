
//Given 2 int values, return true if either of them is in the range 10..20 inclusive.


//in1020(12, 99) → true
//in1020(21, 12) → true
//in1020(8, 99) → false

// https://codingbat.com/prob/p144535

public boolean in1020(int a, int b) {
	    int minA = Math.min(a, 20);
		  int maxA = Math.max(minA, 10);
		  
		  int minB = Math.max(b, 10);
		  int maxB = Math.min(minB, 20);
		  return a == maxA || b == maxB;
}

// или

public boolean in1020(int a, int b) {
		  return (a >= 10 && a <= 20) || (b >= 10 && b <= 20) ;
		}
