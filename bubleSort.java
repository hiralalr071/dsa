// This Program Buble Sort Algiritham
public class bubleSort {

    //function to arrage array ascending order using buble sort algoritham
    public void bubleShort(int[] arr){

        for(int i = 0; i<arr.length - 1; i++){
            for(int j = 0; j<(arr.length-1) - i; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        bubleSort b1 = new bubleSort();

        //created a sample array and insilization with random number
        int[] samplearray = {50,20,60,10,80,50};

        b1.bubleShort(samplearray);
        for(int i=0;i<samplearray.length -1 ; i++){
            System.out.print(samplearray[i]+",");
        }
    }
    
}
