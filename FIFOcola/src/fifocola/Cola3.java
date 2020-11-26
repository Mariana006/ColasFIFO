//1.3 Llenar y generar colas aleatorios Cola A y Cola B
package fifocola;
import java.util.Scanner;
import java.util.Random;
public class Cola3 {
     public static void main(String[] args) {
   Scanner obj = new Scanner(System.in);
        Random naleatorio = new Random();
   int tope=0,tamcola,opc;
    System.out.print("______ Valores Aleatorios A y B ______\n");
        System.out.print("Ingrese el tamaño de la cola:");
        tamcola = obj.nextInt();
        //Vectores 
        int Acola[] = new int[tamcola];
        int Bcola[] = new int[tamcola];//Vector "Acola" B
        int Ccola[] = new int[tamcola]; //Vector cola C
        
        do {
            System.out.println("\n1. - Llenar Cola A,B\n"
                    + "2. - Mostrar Cola A,B\n"
                    + "3. - Vaciar Cola A,B\n"
                    + "4. - Unir Cola A,B\n"
                    + "5. - Mostrar Cola C\n"
                    + "6. - Salir");
            switch (opc = obj.nextInt()) {
                //Llenar pilas A
                case 1:
                    for (int i = 0; i < tamcola; i++) {
                        Acola[i] = naleatorio.nextInt(100 - 1 + 1) + 1;
                    }
                    System.out.println();
//se declara el rango de la serie de numeros que quiero mostara primero se declara el fin seguido del incio de él
//Declramos un cliclo for 
                    for (int j = 0; j < tamcola; j++) {
                        //la posicion j se va guardar en el vector bpila 
//Se declara primero el fin , el inicio de la serie de nuermos que va mostrar de forma aleatoria
                        //naleatoria es el nombre del vecotr , utilizamos el metodo random
                        Bcola[j] = naleatorio.nextInt(200 - 100 + 1) + 100;                             
                    }
System.out.print("..... Cola Llena .....");
            break;
                     //Mostrar 
                case 2:
                    //Declaramos el ciclo  for 
                    for (int i = 0; i < Acola.length; i++) {
                        //Se imprimira los elementos de A
                        System.out.println("Cola A:" + Acola[i]);
                    }
                    System.out.println();
                    //Declaramos un cliclo for para imprimir los elementos de b
                    for (int j = 0; j < Bcola.length; j++) {
                        //mostramos los elementos de la pila B el nombre del vector "bpila " con el contador "j"
                        System.out.println("Cola B:" + Bcola[j]);
                    }
                    break;
                    //Vaciar pila AB
                case 3:
                    //Se declara el contador que es igual a ser así , mostrando ceros de que esta bacio 
                    for(int i=0; i<tamcola;i++){
                        Acola[i]=0;
                        Bcola[i]=0;
                       
                    }
                    System.out.print("..... Cola Vacia .....");
                    break;
                    //Unir pilas A,B
   case 4:   
                    //Se inicializa j en 0 , se ira aunmentan en una unidad como vayase ejecutando el ciclo for
                    int j=0;
                    for (int i=0; i<tamcola; i++){
                       Ccola[j]=Acola[i]+Bcola[i];                      
                       j++;                       
             } 
                    System.out.print("..... Cola A y B Unidas .....");
                   break;
                    //Mostra pila C
                case 5:
                    System.out.print("Cola C =A+B\n");
                    //Se declara un ciclo for 
                    for (int i=0; i<tamcola; i++){
                        //Mandar inprimir el vector con el contador "i"
                         System.out.print(" "+Ccola[i]);
                    }
                    break;
            }
        } while (opc != 6);
    }
}
