package queue;

import java.util.Stack;

public class ConvertDecimalToBinary {

	static Stack st=new Stack<>();
        void convertDTOB(int num){
        	
        	while(true){
        		int r=num%2;
        		num=num/2;
        		st.push(r);
        		if(num==0 || num==1){
        			st.push(num);
        			break;
        		}
        		continue;
        		
        	}
        	
        }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConvertDecimalToBinary
		new ConvertDecimalToBinary().convertDTOB(4);
		Stack s=new ConvertDecimalToBinary().st;
		while(!s.isEmpty()){
			System.out.print(s.pop());
		}

	}

}
