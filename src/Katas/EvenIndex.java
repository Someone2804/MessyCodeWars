package Katas;

public class EvenIndex {

    public static void main(String[] args){
        System.out.println(findEvenIndex(new int[] {8, 0}));
    }
    public static int findEvenIndex(int[] arr) {
        // your code
        if(arr == null){
            return -1;
        }
        long lefthalf = 0;
        long righthalf = 0;
        for(int i = 0; i < arr.length-1; i++){
            lefthalf += arr[i];
        }
        if(lefthalf == righthalf){
            return arr.length-1;
        }
        for(int i = arr.length-2; i >= 0; i--){
            righthalf += arr[i+1];
            lefthalf -= arr[i];
            if(righthalf == lefthalf){
                return i;
            }
        }
        return -1;
    }
}
