package insertsort;

public class InsertionSort {

  public static int[] InsertSort(int[] input) {
    int[] output = new int[input.length];
    output[0] = input [0];
    for (int i = 1; i < input.length; i++){
     Insert(output, input[i], i);
    }
    return output;

  }

  public static void Insert(int[] sorted, int value, int index){
    int i = 0;
    while (i < index && value > sorted[i]){
      i = i + 1;
    }
    while (i < sorted.length) {
      int temp = sorted[i];
      sorted[i] = value;
      value = temp;
      i = i + 1;
    }
  }
}
