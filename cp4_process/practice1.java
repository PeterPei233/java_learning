public class practice1{
	// multification table
	public static void main(String[] args) {
		for(int i=1;i<10;i++){
			for(int j=1 ; j<i+1;j++){
				System.out.print(i+"x"+j+"="+(i*j));
				if(i ==j) System.out.print("\n");
				else System.out.print(",");
			}
		}
	}
}