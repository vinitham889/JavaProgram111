package patternPrgm;

import java.util.ArrayList;

public class IntersectionOfArrays {
	public static ArrayList<Integer> intersection(int arr1[],int arr2[]){
		ArrayList<Integer> result = new ArrayList<Integer>();
		int i=0,j=0;
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]==arr2[j]) {
				result.add(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i]<arr2[j])
			{
				i++;
			}
			else
			{
				j++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {3,4,5,6,7};
		ArrayList<Integer> commonValue = intersection(arr1,arr2);
		System.out.println(commonValue);
		//output:[3, 4, 5]

	}

}
