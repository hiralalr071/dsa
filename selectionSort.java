//program of selection sort 

public class selectionSort {

    //this function is sort array using selection sort method
    public void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < (arr.length - 1) - i; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {

        selectionSort s1 = new selectionSort();
        int arr[] = { 20, 30, 10, 30, 50 };
        s1.selection_sort(arr);

        //printing sorted array
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }

    }

}
