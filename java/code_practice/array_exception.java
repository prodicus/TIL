class array_exception{
	public static void main(String[] args) {
		int[] numr = {4,8,10,123} ; 
		int[] denom = {2,0,4,0} ; 

		for(int i = 0 ; i < numr.length ; i++){
			try{
				System.out.println(numr[i] + " / " + denom[i] + " : " + (numr[i]/denom[i]));
			}catch(ArithmeticException e){
				System.out.println("Divide by 0 error !");
			}
		}
	}
}