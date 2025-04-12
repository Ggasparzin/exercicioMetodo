import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite seu nome e idade:");
        lerDados();
    }

public static void lerDados(){
    Scanner scan = new Scanner(System.in);
    String nome = scan.next();
    int idade = scan.nextInt();
    exibirResultado(nome,idade,verificaMaiorIdade(idade));
}
public static boolean verificaMaiorIdade(int idade){
    boolean maiorIdade = false;
    if(idade >= 18){
        maiorIdade = true;
    }
    return maiorIdade;
}
public static void exibirResultado(String nome, int idade, boolean maiorIdade){
    System.out.print("Nome: " + nome + " - Idade: " + idade);
    if(maiorIdade){
        System.out.println(" Maior de idade: sim");
    }
    else{
        System.out.println(" Maior de idade: não");
    }
}
}


