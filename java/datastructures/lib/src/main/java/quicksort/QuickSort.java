package quicksort;

public class QuickSort {

  public static void quickSort(int[]arr, int low, int high){
    if (low < high) {
      int pivotLocation = partition(arr, low, high);
      quickSort(arr,low,pivotLocation-1);
      quickSort(arr,pivotLocation+1, high);
    }
  }

  public static int partition(int[] arr, int low, int high){
    int pivot = arr[high];
    int leftwall = low;

    for (int i = low; i < high; i++){
      if(arr[i] <= pivot) {
        int temp = arr[i];
        arr[i] = arr[leftwall];
        arr[leftwall] = temp;
        leftwall+=1;
      }
    }
    int temp = arr[leftwall];
    arr[leftwall] = arr[high];
    arr[high]=temp;

    return leftwall;
  }
}
