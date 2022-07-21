int countXX(String str) {
  int numbersX = 0;
  int size = str.length();
  for(int i = 0; i < size; i++) {
    if(str.charAt(i) == 'x') {
      numbersX++;
    } else if(str.charAt(i) == ' ') {
      numbersX = 1;
    }
  }
  if(numbersX == 0) {
    return numbersX;
  } else {
    return numbersX-1;
  }
}


//Count the number of "xx" in the given string. 
//We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
//
//
//countXX("abcxx") → 1
//countXX("xxx") → 2
//countXX("xxxx") → 3
//
//https://codingbat.com/prob/p194667