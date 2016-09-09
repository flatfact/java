package number;

import java.util.Scanner;

public class numList {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int i;
		int arr[] = new int [10];
		int oddList[] = new int [100];
		int evenList[] = new int [100];
		int negativeList[] = new int [100];
		int j = 0;
		int k = 0;
		int l = 0;
		for (i=0;i<10;i++){
			arr[i] = sc.nextInt();
		}
		for (i=0;i<10;i++){
			if(arr[i]>0){
				if(arr[i]%2 == 0){
					evenList[j] = arr[i];
					j++;
				}
				else if (arr[i]%2 != 0){
					oddList[k] = arr[i];
					k++;
				}
			}
			else{
				negativeList[l] = arr[i];
				l++;
			}
			
		}
		System.out.print("Even : ");
		for(i=0;i<j;i++){
			System.out.print(evenList[i] + ",");
		}
		
		System.out.println("\n----------------");
		System.out.print("Odd : ");
		for(i=0;i<k;i++){
			System.out.print(oddList[i] + ",");
		}		
		System.out.println("\n----------------");
		System.out.print("Negative : ");
		for(i=0;i<l;i++){
			System.out.print(negativeList[i] + ",");
		}
		System.out.println("\n----------------");
	}
}
