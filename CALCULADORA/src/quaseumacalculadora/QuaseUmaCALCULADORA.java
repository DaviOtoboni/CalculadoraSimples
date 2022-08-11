package quaseumacalculadora;

import java.util.Scanner;
public class QuaseUmaCALCULADORA {

        
    public static void main(String[] args) {
        
        int menu;
        Scanner scan = new Scanner(System.in);
        
        soma op = new soma();
        subtrair op2 = new subtrair();
        dividir op3 = new dividir();
        multiplicar op4 = new multiplicar();
        quadrado op5 = new quadrado();
        
        do{
                
            System.out.println("ESCOLHA UMA OPÇÃO DO MENU:\n 1- SOMAR \n 2- SUBTRAIR \n 3- DIVIDIR \n 4- MULTIPLICAR \n 5- O QUADRADO DO NUMERO \n 0- TERMINAR PROCESSO.");
                menu = scan.nextInt();
            
            switch(menu)
            {

                case 1:{System.out.println("Digite o numero 1");
                            op.n1 = scan.nextDouble();
                          System.out.println("Digite o numero 2");
                            op.n2 = scan.nextDouble();
                          System.out.println(op.SOMAR());}
                break;
                
                case 2:{System.out.println("Digite o numero 1");
                            op2.n1 = scan.nextDouble();
                          System.out.println("Digite o numero 2");
                            op2.n2 = scan.nextDouble(); 
                          System.out.println(op2.SUBTRAIR());}
                break;
                
                case 3:{System.out.println("Digite o numero 1");
                            op3.n1 = scan.nextDouble();
                          System.out.println("Digite o numero 2");
                            op3.n2 = scan.nextDouble();
                          System.out.println(op3.DIVIDIR());}
                break;
                
                case 4:{System.out.println("Digite o numero 1");
                            op4.n1 = scan.nextDouble();
                          System.out.println("Digite o numero 2");
                            op4.n2 = scan.nextDouble();
                          System.out.println(op4.MULTIPLICAR());}
                break;
                
                case 5:{System.out.println("Digite o numero");
                            op5.n1 = scan.nextDouble();
                          System.out.println(op5.QUADRADO());}
                break;
                
                case 0: System.out.println("Até logo.");
                break;
                
            }
            
        }while(menu != 0);
        
    }
    
}
