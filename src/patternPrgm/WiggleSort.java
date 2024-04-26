package patternPrgm;

public class WiggleSort {
	void swap(int[] num,int i,int j) {
		int temp=num[i];
		num[i]=num[j];
		num[j]=temp;
	}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WiggleSort obj = new WiggleSort();
		int num[] = {-1, 0, 1, -2, -5};
		for(int i=0;i<num.length-1;i++)
		{
			if(i%2==0) {
				if(num[i]>num[i+1]) {
					obj.swap(num,i,i+1);
				}
			}
			else {
				if(num[i]<num[i+1]) {
					obj.swap(num,i,i+1);
				}
			}
		}
		for(int i=0;i<num.length;i++)
		{
		 System.out.print(num[i]);
		}

	}

}
