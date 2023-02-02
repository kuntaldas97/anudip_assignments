public class Alternate {
  
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {6, 7, 8, 9, 10};
    addAlternateElements(arr1, arr2);
    printArray(arr2);
  }

  public static void addAlternateElements(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      arr2[i] = arr1[i] + arr2[i];
    }
  }

  public static void printArray(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}