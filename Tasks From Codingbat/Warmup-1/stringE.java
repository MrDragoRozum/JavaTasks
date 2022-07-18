	public boolean stringE(String str) {
		int number = 0;
		int tmp = str.length();
		
		for(int i = 0; i < tmp; i++) {
			if(str.charAt(i) == 'e') {
				++number;
			}
		}
		if(number <= 3 && number > 0) {
			return true;
		} else {
			return false;
		}
	}


// Return true if the given string contains between 1 and 3 'e' chars.


// stringE("Hello") → true
// stringE("Heelle") → true
// stringE("Heelele") → false
  
//   https://codingbat.com/prob/p173784
