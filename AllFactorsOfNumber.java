package tricks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AllFactorsOfNumber {
	public static ArrayList<Integer> allFactors(int a) {
	    ArrayList<Integer> arr=new ArrayList<Integer>();
	    //Add 1
	    arr.add(1);
	    //Add actual number
	    if(a!=1)
	        arr.add(a);
    for(int i=2;i<=Math.sqrt(a);i++)
    {
        if(a%i==0)
        {
            arr.add(i);
            //if i is a factor then a/i is also a factor, so add it... when i==sqrt(a) {e.g a=36, i=6}, i==a/i, so don't add it
            if(i!=Math.sqrt(a))
                arr.add(a/i);
        }
    }
    //sort the list as the factors were added randomly
    Collections.sort(arr);
    return arr;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        System.out.println(allFactors(t));
	}

}
