// Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.


// delDel("adelbc") → "abc"
// delDel("adelHello") → "aHello"
// delDel("adedbc") → "adedbc"

// https://codingbat.com/prob/p100905

public String delDel(String str) {
  String delete = "del";
			if(str.startsWith(delete, 1)) {
				return str.replace(delete, "");
			} 
	return str;
}
