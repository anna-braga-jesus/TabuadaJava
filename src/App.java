import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int tabuada;

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual tabuada você deseja? ");
        tabuada = scan.nextInt();
        System.out.println("Tabuada de " + tabuada);

        for(int i = 1; i <= 10 ; i++){
            System.out.println(tabuada + "X" + i + "=" + (tabuada*i));
            
        }
    }
}
