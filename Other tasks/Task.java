package example.main;


//1. Создайте программу, которая выводит на экран:
//******
//*___*
//*___*
//*___*
//******

public class Task {

	public static void main(String[] args) {
		
		int tmpStars = 0;
		int tmpUnderlines = 0;
		int tmpResult = 0;
		int order = 0;
		char star = '*';
		char underline = '_';
		
		for(int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6; j++) {
				if(tmpStars != 6 && order == 0 || order == 4) {
					System.out.print(star);
					tmpStars++;
				} else if(tmpUnderlines != 3) {
					if(tmpUnderlines == 0) {
						System.out.print(star);
					}
					
					System.out.print(underline);
					tmpUnderlines++;
					
					if(tmpUnderlines == 3) {
						System.out.print(star);
					}
				}
			}
			order++;
			tmpResult++;
			System.out.println();
			
			if(tmpResult <= 3) {
			tmpStars = 0;
			tmpUnderlines = 0;
			}
		}

	}

}
