/*
 * @(#)BubbleSort.java        1.0.0 26/09/27
 *
 * Bubble Sort implementation for ascending integer arrays.
 *
 * Built using Vim
 * OpenJDK Runtime Environment 21.0.12
 *
 */


public class BubbleSort{

	public static void main(String[]args){
		int arr[] = {1,56,38,3, 0, 16, 74};
		int i;
		int j;
		int k;
		int l;
		boolean flag;
		k = 0;
		l = 0;
		
		for(i = 0; i < arr.length-1;i++){
			flag = true;
			for(j = 0; j < arr.length-1;j++){
				if(arr[j]> arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					k++;
					flag = false;
				}
				l++;
				
			}
			if(flag){
				break;
			}
		}

		for(i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
	}
}
