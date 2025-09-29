package ordenarNumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ordenarNumeros {
    public static void main(String[] args) {

        //Creamos el isr y el br para interactuar con los archivos
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Linea= null;
        //Estructura try catch para la ejecución
        try{
            //Bucle para convertir los numeros
            while((Linea = br.readLine()) != null){

                //Crea el array para guardar los numeros individualmente
                String [] Dato = Linea.split(" ");

                //Creamos el array con la longitud del array con los numeros
                int [] numeros = new int [Dato.length];

                //Convertimos a numeros los String guardados como números
                for(int i=0; i<Dato.length; i++){
                    numeros[i] = Integer.parseInt(Dato[i]);
                }

            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally{
            try{

            }catch (IOException e2){
                System.out.println("Error en ordenarNumeros.");
            }
        }


        }


    }
