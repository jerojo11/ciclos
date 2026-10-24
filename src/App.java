import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        for (int index = 1; index <= 10; index++) {
            System.out.println("Repetición del ciclo en la vuelta " + index);
        } // Esta llave cierra el ciclo for
        
        sc.close(); 
    }
} 