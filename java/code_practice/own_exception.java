class MyException extends Exception{
	MyException(String str){
		super(str);
	}
}

class own_exception{
	public static void main(String[] args) {
		int x = 5 , y = 1000 ;

		try{	
			int z = (int)x/y;
			if(z < 10)
				throw new MyException("Number is too small");
		}
		catch(MyException e){
			System.out.println("Caught my Exception !") ; 
			System.out.println(e.getMessage()) ;
		}
		finally{
			System.out.println("Inside finally !");
		}
	}
}