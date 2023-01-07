package assignment2;

public class Question1 {
    public static void main(String[] args) {

        int[] ar = {10, 20, 5, 10, 30, 70, 5, 8, 20};

        System.out.println("Duplicate elements in present array: ");

        for (int i=0; i< ar.length; i++){
            for (int j=i+1; j< ar.length;j++){
                if(ar[i]==ar[j]){
                    System.out.print(ar[j]+" ");
                }
            }
        }
    }
}
