import java.util.Scanner;

class Super {
	String text = "fun" ; 
	int size = text.length ; 

	void subStrings(){
		int temp = size ; 
		int index = 0 ; 
		while(temp--){
			for(int i = 0 ; i < size ; i++){
				String new_string = text.substring(index, i); 
			}
		}
	}
}   

class q30_a{
   public static void main(String[] args) {

   }
}

