public String everyNth(String str, int n) {
    int letter = 0;
		int order = str.length();
		String result = "";
		
		while(letter < order) {
			result += str.substring(letter, letter+1);
			letter += n;
		}
		return result;
}


// Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. 
//   So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.


// everyNth("Miracle", 2) → "Mrce"
// everyNth("abcdefg", 2) → "aceg"
// everyNth("abcdefg", 3) → "adg"
    
// https://codingbat.com/prob/p196441
