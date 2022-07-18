public boolean posNeg(int a, int b, boolean negative) {
  	boolean tmp = (Math.signum(a) == Math.signum(b));
		
		if(a < 0 && b < 0 && tmp == negative) {
			return true;
		} else if(tmp == negative && a != b) {
		  return true;
		}
		return false;
}
// Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.


// posNeg(1, -1, false) → true
// posNeg(-1, 1, false) → true
// posNeg(-4, -5, true) → true

// https://codingbat.com/prob/p159227
