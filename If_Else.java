import java.util.*;
public class If_Else {

    public static void main(String[] args) {
        int age = 18;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your age- ");

        int enter_Age = sc.nextInt();

        if (enter_Age >= age) {
			
            System.out.print("Congratuation you are eligible for Driving licence");

        } else {

            System.out.print("Sorry you are UnderAge");

        }
    }
}