class Super{
	public void method(){
		System.out.println("Super method !");
	}
}

class Sub extends Super{
	public void method(){
		System.out.println("Sub method");
	}
}

class practice{
	public static void main(String[] args) {
		Super A = new Sub() ; 
		A.method() ; 
	}
}