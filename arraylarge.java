class arraylarge
{
	public static void main(String[]args)
	{
		int[]arr={13,12,15,16,18};
		
		int large =arr[1];
		int max=0;
		int secmax=0;
		
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				//large=arr[i];
				secmax=max;
				max=arr[i];
			}
			else if(arr[i]>secmax)
			{
				secmax=arr[i];
			 }	
		}
		
		System.out.println(secmax);
	}
}