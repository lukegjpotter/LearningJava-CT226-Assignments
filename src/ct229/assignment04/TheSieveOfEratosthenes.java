package ct229.assignment04;
//07013418 Luke Potter 22-10-08
//This program prints out prime numbers by employing "The Sieve of Eratosthenes".

public class TheSieveOfEratosthenes
{
	public static void main(String[] args)
	{
		//declare variables
		int i, k, SIZE=1000;
		boolean [] array = new boolean [SIZE];
		
		//populate array with true values 
		for(i=0; i<SIZE; i++)
		{
			array[i] = true;
		}
		
		//making all multiples false
		for(i=2; i<SIZE; i++)
		{
			if(array[i] == true)
			{
				for(k = i+1; k<SIZE; k++)
				{
					if((k%i) == 0)
					{
						array[k] = false;
					}
				}
			}
		}
		
		//printing out the true values
		System.out.println("*** Prime Numbers ***");
		for(i=2; i<SIZE; i++)
		{
			if(array[i] == true)
				System.out.println(i+ " is a prime number.");
		}
	}
}