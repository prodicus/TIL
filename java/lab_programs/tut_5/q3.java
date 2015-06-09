import java.util.Scanner;
class StringMode {
    String[] modifyStrings(String s1,String s2){
       int i,j;
       String arr[]=new String[5]; 
       arr[0]=new String();
       int first=s1.indexOf(s2);
       int last=s1.lastIndexOf(s2);
       
       for(i=0;i<s1.length();i++){
           if(i%2==0){
              arr[0]=arr[0]+s2;
           }
           else{
               arr[0]=arr[0]+s1.substring(i,i+1);
           }
       }
      
       if(first!=last){
           StringBuffer s3=new StringBuffer(s2);
           String s4=new String(s3.reverse());
        
           arr[1]=s1.substring(0,last)+s4+s1.substring(last+s2.length());
           arr[2]=s1.substring(0,first)+s1.substring(first+s2.length());
       }
       else
           arr[1]=s1+s2;
       String fi,la;

       if(s2.length()%2==0){
           fi= s2.substring(0,s2.length()/2);
           la= s2.substring(s2.length()/2);
       }

       else{
         fi= s2.substring(0,s2.length()/2+1);
         la= s2.substring(s2.length()/2+1);
       }

       arr[3]=fi+s1+la;
       arr[4]=s1;

       for(i=0;i<s2.length();i++){
          arr[4]=arr[4].replace(s2.charAt(i),'*');
       }  
       return arr;  
    }
}
class q3{
    public static void main(String args[]){
        StringMode obj=new StringMode();
        String ar[]=new String[5];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the 2 strings");
        String ar1=in.nextLine();
        String  ar2=in.nextLine();
        ar=obj.modifyStrings(ar1, ar2);
        for(int i=0;i<5;i++){
            System.out.println("A="+ar[i]);
        }
    }
} 


/*
output ::

Enter the 2 strings
tasdik
rahman
A=rahmanarahmandrahmank
A=tasdikrahman
A=null
A=rahtasdikman
A=t*sdik

*/

/*

open a file , take the content and store it in another file
try catch throw throws finally
see how to create a new thread by using both methods
and interprocess communication

*/