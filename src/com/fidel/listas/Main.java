package com.fidel.listas;
import com.fidel.listas.Lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuLista();
    }

    public static void menuLista(){
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();

        System.out.println("1. Ver lista\n"+
                "2. Ver tamaño de la lista\n"+
                "3. Verificar si la lista esta vacia\n"+
                "4. Buscar elemento en la lista\n"+
                "5. Eliminar elemento de la lista\n\n"+
                "Seleccione una opcion");

        int opcion = sc.nextInt();

        switch(opcion){
            case 1:
                lista.crearlista();
                break;

            case 2:
                lista.tamanioLista();
                break;

            case 3:
                lista.estaVacia();
                break;

            case 4:
                lista.buscarElemmento();
                break;

            case 5:
                lista.eliminarElemento();
                break;

            case 6:
                lista.compararListas();
                break;

            case 7:
                System.out.println("Finalizar programa");
                break;

            default:
                System.out.println("Opcion no valida");
        }
    }
}
