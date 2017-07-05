package tricks;
import java.util.*;
/*
 * Sieve of Eratosthenes is a simple, ancient algorithm for finding all prime numbers up to any given limit
 */

public class SieveOfEratosthenesForPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(primesum(30));

	}
    public static ArrayList<Integer> primesum(int a) {
        int primes[]=new int[a+1];
        ArrayList<Integer> arr=new ArrayList<Integer>();
        primes[0]=0;primes[1]=0;
        for(int i=2;i<=a;i++)
            primes[i]=1;
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            if(primes[i]==1)
            {
                for(int j=2;i*j<=a;j++)
                    primes[i*j]=0;
            }
        }
        for(int i=2;i<=a;i++)
        {
            if(primes[i]==1)
            {
                arr.add(i);
            }
        }
        return arr;
    }

}
