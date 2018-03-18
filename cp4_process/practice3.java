public class practice3{
	public static void main(String[] args) {
	int r = Integer.parseInt(args[0]);	
	for(int i =0;i<2*r+1;i+=2){
			for(int j = 0;j<2*r+1;j++){
				double rad = Math.acos(Math.abs(i-r)/(double)r);
				double dis =Math.rint((r*Math.sin(rad)));
				if(j==(int)r-dis || j == (int)r+dis){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}