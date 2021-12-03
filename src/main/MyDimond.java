package main;

public class MyDimond {



    public static void printDimond(int n){

        for(int i=0 ;i< n; i++){
            int k=0;
            for( k=1; k<=n/2-i; k++) {
                System.out.print(" ");
            }

                System.out.print(1);

            for(k=n-1; k>n/2-i; k--) {
                System.out.print(" ");
            }
           // System.out.print(1);
            System.out.println();
        }


    }

    public static void main(String[] args) {

        printDimond(5);
    }

}
