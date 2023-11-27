package com.nov10Day6FlowControlAssignment;

public class PrintCoreNuts_14 {
	public void printCoreNuts() {
		for(int index1=1;index1<=8;index1++)
		{
			String string="corenuts";
            int value=0;
			for(int index2=1;index2<=8;index2++)
			{
				if(index1>=index2)
				{
				  System.out.print(string.charAt(value++));
				}
			}
			
			  System.out.println();

		}
		
	}

	public static void main(String[] args) {

		PrintCoreNuts_14 printCoreNuts_14=new PrintCoreNuts_14();
		printCoreNuts_14.printCoreNuts();

	}

}
