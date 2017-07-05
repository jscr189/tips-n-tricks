package tricks;
import java.io.*;
import java.util.*;
/*
 * According to Goldbach's conjecture, Every even integer greater than 2 can be expressed as the sum of two primes.
 * Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.
 * If there are more than one solutions possible, return the lexicographically smaller solution.
 * e.g: If [a, b] is one solution with a <= b, and [c,d] is another solution with c <= d, then [a, b] < [c, d]
 */
public class PrimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(primesum(12));

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
            if(primes[i]==1&&primes[a-i]==1)
            {
                arr.add(i);
                arr.add(a-i);
                break;
            }
        }
        return arr;
    }

}
