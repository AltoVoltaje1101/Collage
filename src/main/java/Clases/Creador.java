/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Random;

/**
 *
 * @author felix_5bh1a4y
 */
public class Creador {

    private Triangle[] triangulo;
    private Square[] cuadrado;
    private Circulo[] circulo;
    private Rectangulo[] rectangulo;
    private Trapecio[] trapecio;
    private Random numero = new Random();
    private int total;
    private int[] contador;
    private String[] colores;

    public Creador() {
        int a = 0;
        contador = new int[5];
        this.triangulo = new Triangle[numero.nextInt((40 - 20) + 20)];
        this.circulo = new Circulo[numero.nextInt((40 - 20) + 20)];
        this.cuadrado = new Square[numero.nextInt((40 - 20) + 20)];
        this.rectangulo=new Rectangulo[numero.nextInt((40 - 20) + 20)];
        this.trapecio=new Trapecio[numero.nextInt((40 - 20) + 20)];
        total = 0;
        String[] colores={"black","yellow","blue","red","green","magenta","orange","purple"};
        this.total = triangulo.length + circulo.length + cuadrado.length+rectangulo.length+trapecio.length;
        System.out.println("Triangulo"+triangulo.length+"Circulo:"+circulo.length+"Cuadrado:"+cuadrado.length+"Rectangulo:"+rectangulo.length);
        for (int i = 0; i <this.total; i++){
            int resultado = numero.nextInt(100);
            if (resultado <= 20) {
                a = 1;
            } else if (resultado <= 40) {
                a = 2;
            } else if (resultado <= 60) {
                a = 3;
            } else if (resultado <= 80) {
                a = 4;
            } else if (resultado <= 100) {
                a = 5;
            }
            switch (a) {
                case (1):
                    if (contador[0] < triangulo.length) {
                        triangulo[contador[0]] = new Triangle();
                        triangulo[contador[0]].setX(numero.nextInt(500));
                        triangulo[contador[0]].setY(numero.nextInt(500));
                        triangulo[contador[0]].makeVisible();
                        triangulo[contador[0]].changeSize(numero.nextInt(100-20)+20,numero.nextInt(100-20)+20);
                        triangulo[contador[0]].changeColor(colores[numero.nextInt((colores.length))]);
                        contador[0]++;
                    }
                    break;
                case (2):
                    if (contador[1] < circulo.length) {
                        circulo[contador[1]] = new Circulo();
                        circulo[contador[1]].setX(numero.nextInt(500));
                        circulo[contador[1]].setY(numero.nextInt(500));
                        circulo[contador[1]].makeVisible();
                        circulo[contador[1]].changeSize(numero.nextInt(70-50)+50);
                        circulo[contador[1]].changeColor(colores[numero.nextInt((colores.length))]);
                        contador[1]++;
                    }
                    break;
                case (3):
                    if (contador[2] < cuadrado.length) {
                        cuadrado[contador[2]] = new Square();
                        cuadrado[contador[2]].setX(numero.nextInt(500));
                        cuadrado[contador[2]].setY(numero.nextInt(500));
                        cuadrado[contador[2]].makeVisible();
                        cuadrado[contador[2]].changeSize(numero.nextInt(70-50)+50);
                        cuadrado[contador[2]].changeColor(colores[numero.nextInt((colores.length))]);
                        contador[2]++;
                    }
                    break;
                case (4):
                    if (contador[3] < rectangulo.length) {
                        rectangulo[contador[3]] = new Rectangulo();
                        rectangulo[contador[3]].setX(numero.nextInt(500));
                        rectangulo[contador[3]].setY(numero.nextInt(500));
                        rectangulo[contador[3]].makeVisible();
                        rectangulo[contador[3]].changeSize(numero.nextInt(100-50)+50,numero.nextInt(70-40)+40);
                        rectangulo[contador[3]].changeColor(colores[numero.nextInt((colores.length))]);
                        contador[3]++;
                    }
                    break;
                    case (5):
                    if (contador[4] < trapecio.length) {
                        trapecio[contador[4]] = new Trapecio();
                        trapecio[contador[4]].setX(numero.nextInt(500));
                        trapecio[contador[4]].setY(numero.nextInt(500));
                        trapecio[contador[4]].makeVisible();
                        trapecio[contador[4]].changeSize(numero.nextInt(70-20)+20,numero.nextInt(100-40)+40);
                        trapecio[contador[4]].changeColor(colores[numero.nextInt((colores.length))]);
                        contador[4]++;
                    }
                    break;
            }
        }
    }

