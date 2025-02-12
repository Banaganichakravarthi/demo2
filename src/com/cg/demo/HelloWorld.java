package com.cg.demo;

public class HelloWorld {
	static int prime(int a)
	{ 
		int count=0;
		for(int i=1;i<a+1;i++)
		{
			if ((a%i)==0)
				count=count+1;
		}
	    if (count==2)
	    {
	    	return 1;
	    }
	    else
	    {
	      return 0;
	    }
	}
    
	public static void main(String[] args) {
		int a=11;
		
		System.out.println(prime(a));
		

	}

}
