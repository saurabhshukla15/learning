package recursion;

/*
https://www.youtube.com/watch?v=ZhAAEr2C83g&list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG&index=40
 */
public class JosephsProblem {

    public static int joseph(int n, int k) {

        if(n == 1) return 0;
        return (joseph(n-1,k) + k) % n;
    }

    public static void main(String[] a) {
        System.out.println("The right position is : "+ joseph(7,3));
    }

}
