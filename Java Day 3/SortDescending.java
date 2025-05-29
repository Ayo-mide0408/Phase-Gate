import java.util.Arrays;
public class SortDescending{
public static void main(String[] args){

	int [] array = {3,1,5,8,6,4} ;      
       	//int [] array2 =  ;      
		

	for(int idx = 0; idx < array.length-1; idx++){
		int currentMin = array[idx];
		int currentMinIndex = idx;
		

	for(int count = idx +1; count < array.length; count++){
		if (currentMin < array[count]){
			currentMin = array[count];
			currentMinIndex = count;	 
			
		}
	}
		if (currentMinIndex != idx){
			array[currentMinIndex] = array[idx];
			array[idx] = currentMin;
		}	
	


	}
	System.out.print(Arrays.toString(array));


}


}