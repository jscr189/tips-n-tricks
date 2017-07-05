package tricks;
import java.util.*;
/*
 * Sieve of Eratosthenes is a simple, ancient algorithm for finding all prime numbers up to any given limit
 */

public class SieveOfEratosthenesForPrime {
	public static boolean isPrime(int n)
	{
		if(n==2) return true;
		if(n<2||n%2==0) return false;
	    for(int i = 3; i*i <= n; i+=2) if(n%i==0) return false;
	    return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(primeslessthann(30));

	}
    public static ArrayList<Integer> primeslessthann(int a) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=2;i<=a;i++)
        {
            if(isPrime(i))
            {
                arr.add(i);
            }
        }
        return arr;
    }

}
