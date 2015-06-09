import java.util.Scanner;
class UserName {
    boolean validateUserName(String user)
    {
        String ch=user.substring(user.lastIndexOf('_') + 1);
        if(ch.equals("job"))
        {
            if(user.length()>12)
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
class q4{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the UserName");
        String st=in.next();
        UserName obj=new UserName();
        boolean b=obj.validateUserName(st);
        if(b==true)
            System.out.println("Account is validated.User name=="+st);
        else
            System.out.println("Account is not validated");
        
    }
    
}

/*

OUTPUT 

Enter the UserName
tasdik
Account is not validated

*/