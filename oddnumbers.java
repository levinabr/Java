package lab1;

public class oddnumbers {
	public static void main(String[] args) {
		for(int i=1; i<=50; i++) {
			if(i%2==0) {
				continue;
				
			} 
			System.out.print("\t");
			System.out.print(i);
		}
	}

}
