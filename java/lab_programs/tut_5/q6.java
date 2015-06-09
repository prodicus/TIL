import java.util.Scanner;
class StrOp {
    String changeString(String x,char c){
        int i,j;
        switch(c){
            case 'a':
            case 'A':
                        x=x+x;                
                        break;
            case 'b':
            case 'B':                    
                        char a[]=new char[20];
                        a=x.toCharArray();
                       
                        for(i=0;i<a.length;i=i+2){
                            a[i]='*';
                        }
                        x=String.valueOf(a);
                        break;
            case 'c':
            case 'C':
                        for(i=0;i<x.length();i++){
                            for(j=0;j<i;j++){
                                if(x.charAt(i)==x.charAt(j)){
                                   x=x.substring(0,i)+x.substring(i+1);
                                   i--;                    
                                }
                            }
                        }
                       break;
            case 'd':
            case 'D':
                        char b[]=new char[20];
                        b=x.toCharArray();
                        for(i=1;i<b.length;i=i+2){
                            if(b[i]>=97&&b[i]<=122)
                            b[i]-=32;
                        }
                        x=String.valueOf(b);               
                        break;
            
        }
        return x;
    }
}
class q6{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String");
        String x=in.nextLine();
        System.out.println("A: Add the String to itself  \n" +
                            "B: Replace alternate positions with * \n" +
                            "C: Remove duplicate characters in the String \n" +
                            "D: Change alternate characters to upper case\n " + 
                            "Enter choice");
        char ch=in.next().charAt(0);
        StrOp obj=new StrOp();
        String ou=obj.changeString(x,ch);
        System.out.println("Result="+ou);    
    }
     
}

/*
Enter the String
tasdik
A: Add the String to itself  
B: Replace alternate positions with * 
C: Remove duplicate characters in the String 
D: Change alternate characters to upper case
 Enter choice
a
Result=tasdiktasdik

 Enter choice
b
Result=*a*d*k

Enter choice
c
Result=tasdik

Enter choice
d
Result=tAsDiK


*/