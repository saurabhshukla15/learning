package recursion;

public class GenerateBalanceParentheses {

    public static void balParentheses( char[] arr, int n, int i, int o, int c ){
        if (i==arr.length) System.out.println(arr);

        if(o < n) {
            arr[i] = '(';
            balParentheses(arr, n, i+1, o+1, c);
        }
        if (c < o) {
            arr[i] = ')';
            balParentheses(arr, n, i+1, o, c+1);
        }
    }

    public static void main(String[] a) {

        int n= 2;
        char[] arr = new char[n*2];
        balParentheses(arr, n, 0,0,0);
    }

}
