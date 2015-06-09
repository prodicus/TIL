class Gen<T>{
	T ob ; 		// created a refernce to an object of type T

	Gen(T o){
		ob = o;
	}

	T getob(){
		return ob;
	}
}

class generics{
	public static void main(String[] args) {
		System.out.println(""); 

		Gen<Integer> iOb = new Gen<Integer>(10) ; 
		int v = iOb.getob();
		System.out.println("v : " + v);

		Gen<String> sOb = new Gen<String>("Welcome to America");
		String str = sOb.getob();
		System.out.println("str : " + str);
	}
}