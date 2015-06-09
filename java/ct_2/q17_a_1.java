class Test{
	int sum ; 
	Test(){
		sum = 0  ;
	}
	int sumof(int n){
		if(n != 0)
			return (n + sumof(n-1)) ; 
		return 0 ; 
	}
}

class q17_a_1{
	public static void main(String[] args) {
		Test obj = new Test() ; 
		int sum = obj.sumof(5) ; 
		System.out.println("\nSum of the first 5 natural number : " + sum) ; 
	}
}
