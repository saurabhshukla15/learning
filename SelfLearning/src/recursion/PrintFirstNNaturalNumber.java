package recursion;

public class PrintFirstNNaturalNumber {

    public static void printNaturalNumber(int n){

        if(n<1) return;
        printNaturalNumber(n-1);
        System.out.println(n);

    }

    public static void main(String[] a){
        printNaturalNumber(5);
    }

}
