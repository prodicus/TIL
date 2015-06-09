class NumericFns<T extends Number>{
	T num ; 

	NumericFns(T o1){
		num = o1;
	}

	double reciprocal(){
		return 1/num.doubleValue() ; 
	}

	boolean absEqual(NumericFns<?> o1){
		if(Math.abs(num.doubleValue()) == Math.abs(o1.num.doubleValue()))
			return true; 
		else return false;
	}
}

class wildcard{
	public static void main(String[] args) {
		NumericFns<Integer> iob = new NumericFns<Integer>(220) ; 	
		System.out.println("reciprocal of iOb : " + iob.reciprocal() ); 

		NumericFns<Double> dob = new NumericFns<Double>(-220.0) ; 
		System.out.println("reciprocal of dob : " + dob.reciprocal()); 

		if(iob.absEqual(dob))
			System.out.println("Both are absEqual : "); 
		else System.out.println("Not equal : "); 
	}
}