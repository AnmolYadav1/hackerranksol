package hackerranksol;
import java.util.*;

public class Table
{   
    
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    System.out.print("Enter the number whose table you want to print : ");
	    int n = sc.nextInt();
	    for(int i=1;i<11;i++){
	        int mul =n*i;
	    System.out.println(n+"x"+i+"="+mul);
	    }
	   
	}
}


