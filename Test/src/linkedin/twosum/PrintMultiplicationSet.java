package linkedin.twosum;

import java.util.ArrayList;
import java.util.List;

public class PrintMultiplicationSet {

List<String> list=new ArrayList<>();

List<Integer> primeNumbers=new ArrayList<>();

	void printMultiply(int n){
	for(int i=1;i<n;i++){
		if(n%i==0){
		String s=i+"*"+n/i;
		String k=n/i+"*"+i;
		if(!(list.contains(s)||list.contains(k)))
			list.add(s);
        if(!primeNumbers.contains(i)){
			
		}
		
		}
		
	}
	}
	
	void setPrimeNumber(int n){
		for(int i=1;i<n;i++){
			boolean isPrime=true;
            if(i==1|| i==2){
            	primeNumbers.add(i);  
            	continue;
            }
			
			label1:
			for(int j=2;j<=n/2;j++){
			  if(i%j==0){
				  isPrime=false;
				  break label1;
			  }
			  if(isPrime)
				  primeNumbers.add(i);
			}

		}
	}
public static void main(String a[]){
	PrintMultiplicationSet p=new PrintMultiplicationSet();
	p.setPrimeNumber(12);
	p.printMultiply(12);
	for(String s:p.list){
		System.out.println(s);
	}
}
	
}
