package patternPrgm;

import java.util.Arrays;

public class Anagram {
	public static void isAnagram(String str1,String str2) 
	{
		String s1=str1.replaceAll("\\s+", "");
		String s2 = str2.replaceAll("\\s+","");
		boolean status = true;
		if(s1.length()!=s2.length()) {
			status = false;
		}
		else
		{
			char[] arr1 = s1.toLowerCase().toCharArray();
			char[] arr2 = s2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			status = Arrays.equals(arr1, arr2);
		}
		if(status)
		{
			//return true
			System.out.println(s1+" and "+s2+" are anagram");
		}else {
			//return false
			System.out.println(s1+" and "+s2+" are not anagram");
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isAnagram("keep","peek");
		 isAnagram("Mother In Law", "Hitler Woman"); 
		 isAnagram("car","race");
		 
		 //output : keep and peek are anagram
		 //MotherInLaw and HitlerWoman are anagram
		 //car and race are not anagram

	}

}
