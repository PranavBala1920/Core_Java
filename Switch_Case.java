import java.util.*;

public class Switch_Case {

public static void main(String[] args){
	
	String monthname;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Month name-"); 
	int month = sc.nextInt();
	
	switch(month){
		case 1: 
		monthname = "jan";
		break;
		
		case 2:
		monthname = "feb";
		break;
		
		case 3:
		monthname = "march";
		break;
	
	    case 4:
		monthname = "april";
		break;
		
		case 5:
		monthname = "may";
		break;
		
		case 6:
		monthname = "june";
		break;
		
		case 7:
		monthname = "july";
		break;
		
		case 8:
		monthname = "august";
		break;
		
		case 9:
		monthname = "september";
		break;
		
		case 10:
		monthname = "octomber";
		break;
		
		case 11:
		monthname = "november";
		break;
		
		case 12:
		monthname = "december";
		break;
		
		 default:
		 monthname = "Give Corrct month details";
	}
	
	System.out.print(monthname); 
				
	}
}
 