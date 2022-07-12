
// Given a string, we'll say that the front is the first 3 chars of the string.
// If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.


// front3("Java") → "JavJavJav"
// front3("Chocolate") → "ChoChoCho"
// front3("abc") → "abcabcabc"

// https://codingbat.com/prob/p136351

public String front3(String str) {
  String tmp = "";
        
        if(str.length() > 3) {
             for(int i = 0; i < 3; i++) {
            tmp = str.substring(0, i+1);
             }
        } else {
             for(int i = 0; i < str.length(); i++) {
            tmp = str.substring(0, i+1);
             }
        }
        return tmp += tmp + tmp;
}

// или

public String front3(String str) {
  String tmp = "";
	int count = Math.min(str.length(), 3);
	      
	for(int i = 0; i < count; i++) {
    tmp = str.substring(0, i+1);
  }
  return tmp += tmp + tmp;
}
