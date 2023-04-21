import java.util.*;
import java.lang.*;

class Main{

static int computeSalary(int basic)
{
    double allowance;
    double hra, da, pf;
    double Netsalary;
	
	hra = 0.5 * basic;
     pf= 0.12 * basic;
	allowance = 0.75 * basic;
	Netsalary = (basic + hra  +allowance - pf);
	System.out.println("Basic salary = "+(int)basic);
	System.out.println("HRA = "+(int)hra);
	System.out.println("Special allowance = "+(int)allowance);
	System.out.println("PF = "+(int)pf);
	System.out.println("Net Payable salary = "+(int)Netsalary);
	return 0;
	
}

public static void main (String[] args)
{
	Scanner reader=new Scanner(System.in);
	int basic=reader.nextInt();
    computeSalary(basic);
}
}



 
