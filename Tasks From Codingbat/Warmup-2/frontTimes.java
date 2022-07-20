// Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3.
//   Return n copies of the front;


// frontTimes("Chocolate", 2) → "ChoCho"
// frontTimes("Chocolate", 3) → "ChoChoCho"
// frontTimes("Abc", 3) → "AbcAbcAbc"

// https://codingbat.com/prob/p101475

public String frontTimes(String str, int n) {
  int orderMin = Math.min(str.length(), 3);
  String tmp = str.substring(0, orderMin);
  String result = "";
    for(int i = 0; i < n; i++) { 
      result = tmp + result;
    }
  return result;
}
