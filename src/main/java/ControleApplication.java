import entity.Controle;

import java.util.Scanner;

public class ControleApplication {

    static Controle c1 = new Controle(false,0,false);


    public static void main(String[] args) {
      menu();
    }

    public static void menu(){
        System.out.println("Menu");
        System.out.println(c1);
        Scanner scanner = new Scanner(System.in);
        int condition;
        do{
            System.out.println("1- Ligar/Desligar");
            System.out.println("2 - Aumentar volume");
            System.out.println("3 - diminuir volume");
            System.out.println("4 - Pausar");
            System.out.println("5 - Mudo");
            System.out.println("0 - Sair");
            condition = scanner.nextInt();
            switch(condition){
                case 1:
                    c1.play();
                    menu();
                    break;
                case 2:
                    c1.aumentarVolume();
                    menu();
                    break;
                case 3:
                    c1.diminuirVolume();
                    menu();
                    break;
                case 4:
                    c1.pause();
                    menu();
                    break;
                case 5:
                    c1.mudo();
                    menu();
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }while(condition !=0);

    }
}
