
/**
 * 
 *
 * @Bruno Gallina
 * 
 */
 
import java.util.Scanner; // importa a classe Scanner, que obtém o input do usuário

public class T2{
    
    public static void main(String[] args) {
        menu();
        }
        
        
    public static void menu() { // menu de opções
        System.out.println("Menu de opções - Conjugar verbos terminados em ER: ");
        System.out.println("1 - Verbos no PRESENTE:");
        System.out.println("2 - Verbos no PRETÉRITO PERFEITO:");
        System.out.println("3 - Verbos no FUTURO:");
        
        Scanner sc = new Scanner(System.in); 
        
        int option = sc.nextInt(); // Scanner espera receber input de  número inteiro após mostrar o menu
        
        switch(option){ // switch das opções (1,2 ou 3) com default para qualquer outra entrada além de 1,2 ou 3.
            case 1:
                System.out.println("");
                presente();
                break;
            case 2:
                System.out.println("");
                preteritoPerfeito();
                break;
            case 3:
                System.out.println("");
                futuroDoPresente();
                break;
            default:
                System.out.println("");
                System.out.println("Opção inválida! (tente a opção 1,2 ou 3)");
                menu();
        }
    }
       
     public static void presente(){ // Classe para conjurar verbos no presente
        System.out.println("Presente");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um verbo no infinitivo terminado com \"er\": ");
        
        String verbo = sc.next();
        
        int tam = verbo.length();
        
                int prefixoER = tam-2;
                
                String prefixo = verbo.substring(0,prefixoER);
                
                System.out.println("");
                System.out.println("Eu "+prefixo+"o");
                System.out.println("Tu "+prefixo+"es");
                System.out.println("Ele "+prefixo+"e");
                System.out.println("Nós "+prefixo+"emos");
                System.out.println("Vós "+prefixo+"eis");
                System.out.println("Eles "+prefixo+"em");
                System.out.println("");
                menu();
        
        
        
    }
    
    public static void preteritoPerfeito(){
        
        System.out.println("Pretérito Perfeito");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um verbo no infinitivo terminado com \"er\": ");
        
        String verbo = sc.next();
        
        int tam = verbo.length();
        
                int prefixoER = tam-2;
                
                String prefixo = verbo.substring(0,prefixoER);
                
                System.out.println("");
                System.out.println("Eu "+prefixo+"i");
                System.out.println("Tu "+prefixo+"este");
                System.out.println("Ele "+prefixo+"eu");
                System.out.println("Nós "+prefixo+"emos");
                System.out.println("Vós "+prefixo+"estes");
                System.out.println("Eles "+prefixo+"eram");
                System.out.println("");
                menu();
    }
    
    public static void futuroDoPresente() {
        
        System.out.println("Futuro do Presente");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um verbo no infinitivo terminado com \"er\": ");
        
        String verbo = sc.next();
        
        int tam = verbo.length();
        
                int prefixoER = tam-2;
                
                String prefixo = verbo.substring(0,prefixoER);
                
                System.out.println("");
                System.out.println("Eu "+prefixo+"erei");
                System.out.println("Tu "+prefixo+"erás");
                System.out.println("Ele "+prefixo+"erá");
                System.out.println("Nós "+prefixo+"eremos");
                System.out.println("Vós "+prefixo+"ereis");
                System.out.println("Eles "+prefixo+"erão");
                System.out.println("");
                menu();
    }

}   
