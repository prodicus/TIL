class Gen<T,V>{		// this time we are using two arguments here in this example 
	T ob1 ; 
	V ob2 ;			// two objects references for both the types were declared here 

	Gen(T o1, V o2){
		ob1 = o1 ; 
		ob2 = o2 ; 
	}

	T getOb1(){
		return ob1;
	}

	V getOb2(){
		return ob2;
	}
}

class generics1{
	public static void main(String[] args) {
		System.out.println(""); 

		Gen<Integer,String> intStrOb = new Gen<Integer,String>(22, "Tasdik Rahman");
		int v = intStrOb.getOb1() ; 
		System.out.println("v : " + v); 

		String str = intStrOb.getOb2() ;
		System.out.println("str  : " + str); 
	}
}