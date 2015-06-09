import java.util.Scanner;
class Positive {
    boolean checkPositive(String x){
        int j=0;
        for(int i=0;i<x.length()-1;i++){
           char c=x.charAt(i);
           char d=x.charAt(i+1);
           if(c>d){
               j=1;
               break;
           }
        }
        return j != 1;
    }
}
class q7{
  public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the word");
        String word=in.next();
        Positive ob=new Positive();
        boolean ch=ob.checkPositive(word);
        if(ch==true)
            System.out.println("Word is Positive");
        else
            System.out.println("Word is Not positive");
  }
}

/*

Enter the word
tasdik
Word is Not positive


Enter the word
ite
Word is Not positive

*/