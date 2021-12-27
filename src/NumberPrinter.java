public class NumberPrinter {
    void printNumber (int a){
        System.out.println("liczba którą chcesz wyświetlić to: " + a);
    }

    void printNumber (int a, int b){
        printNumber(a);
        printNumber(b);
    }

    void printNumber (int a, int b, int c){
        printNumber(a,b);
        printNumber(c);
    }


}

