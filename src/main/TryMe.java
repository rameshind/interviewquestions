package main;

public class TryMe {
    void a(){
        System.out.println("bb");
    }

    public static void main(String[] args) {
        TryMe t = new TryMe(){
            @Override
            void a() {
                System.out.println("aa");
            }
        };
       // t.a();

        System.out.println('h'+'s'+'s');
    }
}
enum AA{
    A, B,C
}