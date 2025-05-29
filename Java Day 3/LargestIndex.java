public class LargestIndex{
	public static void main(String [] args){



	int[] array = {1,3,8,20,24,5};	
	int largest = array[0];
    	int index = 0;
	 	

for(int count = 0; count < array.length; count++){
	if(array[count] > largest){
		largest = array[count];
		index = count;
	}

}

System.out.print(index);


}
}