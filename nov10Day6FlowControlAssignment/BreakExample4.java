package com.nov10Day6FlowControlAssignment;

public class BreakExample4 {
	public void breakExample() {
		for(int index=1;index<=100;index++)
		{
			System.out.println(+index);
			if(index==47) {
				break;
			}
		}
	}

	public static void main(String[] args) {

		BreakExample4 breakExample=new BreakExample4();
		breakExample.breakExample();
	}

}
