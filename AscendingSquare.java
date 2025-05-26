//import java.util.Arrays;
public class AscendingSquare{
//public static void main(String[] args){
	public static int ascendingSquareIn(int[] array) {

	int [] array = {9, 2, 7, 0, 5};

int[] squared = new int[array.length];
        
       		
	for(int idx = 0; idx < array.length; idx++){
		int currentMin = array[idx];
		int currentMinIndex = idx;
		

	for(int count = idx +1; count < array.length; count++){
		if (currentMin > array[count]){
			currentMin = array[count];
			currentMinIndex = count;	 
			
		}
	}
		if (currentMinIndex != idx){
			array[currentMinIndex] = array[idx];
			array[idx] = currentMin;
		}


	
	for (int counter = 0; counter < array.length; counter++){
		squared[counter] = array[counter] * array[counter];
		}


	}
	System.out.print(Arrays.toString(squared));

        //return squared;


}


}