import static java.lang.Character.isDigit;
import java.util.Scanner;
class CodeName {  
    boolean validateCode(String x){
        int len=0,s=0,u1=0,u=0,dig=0,val=1,l=0;
        if(x.length()==6)
            len=1;
        else
            System.out.println("Length is not equal to 6 ");
        if(x.startsWith("Cod"))
            s=1;
        else
            System.out.println("the Code does not start with Cod");
        if(x.charAt(0)=='C')
            u1=1;
        else
            System.out.println("The first letter is not Capital");
        for(int i=0;i<x.length();i++){
            if(isDigit(x.charAt(i)))
                dig=1;
            else if((x.charAt(i)>=65&&x.charAt(i)<=90)||(x.charAt(i)>=97&&x.charAt(i)<=122))
                val=1;
            else{
                val=0;
            }
            if(x.charAt(i)>=65&&x.charAt(i)<=90)
                u++;
            if(x.charAt(i)>=97&&x.charAt(i)<=122)
                l++;
        }
        if(dig!=1)
            System.out.println("No Digits Present");
        if(u<l)
            System.out.println("No.of Upper Case Letters less than no. of Lower Case Letters");
       
        if(val==1&&u>=l&&u1==1&&dig==1&&len==1&&s==1)
            return true;
        else 
            return false;
    }
 }
 class q8{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the UserName");
        String st=in.next();
        CodeName obj=new CodeName();
        boolean b=obj.validateCode(st);
        if(b==true)
            System.out.println("Account is validated.User name=="+st);
        else
            System.out.println("Account is not validated");
    }
}

/*

Enter the UserName
tasdik
the Code does not start with Cod
The first letter is not Capital
No Digits Present
No.of Upper Case Letters less than no. of Lower Case Letters
Account is not validated

*/