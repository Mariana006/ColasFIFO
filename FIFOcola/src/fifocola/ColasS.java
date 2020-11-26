package fifocola;
import java.util.Scanner;
public class ColasS {
     public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    int opcion;
    
    do{
        System.out.print("------------- Menú de Programas -------------\n1. - Mostrar el Abecedario Programa 1.1\n"
                        + "2. - Mostrar Abecedario Automatico Programa 1.2\n"
                        + "3. - Pilas A y B Programa 1.3\n"
                        + "4. - Mostrar Abecedario Aleatorio sin repetir programa 1.4\n"
                        + "5. - Salir\n");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    FIFOcola.main(args);
                    break;
                case 2: 
                    Cola2.main(args);
                    break;
                case 3:
                    Cola3.main(args);
                    break;
                case 4:
                    Cola4.main(args);
                    break;
            }
        } 
    while (opcion != 5);
    }
}
        
