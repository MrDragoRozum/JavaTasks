// Given a string, return a string made of the first 2 chars (if present), 
// however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".


// startOz("ozymandias") → "oz"
// startOz("bzoo") → "z"
// startOz("oxx") → "o"
  
// https://codingbat.com/prob/p199720

public String startOz(String str) {
   if(str.startsWith("oz")) {
			  return str.substring(0, 2);
		  } else if(str.startsWith("z", 1)) {
			  return str.substring(1, 2);
		  } else if(str.startsWith("o")) {
			  return str.substring(0, 1);
		  }
		  return "";
}
