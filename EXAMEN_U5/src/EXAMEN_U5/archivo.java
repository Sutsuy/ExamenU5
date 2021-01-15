package EXAMEN_U5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;



public class archivo {

	
	public void Ordenar() {

         File archivo = null;
         FileReader fr = null; 
         BufferedReader br = null;
         String[]  numeros=null;
    
        
        try {
        archivo = new File ("C:\\examen.txt");
         
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
            System.out.println("Numeros del archivo:");
                     System.out.println("\n............................");

        String linea= br.readLine();
         while((linea=br.readLine())!=null){ 
             numeros=linea.split(",");
         }
           for (String texto:numeros){
             System.out.print(texto+" ");
         }
                       System.out.println("\n***********************");
         
     
     int [] ArregloFinal= new int [numeros.length];       
     for (int i=0; i<numeros.length; i++){
         ArregloFinal[i]=Integer.parseInt(numeros[i]);      
   }
     
       
     shellSort(ArregloFinal);
  
       System.out.println("\nNumeros ordenados:");
       for(int i=0;i<ArregloFinal.length;i++){
          System.out.print(ArregloFinal[i]+" ");
      } 
       fr.close();

         }
         
          
      catch(Exception e){
          System.out.println(e);;
         
      }
          
        
    }
	
	public static void shellSort(int[] matrix) {
        for ( int increment = matrix.length / 2;increment > 0;
              increment = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {
            for (int i = increment; i < matrix.length; i++) {
                for (int j = i; j >= increment && matrix[j - increment] > matrix[j]; j -= increment) {
                    int temp = matrix[j];
                    matrix[j] = matrix[j - increment];
                    matrix[j - increment] = temp;
                }
            }
        }
    }
}
