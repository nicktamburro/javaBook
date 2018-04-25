class Quicksort{

	//first we set up a call to the "acutal" Quicksort method
	static void qsort(char items[]){
		qs(items, 0, items.length -1);
	}

	//a recursive version for characters.
	private static void qs(char items[], int left, int right)
	{
		int i, j;
		char x, y;

		i = left; j = right;
		x = items[(left+right)/2];

		do{
			while((items[i] < x) && (i < right)) i++;
			while((x < items[j]) && (j > left)) j--;

			if (i <= j){
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++; j--;
			}
		}while (i <=j);

		if(left<j) qs(itemes, left, j);
		if(i<right) qs(itesm, i, right);
	}
}