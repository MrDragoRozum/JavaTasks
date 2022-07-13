
// We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
//   Given 2 int values, return true if one or the other is teen, but not both.


// loneTeen(13, 99) → true
// loneTeen(21, 19) → true
// loneTeen(13, 13) → false

//https://codingbat.com/prob/p165701

public boolean loneTeen(int a, int b) {
  	  int minA = Math.min(a, 19);
		  int maxA = Math.max(minA, 13);

		  int minB = Math.max(b, 13);
		  int maxB = Math.min(minB, 19);
		  
		  return (a != maxA || b != maxB) && a != b;
}
