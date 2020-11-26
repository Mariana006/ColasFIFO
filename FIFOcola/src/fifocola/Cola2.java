 //Cola 1.2 Abecadario Aleatorio
package fifocola;
import java.util.Scanner;
public class Cola2 {
        //Declaramos el vector 
    char Vabc[]=new char [26];
    char tope=0,letra,aux;
   
    public void Llenar(){
       System.out.print(".......... La Cola Ha Sido Llenada ..........\n");
        for(int i=0; i<26; i++){
            if(tope<26){
          letra = (char) (Math.random() * 26 + 'a');
            Vabc[tope]=letra;
            letra ++;   
            tope++;              
        }         
            else{
                System.out.print("..... Lo Siento la Cola Esta Llena .....\n");
            }  
        }
    }
    public void Mostrar(){
if(tope>=0){
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
     public void Ordenar(){
       System.out.print(".......... La Cola Esta Ordenada: ..........\n");
    for(int i=0; i<26-1; i++){
//Declaramos el for aninado este va ordenar los elementos
        for(int j=0; j<26-1; j++){
//Declaramos condicionador if , si numero actual es menor que numero siguente estos se intercambian 
            if (Vabc[j]>Vabc[j+1]){
//Con la ayua de la variable "aux" podremos intercambiar los valores de los elementos 
 //aux es igual al numero actual
         aux=Vabc[j];
//Agregamos el valor actual al valor numero siguiente 
         Vabc[j]=Vabc[j+1];
//El numero siguientes vatener el numero siguiente          
         Vabc[j+1]=aux;
            } 
        }  
    }
    //imprimimos el arreglo de forma ordenada (crecientemente) con un ciclo for
      for(int i=0; i<tope-1; i++){
      System.out.print(" "+Vabc[i]);
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
        Cola2 c =new Cola2();
        Scanner entrada =new Scanner(System.in);
      int opc;
      //"do" nos permite repetir el menu es un cliclo de repetición 
     System.out.print("----- Abecedario Aleatorio -----\n");
      do{
            //Munu 
         System.out.print("\n1. - Agregar\n"
                  + "2. - Llenar\n"
                  + "3. - Mostrar\n"
                  + "4. - Eliminar\n"
                  + "5. - Ordenar\n"
                  + "6. - Salir\n");

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
              case 5:
                  c.Ordenar();
                  break;
          }
      }
      while (opc != 6);
    }  
    }
