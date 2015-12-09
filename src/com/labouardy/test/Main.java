package com.labouardy.test;

import java.util.Scanner;
import com.labouardy.utility.Command;

public class Main {
	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter source station:");
	    String src=sc.nextLine();
	    System.out.print("Enter destination station:");
	    String dest=sc.nextLine();
	    
	    Command command=new Command();
	    command.path(src, dest);
	   
	    
	}
	
}
