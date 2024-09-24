import java.util.*;
public class java_exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Preço: ");
        int price = sc.nextInt();
        System.out.println("Qual a categoria de desconto");
        System.out.println("A - 10%, B - 15%, C - 20%, D - 25%, E - 50%");
        String vazio = sc.nextLine();
        String categoria = sc.nextLine();


        switch(categoria) {
            case "A":
                System.out.println(name+" deve pagar "+(price - (price*0.10)));
                break;

            case "B":
                System.out.println(name+" deve pagar "+(price - (price*0.15)));
                break;

            case "C":
                System.out.println(name+" deve pagar "+(price - (price*0.20)));
                break;

            case "D":
                System.out.println(name+" deve pagar "+(price - (price*0.25)));
                break;

            case "E":
                System.out.println(name+" deve pagar "+(price - (price*0.50)));
                break;

            default:
                System.out.println("Invalido");
                break;
        }
    }
}