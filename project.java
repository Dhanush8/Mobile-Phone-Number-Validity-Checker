import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the mobile number: ");
        String number = sc.nextLine();
        
        int size=number.length();
        boolean validity=true;
        String firstPart = number.substring(0,2);
        
        if(size==10 && firstPart.equals("07"))
        {
            for(int i=2;i<=9;i++)
            {
                char x = number.charAt(i);
                if(!Character.isDigit(x))
                {
                    validity=false;
                    break;
                }
            }
        }
        else
        {
            validity=false;
        }
        
        if(validity==true)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }

    }
    
}
