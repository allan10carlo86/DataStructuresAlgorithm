package Array;

public class ArrayApp {
	public static void main(String args[])
	{
		long[] arr; 					//reference to array
		arr = new long[100]; 		//make array
		int nElems = 0; 			//number of items
		int j;						//loop counter
		long searchKey;				//key of item to search for
	//----------------------------------------------------------
		arr[0] = 77;
		arr[1] = 99;
		arr[2] = 44;
		arr[3] = 55;
		arr[4] = 22;
		arr[5] = 88;
		arr[6] = 11;
		arr[7] = 00;
		arr[8] = 66;
		arr[9] = 33;
		nElems = 10;

	    //----------------------------------------------------------
		for (j=0; j<nElems; j++)
		{
			System.out.print(arr[j] + " ");
		}
		System.out.println("");
		//----------------------------------------------------------
		searchKey = 66;
		for(j=0; j<nElems; j++)
				if(arr[j] == searchKey)
					break;
		if(j == nElems)
			System.out.println("Can't find " +searchKey);
		else 
			System.out.println("Found " + searchKey);
		//----------------------------------------------------------
		searchKey = 55;
		for(j=0; j<nElems; j++)
			if(arr[j] == searchKey)
				break;
		for(int k=j; k< nElems-1;k++)
			arr[k] = arr[k+1];
		nElems--;
		//---------------------------------------------------------
		for(j=0; j<nElems;j++)
			System.out.print(arr[j] + " ");
		System.out.println("");
		long x = 0;
		//---------------------------------------------------------
		searchKey = 54;
		for(j=nElems; j>=0; j--)
		{
			arr[j+1] = arr[j];
		}
		arr[0] = searchKey;
		nElems++;
		//---------------------------------------------------------
		for(j=0; j<nElems;j++)
				System.out.print(arr[j] + " ");
		System.out.println("");
		
	}
}
