package main;

public class HalfStar {

    static void  print(int n){
        for(int j=n;j>0;j--) {
            for (int i = n-j; i >= 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int j=0;j<=n;j++) {
            for (int i = n-j; i >= 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(6);
    }
}
