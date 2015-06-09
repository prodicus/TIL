import java.util.Scanner;
class Modify {
    int modifyNumber(int x)
        {
            String s=String.valueOf(x);
            String ss="";
            for(int i=0;i<s.length();i++)
            {
                if(i==(s.length()-1))
                {
                   ss=ss+s.charAt(i);
                }
                else
                {
                    char c=s.charAt(i);
                    char d=s.charAt(i+1);
                    int first = Character.getNumericValue(c);
                    int next = Character.getNumericValue(d);
                    int diff=first-next;
                    if(diff<0)
                    {
                        diff=next-first;
                    }
                    char e = Character.forDigit(diff, 10);
                    ss=ss+e;          
                }
            }
           int y=Integer.parseInt(ss);
                    return y;
        }
}
class q5{
     public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        Modify ob=new Modify();
        System.out.println("Enter the number");
        int num=in.nextInt();
        System.out.println("Original Number="+num);
        num=ob.modifyNumber(num);
        System.out.println("Changed Nymber="+num);
   }
}


/*

-->>Output << ---

Enter the number
10
Original Number=10
Changed Nymber=10

*/