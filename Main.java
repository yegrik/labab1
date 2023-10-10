import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static int Fib(int n){
        if (n < 2){
            return 1;
        }
        else{
            return Fib(n-1) + Fib(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int num_of_el = input.nextInt();
        int sum = 0;

        /* first & sec task
        for (int i = 0; i < num_of_el; i++){
            int el = input.nextInt();
            sum += el;
            numbers.add(el);
        }
        int middle = sum / num_of_el;
        System.out.println(middle);


        do {
            int el = input.nextInt();
            numbers.add(el);
            sum+= el;
            num_of_el--;
        }
        while (num_of_el>0);
        int max_el = 0;
        int min_el = 1;
        int i = 0;
        while (i < numbers.size()){
            max_el = Math.max(max_el, numbers.get(i));
            min_el = Math.min(min_el, numbers.get(i));
            i++;
        }
        System.out.println(max_el);
        System.out.println(min_el);

        System.out.println(" Общее количество аргументов: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент" + i + ": " + args[i]);
        }
        */
        int n = 1;
        while(n < 11){
            double H = Math.log(n) + 0.5772;
            n++;
            System.out.printf("%d член ряда равен - %f", n, H);
        }
        int n_to_fib = input.nextInt();
        System.out.println(Fib(n_to_fib));
    }
}