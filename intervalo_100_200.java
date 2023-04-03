import java.util.Scanner;

public class intervalo_100_200 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer num;
        System.out.print("Digite um numero: ");
        while(!ler.hasNextInt()){
            System.out.println("Caractér não permitido ");
            System.out.println("Digite um numero: ");
            ler.next();
        }
        num = ler.nextInt();
        if(num >= 100 && num <= 200){
            System.out.println("Esta no intervalo");
         } else {
            System.out.println("Não esta");
        }
    }
}
