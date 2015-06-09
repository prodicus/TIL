class NumericFns<T extends Number>{
	T num ; 

	NumericFns(T o1){
		num = o1;
	}

	double reciprocal(){
		return 1/num.doubleValue() ; 
	}
}

class bounded_types{
	public static void main(String[] args) {
		NumericFns<Integer> iob = new NumericFns<Integer>(220) ; 	
		System.out.println("reciprocal of iOb : " + iob.reciprocal() ); 

		NumericFns<Double> dob = new NumericFns<Double>(22.0) ; 
		System.out.println("reciprocal of dob : " + dob.reciprocal()); 
	}
}