import java.util.Scanner;

class MultiCat {
	String og_text ; 

	public String multiConcat(String text, int count){
		og_text = text ; 
		String new_string = text ; 
		if(count < 2){
			return og_text;
		}
		
		else{
			for(int i = 0 ; i < count ; i++){
				new_string = new_string.concat(text);
			}
			return new_string;
		}
	}

	public String multiConcat(String text){			// method was succesfully overloaded
		String new_string = text ; 
		new_string = new_string.concat(text); 
		return new_string ;
	}
}   

class q29_a{
   public static void main(String[] args) {
   		MultiCat obj = new MultiCat() ;
   		
   		String new_string ;

   		new_string = obj.multiConcat("Tasdik", 4) ;
   		System.out.println(new_string);
		
		   		
   		new_string =  obj.multiConcat("Tasdik", 1) ;
   		System.out.println(new_string);

   		new_string =  obj.multiConcat("Tasdik") ;
   		System.out.println(new_string);
   }
}

/*
TasdikTasdikTasdikTasdikTasdik
Tasdik
TasdikTasdik
*/