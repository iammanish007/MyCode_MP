package Patterns;

//        1
//      2 3 2
//    3 4 5 4 3
//  4 5 6 7 6 5 4
//5 6 7 8 9 8 7 6 5

public class Pattern7 {
	public static void main(String[] args) {
		int k=1,x=1;
		for(int i=1;i<=5; i++){
			for(int j=4;j>=i;j--){
				System.out.print("+");
			}
//			while(k<=x){
//				System.out.print("*");
//				k++;
//			}
			for(k=1; k<=x; k++){
				System.out.print("*");
			}
			x=x+2;
			System.out.println("");
		}
	}

}
