package patternPrgm;

import java.util.Arrays;

public class ArrayInWaveForm {
	void swap(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	void sortInWave(int[] arr,int n)
	{
		Arrays.sort(arr);
		for(int i=0;i<n-1;i+=2)
			swap(arr,i,i+1);
	}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayInWaveForm ob = new ArrayInWaveForm();
		int arr[]= {10, 90, 49, 2, 1, 5, 23};
		//output:2 1 10 5 49 23 90 
		int n = arr.length;
		ob.sortInWave(arr, n);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
