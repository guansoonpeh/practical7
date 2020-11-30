/**
 * @(#)Q2Driver.java
 *
 *
 * @author 
 * @version 1.00 2015/5/4
 */


public class Driver {

  
	public static double computeTotalCollection(PatientBill[] arr) {
		double total = 0.0;
		
                //todo:: calculate total
		
		return total;	
	}
	
	public static void main(String [] args){
		PatientBill[] bills = new PatientBill[4];
		bills[0] = new OutpatientBill("Zoe Smith", 30.00);
		bills[1] = new InpatientBill(500.0, 50.00, 'S', 8, "Mary Yan");
		bills[2] = new InpatientBill(200, 12.50,'P', 10, "Jack Sparrow");
		bills[3] = new OutpatientBill("Andy Lau" , 50.00);
		
		System.out.println("Original array: ");
		for (int i = 0; i < bills.length; ++i)	
			System.out.println("\n" + bills[i]);
		
		//bills = selectionSort(bills);
	
		//System.out.println("\n\nBills sorted in alphabetical order of name: ");
		
//	
//		for (int i = 0; i < bills.length; ++i)	{
//			System.out.println("\n" + bills[i]);
//			System.out.printf("Total collection: RM%.2f\n", bills[i].calculateTotalCharges());
//		}
//                
		System.out.println("Total bills = RM "+computeTotalCollection(bills)	);
                
	}
//	
//	public static PatientBill[] selectionSort(PatientBill[] arr) {
//		for (int i = 0; i < arr.length; ++i) {
//			int indexOfSmallest = i;	// assign the first index of the subarray as the initial indexOfSmallest
//			for (int j = i+1; j < arr.length; ++j) {
//				if (arr[j].compareTo(arr[indexOfSmallest]) < 0) // if the current array element is smaller than the
//					indexOfSmallest = j;														// element at indexOfSmallest, update indexOfSmallest
//			}
//			// swap the element at indexOfSmallest with the current subarray's first element 																									
//			PatientBill tempArr = arr[indexOfSmallest];
//			arr[indexOfSmallest] = arr[i];
//			arr[i] = tempArr;
//		}
//		return arr;
//	}
}
    
