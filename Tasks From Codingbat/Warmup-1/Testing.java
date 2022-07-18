package example.main;


public class Testing {

	public static void main(String[] args) {
		Testing f = new Testing();
//		System.out.println(front3("abcd"));
//		System.out.println(or35(11));
//		System.out.println(front22("abc"));
//		System.out.println(f.in1020(20, 3));
		
//		System.out.print(loneTeen(13, 19));
//		System.out.println(delDel("adelHello"));
//		System.out.println(test("aadelbb"));
//		System.out.println(startHi("hi fjgdfkljgkdjfgjs fdgsdfg sdfg dsfgssdfg sdfsdfgdsfg"));
//		System.out.println(startOz("bzoo"));
		
//		System.out.println(intMax(2, 3 , 1));
//		System.out.println(close10(13, 8));
		
//		System.out.println(in3050(30, 31));
		
//		System.out.println(f.max1020(11, 9));
		
//		System.out.println(stringE("asd"));
//		System.out.println(lastDigit(3, 12313));
//		System.out.println(endUp("hi"));
//		System.out.println(everyNth("abcdefg", 3));
		
//		System.out.println(f.frontBack("code"));
		
	}
	
	public static String front3(String str) {
	      String tmp = "";
	        
	        // if(str.length() > 3) {
	        //      for(int i = 0; i < 3; i++) {
	        //     tmp = str.substring(0, i+1);
	        //      }
	        // } else {
	        //      for(int i = 0; i < str.length(); i++) {
	        //     tmp = str.substring(0, i+1);
	        //      }
	        // }
	        
//	        for(int i = 0; i < Math.min(str.length(), 3); i++) {
//	            tmp = str.substring(0, i+1);
//	        }
	      
	      int count = Math.min(str.length(), 3);
	      
	      for(int i = 0; i < count; i++) {
	            tmp = str.substring(0, i+1);
	        }
	        return tmp += tmp + tmp;
	     }
	
	public static String front22(String str) {
		  String tmp = str.substring(0, 2);
		  return tmp + str + tmp;
		}
	
	public static boolean startHi(String str) {
		  return str.matches("^hi.*");
		}
	
	public boolean in1020(int a, int b) {
		  return (a >= 10 && a <= 20) || (b >= 10 && b <= 20) ;
		}
	
	public static boolean loneTeen(int a, int b) {
		  int minA = Math.min(a, 19);
		  int maxA = Math.max(minA, 13);

		  int minB = Math.max(b, 13);
		  int maxB = Math.min(minB, 19);
		  
		  return a != maxA || b != maxB;
	}
	
	public static String delDel(String str) {
		String delete = "del";
			if(str.startsWith(delete, 1)) {
				return str.replace(delete, "");
			} 
		return str;
}
	
	static String test(String str) {
		return str;
	}
	
	public static String startOz(String str) {
//		  int order = str.length() - 1;
//		  for(int i = 0; i < order; i++) {
//		    if(str.substring(0 + i/2, 1+i).equals("oz") ||
//		    		str.startsWith("z", 1) ||
//		    		str.substring(0 + i/2, 1+i).equals("o")) {
//		      return str.substring(0 + i/2, 1+i);
//		    } 
//		  }
		  
		
		  if(str.startsWith("oz")) {
			  return str.substring(0, 2);
		  } else if(str.startsWith("z", 1)) {
			  return str.substring(1, 2);
		  } else if(str.startsWith("o"))
			  return str.substring(0, 1);
		  return "";
		}
	
	public static int intMax(int a, int b, int c) {
		  if(a - b > 0 && a - c > 0) {
			  return a;
		  } else if(b - a > 0 && b - c > 0) {
			  return b;
		  } else if(c - a > 0 && c - b > 0) {
			  return c;
		  }
		  return 0;
	}
	
	public static int close10(int a, int b) {
		if(a > b) {
			for(int i = b, j = a; i<j; i++, j--) {
				if(i == 10) {
					return b;
				} else if(j == 10) {
					return a;
				} 
			}
		} else if(b > a) {
			for(int i = a, j = b; i<j; i++, j--) {
				if(i == 10) {
					return a;
				} else if(j == 10) {
					return b;
				}
			}
		} 
		return 0;
	}
	
	public static boolean in3050(int a, int b) {
		  return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) ||
				  ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
		}
	
	public int max1020(int a, int b) {
		  boolean different = (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
		  boolean same =  ((a >= 10 && a <= 20) && (b >= 10 && b <= 20));
		  
		  
		  if(a > b && same) {
			  return a;
		  } else if(a < b && same) {
			  return b;
		  }
		  
		  if(a != b && different) {
			  if(a >= 10 && a <= 20) {
				  return a;
			  } else if (b >= 10 && b <= 20) {
				  return b;
			  }
			
		  }
		  return 0; 
		  
//		if(a > b && same) {
//			return a;
//		} else if(a > b && different) {
//			return b;
//		} else if (a < b && same){
//			return b;
//		} else if(a < b && different) {
//			return b;
//		}
//		return 0;
//		  if(a > b) {
//			  return a;
//		  } else if (a < b) {
//			  return b;
//		  }
		}
	
	public static boolean stringE(String str) {
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
	
	public static boolean lastDigit(int a, int b) {
		  String stringA, stringB, tmpA, tmpB;
		  tmpA = String.valueOf(a);
		  tmpB = String.valueOf(b);
		  int orderA = tmpA.length();
		  int orderB = tmpB.length();
		  
		  stringA = tmpA.substring(orderA-1, orderA);
		  stringB = tmpB.substring(orderB-1, orderB);
		  
		  return stringA.equals(stringB);
	}
	
	public static String endUp(String str) {
		  int size = str.length();
		  if(size >= 3) {
			  String stringTmp = str.substring(0, size-3);
			  return stringTmp + str.substring(size-3, size).toUpperCase();
		  } else {
			  return str.toUpperCase();
		  }
	}
	
	public static String everyNth(String str, int n) {
		int letter = 0;
		int order = str.length();
		String result = "";
		
		while(letter < order) {
			result += str.substring(letter, letter+1);
			letter += n;
		}
		return result;
	}
	
	public String frontBack(String str) {
		  char front, back;
		  int size = str.length();
		  String result = str.substring(1, size-1);
		  front = str.charAt(size-1);
		  back = str.charAt(0);
		  
		  return front + result + back;
		}
	

}
