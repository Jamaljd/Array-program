class arraysmall
{
	public static void main(String[]args)
	{
		int[]arr={13,12,15,16,18};
		
		int small =arr[0];
		
		for (int i=1;i<arr.length;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		
		System.out.println(small);
	}
}