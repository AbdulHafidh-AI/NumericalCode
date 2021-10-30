public class Main
{   
    public static void main(String args[]) 
    {   
        int number = 83;
        int number2 = 73;
        int lastDigit = 0;
        int lastDigit1 = 0;
 
        // find last digit
        lastDigit = number%10;
        System.out.println("Last digit: "+lastDigit);
        lastDigit1 = number2%10;
        System.out.println("Last digit2: " + lastDigit1);
        if(lastDigit == lastDigit1){
            System.out.println("sama");
        }else{
            System.out.println("ga sama");
        }
    }
}