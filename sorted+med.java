package number;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class hw {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] num = new int [11];
		int[] sorted = new int [11];
		int i;
		int a=0;
		for(i=0;i<11;i++){
			num[i] = sc.nextInt();
		}
        Arrays.sort(num);
        System.out.print("Sorted : ");
        	for (int i1 : num) {
        		System.out.print(i1 + " ");
        		sorted[a] = i1;
        		a++;
        }
        
        System.out.print("\n");
        System.out.println("Median : " + sorted[5]);
	}
}
