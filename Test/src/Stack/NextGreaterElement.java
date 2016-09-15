package Stack;

import java.util.Stack;

public class NextGreaterElement {

	Stack<Integer> st=new Stack(); 
	
	void printNGE(int[] nums){
		st.push(nums[0]);
		for(int i=1;i<nums.length;i++){
			if(!st.isEmpty() && nums[i]<=st.peek()){
				st.push(nums[i]);
			}else{
				while(!st.isEmpty()&& nums[i]>st.peek()){
					System.out.println("NGE of "+st.pop()+"  -> " +nums[i]);
				}
				st.push(nums[i]);
			}
		}
		
		while(!st.isEmpty()){
			System.out.println("NGE of "+st.pop()+"  -> " + -1);
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         NextGreaterElement nge=new NextGreaterElement();
        int[] num=new int[]{23,32,24,28,36};
        nge.printNGE(num);
	}

}
