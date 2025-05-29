import java.util.Arrays;

import java.util.Scanner;
public class FactorNumber{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Factor of number: ");
int number = input.nextInt();
int counter = 0;
int idx = 0;


for(int count = 1; count <= number; count++){
	if (number % count == 0){
	counter++;
	}
}
int [] factor = new int [counter];
for(int index = 1; index <= number; index++){
	if (number % index == 0){
	factor[idx] = index;
	idx++;
}
}
System.out.print(Arrays.toString(factor));

}

}





