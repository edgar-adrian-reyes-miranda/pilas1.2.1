package pilas1;

import java.util.Scanner;

public class pilas1_2 {
    public static void main(String[] args) {
        Scanner pil= new Scanner(System.in);
        int lim=26, opc=6,liml=0;
        char pilas[]=new char[26];
        char letras, central;
        letras='A';
        
        ///ingresamos los tipos de variables que necesitaremos hoara comenzaremos con la practica del codigo en selccion
        do{
            System.out.println("Menu");
            System.out.println("\t 1.-llenar"
                               +"\t 2.-mostrar"
                                +"\t 3.-eliminar"
                                +"\t 4.-agregar"
                                +"\t5.-ordenar"
                                +"\t6.- salir");
             int i=0;
              int j=0;
            switch(opc =pil.nextInt()){
               
                case 1 -> {
                    for (i = 0; i < lim; i++) {
                        pilas[i]=(char)(Math.random()*lim+'A');
                        for (j = 0; j <i ; j++) {
                            if(pilas[j]==pilas[i]){
                                i--;
                            }
                        }
                        
                    }
                    for(j=0;j<26;j++){
                        liml++;
                        letras++;
                    }
                }
                case 2 -> {
                    for (i = liml-1; i >= 0; i--) {
                        System.out.println(" "+pilas[i]);
                    }
                }
                case 3 -> {
                    if(liml!=0){
                        System.out.println("Se ha eliminado el dato");
                        liml--;
                    }
                    else{
                        System.out.println("No hay ningun elemeto");
                    }
                }
                case 4 -> {
                    if(liml<26){
                        System.out.println("Ingresa un letra: ");
                        letras=pil.next().charAt(0);
                        letras++;
                        liml++;
                    }else{
                        System.out.println("No hay nada...");
                    }
                }
                case 5 -> {
                    for ( i = 0; i < lim; i++) {
                        for ( j = 0; j < (lim-1); j++) {
                            if(pilas[j]>pilas[j+1]){
                                central=pilas[j];
                                pilas[j]=pilas[j+1];
                                pilas[j+1]=central;
                            }
                        }
                    }
                    for (i = 0; i <lim; i++) {
                        
                    }
                }
                default -> System.out.println("Incorrecta opcion");
            }
            //daremos a opciones de menu que nos ayudara a complentar el programa
                    }while(opc!=6);
        
    }
}
