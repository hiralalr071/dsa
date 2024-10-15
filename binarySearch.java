
public class binarySearch {


    //This function Is Performe A binary Search Algoritham
    public void binary_search(int[] arr, int target) {
        int first = 0;
        int last = arr.length - 1;
        int i = 0;

        while (i < arr.length) {
            int mid = first + last / 2;
            if (arr[mid] == target) {
                System.out.println("Number Find Index Of ==> " + mid);
                break;
            }

            if (arr[mid] > target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }

        }
    }
    public static void main(String[] args) {
        binarySearch b1 = new binarySearch();

        //Binary search algoritham performe on This Sorted Array
        int[] arr = {1, 8, 10, 12, 18, 20};

        //Call This Function with array Argument and target
        b1.binary_search(arr, 10);
    }
}
