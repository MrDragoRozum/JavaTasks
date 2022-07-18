// Given three int values, a b c, return the largest.


// intMax(1, 2, 3) → 3
// intMax(1, 3, 2) → 3
// intMax(3, 2, 1) → 3
  
// https://codingbat.com/prob/p101887

public int intMax(int a, int b, int c) {
    if(a - b > 0 && a - c > 0) {
			  return a;
		} else if(b - a > 0 && b - c > 0) {
			  return b;
		} else if(c - a > 0 && c - b > 0) {
			  return c;
		}
		return 0;
}
