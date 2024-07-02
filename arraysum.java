class arraysum
{
	public static void main(String[]args)
	{
		int[] arr ={13,14,15,16,17};
		int sum=0;
		
		for (int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum :"+sum);

		
	}
}