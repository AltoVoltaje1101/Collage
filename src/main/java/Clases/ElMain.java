/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author felix_5bh1a4y
 */
public class ElMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Creador creador = new Creador();
        Scanner lectura = new Scanner(System.in);
        Triangle triangulo = new Triangle();
        int numero = 0;
        System.out.println("Menu\n 1. Solo los circulos\n1.Solo los triangulos\n3.Solo los cuadrados"
                + "\n4. Solo los rectangulos\n5. Todas las figuras\nPresiona 'A' para avanzar");
        String eleccion = lectura.nextLine();
        if (eleccion.equalsIgnoreCase("a")) {
            numero++;
        }

        while (eleccion.equalsIgnoreCase("a")||eleccion.equalsIgnoreCase("r")||eleccion.equalsIgnoreCase("m")||eleccion.equalsIgnoreCase("n")||
                eleccion.equalsIgnoreCase("g")) {
            switch(numero){
                case 1:creador.soloCirculos();
                break;
                case 2:creador.soloTriangulo();
                break;
                case 3:creador.soloCuadrados();
                break;
                case 4:creador.soloRectangulos();
                break;
                case 5:creador.soloTrapecio();
                break;
                case 6:creador.todoVisible();
                break;
            }
            System.out.println("Menu\n 1. Solo los circulos\n1.Solo los triangulos\n3.Solo los cuadrados"
                    + "\n4. Solo los rectangulos\n5. Todas las figuras\nPresiona 'A' para avanzar\n"
                    + "Presiona 'M' para cambiar las figuras visibles al color morado\nPresiona 'N' para cambiar las figuras visibles al color naranja\n"
            +"Presiona 'g' para generar un nuevo collage\nPresiona 'f' para finalizar el programa\n");
            eleccion = lectura.nextLine();
            switch(eleccion){
                case "a":if (numero==6) numero=0;
                numero++;
                break;
                case "r":
                    if (numero==1||numero==0) numero=6;
                    else if(numero==6) numero=5;
                    else numero=numero-1;
                break;
                case "g":creador.todoFuera();
                creador=new Creador();
                numero=6;
                break;
                case "n":creador.todoNaranja();
                break;
                case "m":creador.todoMorado();
                break;
                case "f": System.out.println("Gracias por usar esta aplicacion, vuelva pronto!");
                creador.todoFuera();
                break;
            }
            System.out.println("Numero: "+numero+"\nRespuesta: "+eleccion);
            
            
        }
    }

}