    public void soloCirculos() {
        for (int i = 0; i < contador[2]; i++) {
            cuadrado[i].makeInvisible();
        }

        for (int i = 0; i < contador[0]; i++) {
            triangulo[i].makeInvisible();
        }
        for (int i = 0; i < contador[3]; i++) {
            rectangulo[i].makeInvisible();
        }
        for (int i = 0; i < contador[1]; i++) {
            if(circulo[i].getVisible()==false)circulo[i].makeVisible();
        }
        for (int i = 0; i < contador[4]; i++) {
            trapecio[i].makeInvisible();
        }
    }
    public void soloRectangulos() {
        for (int i = 0; i < contador[2]; i++) {
            cuadrado[i].makeInvisible();
        }

        for (int i = 0; i < contador[0]; i++) {
            triangulo[i].makeInvisible();
        }
        for (int i = 0; i < contador[1]; i++) {
            circulo[i].makeInvisible();
        }
        for (int i = 0; i < contador[3]; i++) {
            if(rectangulo[i].getVisible()==false)rectangulo[i].makeVisible();
        }
        for (int i = 0; i < contador[4]; i++) {
            trapecio[i].makeInvisible();
        }
    }
    public void soloCuadrados() {
        for (int i = 0; i < contador[1]; i++) {
            circulo[i].makeInvisible();
        }

        for (int i = 0; i < contador[0]; i++) {
            triangulo[i].makeInvisible();
        }
        for (int i = 0; i < contador[3]; i++) {
            rectangulo[i].makeInvisible();
        }
        for (int i = 0; i < contador[2]; i++) {
            if(cuadrado[i].getVisible()==false)cuadrado[i].makeVisible();
        }
        for (int i = 0; i < contador[4]; i++) {
            trapecio[i].makeInvisible();
        }
        
    }
    public void soloTriangulo() {
        for (int i = 0; i < contador[1]; i++) {
            circulo[i].makeInvisible();
        }

        for (int i = 0; i < contador[2]; i++) {
            cuadrado[i].makeInvisible();
        }
        for (int i = 0; i < contador[3]; i++) {
            rectangulo[i].makeInvisible();
        }
        for (int i = 0; i < contador[0]; i++) {
            if(triangulo[i].getVisible()==false) triangulo[i].makeVisible();
        }
        for (int i = 0; i < contador[4]; i++) {
            trapecio[i].makeInvisible();
        }
    }
    public void soloTrapecio() {
        for (int i = 0; i < contador[1]; i++) {
            circulo[i].makeInvisible();
        }

        for (int i = 0; i < contador[2]; i++) {
            cuadrado[i].makeInvisible();
        }
        for (int i = 0; i < contador[3]; i++) {
            rectangulo[i].makeInvisible();
        }
        for (int i = 0; i < contador[0]; i++) {
            triangulo[i].makeInvisible();
        }
        for (int i = 0; i < contador[4]; i++) {
            if(trapecio[i].getVisible()==false) trapecio[i].makeVisible();
        }
    }
    public void todoVisible(){
        for (int i = 0; i < contador[1]; i++) {
            if(circulo[i].getVisible()==false)circulo[i].makeVisible();
        }

        for (int i = 0; i < contador[2]; i++) {
            if(cuadrado[i].getVisible()==false)cuadrado[i].makeVisible();
        }
        for (int i = 0; i < contador[3]; i++) {
            if(rectangulo[i].getVisible()==false)rectangulo[i].makeVisible();
        }
        for (int i = 0; i < contador[0]; i++) {
            if(triangulo[i].getVisible()==false) triangulo[i].makeVisible();
        }
        for (int i = 0; i < contador[4]; i++) {
            if(trapecio[i].getVisible()==false)trapecio[i].makeVisible();
        }
    }
    public void todoMorado(){
       for (int i = 0; i < contador[1]; i++) {
            if(circulo[i].getVisible()==true)circulo[i].changeColor("purple");
        }
        for (int i = 0; i < contador[2]; i++) {
            if(cuadrado[i].getVisible()==true)cuadrado[i].changeColor("purple");
        }
        for (int i = 0; i < contador[3]; i++) {
            if(rectangulo[i].getVisible()==true)rectangulo[i].changeColor("purple");
        }
        for (int i = 0; i < contador[0]; i++) {
            if(triangulo[i].getVisible()==true)triangulo[i].changeColor("purple");
        }
         for (int i = 0; i < contador[4]; i++) {
            if(trapecio[i].getVisible()==true)trapecio[i].changeColor("purple");
        }
        
    }
    
    public void todoNaranja(){
      for (int i = 0; i < contador[1]; i++) {
            if(circulo[i].getVisible()==true)circulo[i].changeColor("orange");
        }
        for (int i = 0; i < contador[2]; i++) {
            if(cuadrado[i].getVisible()==true)cuadrado[i].changeColor("orange");
        }
        for (int i = 0; i < contador[3]; i++) {
            if(rectangulo[i].getVisible()==true)rectangulo[i].changeColor("orange");
        }
        for (int i = 0; i < contador[0]; i++) {
            if(triangulo[i].getVisible()==true)triangulo[i].changeColor("orange");
        }  
         for (int i = 0; i < contador[4]; i++) {
            if(trapecio[i].getVisible()==true)trapecio[i].changeColor("orange");
        }
    }
    public void limpiar(){
        cuadrado[0].limpiar();
        
    }
    public void todoFuera() {
        for (int i = 0; i < contador[2]; i++) {
            if(cuadrado[i].getVisible()==true)cuadrado[i].makeInvisible();
        }

        for (int i = 0; i < contador[0]; i++) {
            if(triangulo[i].getVisible()==true)triangulo[i].makeInvisible();
        }
        for (int i = 0; i < contador[1]; i++) {
            if(circulo[i].getVisible()==true)circulo[i].makeInvisible();
        }
        for (int i = 0; i < contador[3]; i++) {
            if(rectangulo[i].getVisible()==true)rectangulo[i].makeInvisible();
        }
        for (int i = 0; i < contador[4]; i++) {
            if(trapecio[i].getVisible()==true)trapecio[i].makeInvisible();
        }
        
    }
}//triangulo, circulo, cuadrado, rectangulo
