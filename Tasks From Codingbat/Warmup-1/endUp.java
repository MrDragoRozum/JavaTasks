public static String endUp(String str) {
		  int size = str.length();
		  if(size >= 3) {
			  String stringTmp = str.substring(0, size-3);
			  return stringTmp + str.substring(size-3, size).toUpperCase();
		  } else {
			  return str.toUpperCase();
		  }
	}


// Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. 
//   Note that str.toUpperCase() returns the uppercase version of a string.


// endUp("Hello") → "HeLLO"
// endUp("hi there") → "hi thERE"
// endUp("hi") → "HI"
// https://codingbat.com/prob/p125268
