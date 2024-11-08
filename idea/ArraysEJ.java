import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysEJ {
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //arrayRandom();
        //arrayBidimensionales();
        //buclearray();
        //arraylist();
        arrayoperaciones2();
    }

    public static void arrayRandom() {
        Scanner sc = new Scanner(System.in);
        String[] color = {"rojo", "verde", "azul", "blanco", "negro"};
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            System.out.println("--------------------------------------------");
            System.out.println("bandera: " + color[random.nextInt(5)]);
        }
    }

    public static void arrayBidimensionales() {
        int[][] n = new int[3][2];

        n[0][0] = 20;
        n[0][1] = 19;
        n[1][0] = 22;
        n[2][1] = 267;

        int fila, columna;
        for (fila = 0; fila < 3; fila++) {
            System.out.println("fila: " + fila);

            for (columna = 0; columna < 3; columna++) {
                System.out.println("columna: " + columna );
            }
        }

    }
    //se colocan una mina y un tesoro de forma aleatroia en un cuadrante de 4 filas y 5 columnas. El ususario intentara averiguar donde esta el tesoro
    public static void buclearray(){
        String[] paises = new String[3];
        for (int i = 0; i < 3; i++) {
            paises[i] = JOptionPane.showInputDialog("Introduce el pais" + (i + 1) + " : ");

        }
        for (String pais : paises) {
            System.out.println(pais);
        }

    }
    //Array lista es una estructura de datos en java que permite almacenar elementos de forma dinamica
    //Ventaja, no necesito definir su tamano de ante mano
    public static void arraylist(){
        ArrayList<String> nombres = new ArrayList<>();

        //Agregar elelemtnos al arraylist
        nombres.add("Manu");
        nombres.add("Juan");
        nombres.add("Alex");
        nombres.add("Maria");
        nombres.add("Jose");
        nombres.add("Ana");
        System.out.println("Lista de nombres: " + nombres);

        System.out.println("primer nombre: " + nombres.get(0));

        //cambiar elemento
        nombres.set(1, "MariCarmen");
        System.out.println("lista actualizada: " + nombres);

        // add(): agregar items
        // get(): permite acceder al eleemnto por indice
        // set():Cambia el elemento en una posiion especifica
    }
    public static void arrayoperaciones(){
        //Realizar operaciones de:
        //iteracion y manipulacion de elementos

        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Platano");
        frutas.add("Melocoton");
        frutas.add("Aceitunas");

        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("Fruta " + (i + 1) +" : "+ frutas.get(i));
        }
        int contador = 0;
        for (String fruta : frutas) {
            System.out.println("Fruta " + (contador+ 1) + " : "+ fruta);
            contador++;

        }
        frutas.remove(2);
        frutas.remove("Aceitunas");
        System.out.println(frutas);

        //Arraylist de enteros donde se empleen lo siguiente:
        //buscar un elemento
        //Clonar el Arraylist
        //Vaciar los elementos del array list


    }
    public static void arrayoperaciones2(){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);

        while (true){
            System.out.println("Ingresa un numero para buscarlo en la lista: ");
            int n = sc.nextInt();
            if (num.contains(n)){
                System.out.println("Esta en la lista");
                break;

            }
            else {
                System.out.println("no se encuentra en la lista");
            }
        }
        ArrayList<Integer> num2 = (ArrayList<Integer>) num.clone();
        System.out.println("Copia de la lista de numeros: " + num2);

        num.clear();
        System.out.println("Lista limpia" + num);
    }
}