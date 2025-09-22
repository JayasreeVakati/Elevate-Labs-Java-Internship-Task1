import java.util.*;
class Mian{
    public static int addition(int num1,int num2){
        return num1+num2;
    }
    public static int subtraction(int num1,int num2){
        return num1-num2;
    }
    public static int multiplication(int num1,int num2){
        return num1*num2;
    }
    public static int division(int num1,int num2){
        return num1/num2;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Choose option to perform arithmetic action: ");
        System.out.println("1. Addition\n 2. Subtraction\n 3. Multiplication\n 4.Division");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Additon: "+addition(num1,num2));
                break;
            case 2:
                 System.out.println("Subtraction: "+subtraction(num1,num2));
                 break;
            case 3:
                System.out.println("Multiplication: "+multiplication(num1,num2));
                break;
            case 4:
                System.out.println("Division: "+division(num1,num2));
                break;
            default:
                System.out.println("Invalid input choice");
        }

    }
}