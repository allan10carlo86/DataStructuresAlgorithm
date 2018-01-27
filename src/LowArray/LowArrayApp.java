package LowArray;

public class LowArrayApp {
	public static void main(String[] args)
	{
		LowArray arr;				//reference
		arr = new LowArray(100);	//create LowArray object
		int nElems = 0;
		int j;
		
		
		arr.setElem(0,77);
		arr.setElem(1,99);
		arr.setElem(2,44);
		arr.setElem(3,55);
		arr.setElem(4,22);
		arr.setElem(5,88);
		arr.setElem(6,11);
		arr.setElem(7,00);
		arr.setElem(8,66);
		arr.setElem(9,33);
		nElems = 10;
		
		//Display Items		
		for(j=0; j<nElems;j++)
			System.out.print(arr.getElem(j) + " " );
		System.out.println("");
		
		int searchKey = 26;
		for(j=0; j<nElems; j++)
				if(arr.getElem(j) == searchKey)
					break;
		if(j == nElems)
			System.out.println("Can't Find " + searchKey);
		else
			System.out.println("Found " + searchKey);
		
		//Delete value 55
		for(j=0; j<nElems; j++)
			if(arr.getElem(j)==55)
				break;
		for(int k = j; k<nElems;k++)
			arr.setElem(k, arr.getElem(k+1));
		nElems--;
		
		//Display Items
		for(j=0;j<nElems;j++)
			System.out.print(arr.getElem(j) + " ");
		System.out.println("");
		
		//Add Value 54
		searchKey = 54;
		for(j=nElems; j>=0; j--)
		{
			arr.setElem(j+1, arr.getElem(j));
		}
		arr.setElem(0,searchKey);
		nElems++;
		
		//Display Items
		for(j=0;j<nElems;j++)
			System.out.print(arr.getElem(j) + " ");
		System.out.println("");
		}
}
