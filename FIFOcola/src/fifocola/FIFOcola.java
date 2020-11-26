//1.1 Abecedario  
package fifocola;
import java.util.Scanner;
public class FIFOcola {
   //Declaramos el vector 
    char Vabc[]=new char [26];
    char letra='a';
    int tope=0;
    public void Llenar(){
    System.out.print(".......... La Cola Ha Sido Llenada ..........\n");
        for(int i=0; i<26; i++){
            if(tope<26){      
            Vabc[tope]=letra;
            letra ++; 
            tope++;
        }
            else{
                System.out.print("..... Lo Siento la Cola Esta Llena .....");
            }  
        }
    }
    public void Mostrar(){
if(tope>0){
    for(int i=0; i<tope; i++){
        System.out.print(Vabc[i]+" ");
    }    
}
else{
   System.out.print("----- La Cola Esta Vacia -----");
            }
}
    public void Agregar(char dato){
      if (tope <26){                
            Vabc[tope]=dato;           
  tope++; 
          System.out.println("----- Elemento Agregado -----");   }                    
         else{
             System.out.println("----- Cola llena -----");               
      }  
    }
    public void EliminarCola(){
        //Declaramos una variable temporal
     if(tope>0){
        int d=1;
        System.out.println("-----  Dato Eliminado "+" "+ Vabc[d-1]+" -----");
    tope--;
     for(int i=0;i<tope; i++){
    Vabc[i]=Vabc[d];
    d++;
    }
     }
     else{
             System.out.print("---- No hay Elementos A Eliminar -----");
             }
}
    public static void main(String[]args){
        FIFOcola c =new FIFOcola();
        Scanner entrada =new Scanner(System.in);
      int opc;
      //"do" nos permite repetir el menu es un cliclo de repetición 
     System.out.print("<<<<< Abecadraio >>>>>\n..... Menú .....");
      do{
            //Munu 
         System.out.print("\n1. - Agregar\n"
                  + "2. - Llenar\n"
                  + "3. - Mostrar\n"
                  + "4. - Eliminar\n"
                  + "5. - Salir\n");
                
          switch(opc=entrada.nextInt()){
              //Agregar Dato
              case 1:
                   //Solicitamos al usuario que dijite su dato 
                  System.out.println("Ingresa el Dato:\n");
                  char dato=entrada.next().charAt(0);
                 c.Agregar(dato);
                  break;
                //Llenar  
              case 2: 
                  c.Llenar();
                  break;
                  //Mostrar
              case 3:
                  c.Mostrar();
                  break;
              case 4:
                  c.EliminarCola();
                  break;                  
          }
      }
      while (opc != 5);
    }
}
    
