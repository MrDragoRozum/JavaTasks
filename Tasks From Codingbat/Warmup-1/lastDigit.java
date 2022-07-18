public boolean lastDigit(int a, int b) {
      String stringA, stringB, tmpA, tmpB;
		  tmpA = String.valueOf(a);
		  tmpB = String.valueOf(b);
		  int orderA = tmpA.length();
		  int orderB = tmpB.length();
		  
		  stringA = tmpA.substring(orderA-1, orderA);
		  stringB = tmpB.substring(orderB-1, orderB);
		  
		  return stringA.equals(stringB);
}


// Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
//   Note that the % "mod" operator computes remainders, so 17 % 10 is 7.


// lastDigit(7, 17) → true
// lastDigit(6, 17) → false
// lastDigit(3, 113) → true
  
//   https://codingbat.com/prob/p125339
