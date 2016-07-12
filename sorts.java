public class sorts {
	public static void main(String args[]) {
		int arr[] = new int[]{7, 4, 9, 5, 2, 6, 1, 3, 8};
		//swap(arr, 0, 1);
		//System.out.println(arr[0]+" "+arr[1]);
		print(arr, "Original array:");
		print(insertionSort(new int[]{7, 4, 9, 5, 2, 6, 1, 3, 8}),"Insertion sort:");
		print(selectionSort(new int[]{7, 4, 9, 5, 2, 6, 1, 3, 8}),"Selection sort:");
		print(bubbleSort(new int[]{7, 4, 9, 5, 2, 6, 1, 3, 8}),"Bubble sort:   ");
		print(quickSort(new int[]{7, 4, 9, 5, 2, 6, 1, 3, 8}, 0, arr.length-1), "Quick sort:    ");
	}
	
	public static int[] insertionSort(int[] arr) {
		for (int i=1; i<arr.length; i++) {
			for(int j=i; j>0 && arr[j]<arr[j-1];j--) {
				swap(arr, j-1, j);
			}
		}
		return arr;
	}
	
	public static int[] selectionSort(int[] arr) {
		int min=0;
		for (int j=0; j<arr.length; j++){		
			min=j;
			for(int i=j; i<arr.length; i++) {
				if(arr[min] > arr[i]) { min = i; }
			}
			swap(arr, j, min);
		}
		return arr;
	}
	
	public static int[] bubbleSort(int[] arr) {
		int count = 0;
		do{
			count = 0;
			for ( int i=0;i<arr.length-1; i++) { 
				if (arr[i] > arr[i+1]) {  
					swap(arr, i, i+1);
					count++;
				}
			}
		} while(count != 0); 
		return arr;
	}
	
	//TO DO: chamada recursiva do quicksort
	public static int[] quickSort(int[] arr, int left, int right) {
		int pivot=left;
		while(left != right) {
			if (pivot == left){
				if (arr[right] < arr[pivot]) {
					swap(arr, right, pivot);
					pivot = right;
				} else { right--; }
			}
			if (pivot == right){
				if (arr[left] > arr[pivot]) {
					swap(arr, left, pivot);
					pivot = left;
				} else { left++; }
			}
		}
		return arr;
	}
	
	//TO DO: mergesort
	public static void mergeSort(int[] arr, int sub_size) {}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void print(int[] arr) {
		String out = "[ ";
		for(int i=0; i<arr.length;i++) { out+=arr[i]+" "; }
		System.out.println(out+"]");
	}
	public static void print(int[] arr, String message) {
		String out = message+" [ ";
		for(int i=0; i<arr.length;i++) { out+=arr[i]+" "; }
		System.out.println(out+"]");
	}
}