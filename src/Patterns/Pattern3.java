package Patterns;

//A
//B B
//C C C
//D D D D
//E E E E E

public class Pattern3 {
	public static void main(String[] args) {
		char print = 'A';
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print(print+" ");									
			}
			System.out.println("");
			print++;
		}
	}

}