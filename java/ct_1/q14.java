/*
Create a class Rectangle and initialize its instance variables using appropriate
constructor and this keyword and call it in main method from another class
Call_Rectangle. Also list the rules of defining a constructor.
*/

class q14{
	static class Rectangle{
		int len, wid ;
		Rectangle(int len, int wid){
			this.len = len ; 
			this.wid = wid ; 
		}
		void display(){
			System.out.println("len : "+len+"\nwid : " + wid) ;
		}
	}
	public static void main(String[] args) {
		Rectangle obj = new Rectangle(2, 3) ; 
		obj.display() ; 
	}
}