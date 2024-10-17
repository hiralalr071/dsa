
//Program Of linear Search
public class linearSearch {

    public void linear_search(int[] arr,int target){
        for(int i = 0; i<arr.length - 1; i++){
            if (arr[i] == target) {
                System.out.println("The Target Find At"+i);
                break;
            }
            else{
                System.out.println("Finding...");
            }
        }
    }
    public static void main(String[] args) {
        linearSearch obj1 = new linearSearch();

        int[] sample_array = {20,30,50,80,60,80,40};
        obj1.linear_search(sample_array,50);
    }
    
}
