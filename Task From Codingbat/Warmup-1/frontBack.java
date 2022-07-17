public String frontBack(String str) {
  char front, back;
  int size = str.length();
  if(size > 1) {
  String result = str.substring(1, size-1);
  front = str.charAt(size-1);
  back = str.charAt(0);
  
  return front + result + back;
  } else return str;
}


// Given a string, return a new string where the first and last chars have been exchanged.


// frontBack("code") → "eodc"
// frontBack("a") → "a"
// frontBack("ab") → "ba"
  
// https://codingbat.com/prob/p123384
