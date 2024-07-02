class arraysearch
{
	public static void main (String[]args)
	{
		int[] arr={11,12,16,17,18,11,12,11};
		int value=15;
		boolean flag=false;
		
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]==value)
			{
				System.out.println(value+"found @ index:"+i);
				flag=true;
			}
		}
		if (flag==false)
		{
			System.out.println(value+":not found in array");
		}
	}
}