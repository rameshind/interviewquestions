package main.Azuka;

public class Teat {

    public static void main(String[] args) {
        int a =11;

        System.out.println(isHappyNumber(a));

    }
    static boolean isHappyNumber(int n){

        if(n<=0){
            return false;
        }
        Integer temp= n;

        while(temp>=9){
            int sum = 0;
            String stringInt = temp.toString();
            for(int i= 0;i<temp.toString().length();i++ ){
                sum+= ((int) stringInt.charAt(i)-48)*((int)stringInt.charAt(i)-48);
            }
            temp = sum;
        }
        if(temp != 1){
            return  false;
        }

        return true;

    }
}
