class annotations{
	public static void main(String[] args) {
		System.out.println("");

		//  a simpole annotation type 

		@interface MyAnno{
			String str();
			int val();
		}

		/*
			Once you have declared an annotation, you can use it to annote a declaration 
			now to apply this annotation to a value 	
		*/

		@MyAnno(str = "annotation example", val = 100)
		public static void myMeth(){
			
		}
	}
}