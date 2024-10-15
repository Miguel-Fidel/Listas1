package com.fidel.listas;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> lista1 = new ArrayList<String>();

    public void crearlista(){
        lista1.add("Computadora");
        lista1.add("Mouse");

        for (String item : lista1) {
            System.out.println(item);
        }
    }

    public void tamanioLista(){
        System.out.println("El tamanio de la lista es de: " + lista1.size() + " elementos");
    }

    public void estaVacia(){
        if (lista1.isEmpty()){
            System.out.println("Lista vacia");
        }else{
            System.out.println("Lista no vacia");
        }
    }

    public void buscarElemmento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buscando el elemento: ");
        String elemento = sc.nextLine();

        if (lista1.contains(elemento)){
            System.out.println("El elemento: " + elemento + " si se encuentra en la lista");
        }else{
            System.out.println("El elemento: " + elemento + " no se encuentra en la lista");
        }
    }

    public void eliminarElemento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que desea eliminar?\n"+
                "1. Un elemento de la lista\n"+
                "2. Toda la ;ista\n");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.print("Ingrese la palabra que desea eliminar: ");
                String indice = sc.nextLine();

                if (lista1.remove(indice)){
                    System.out.println("El elemento: " + indice + " fue eliminado de la lista");
                }else{
                    System.out.println("El elemento: " + indice + " no se encuentra en la lista");
                }
        }
    }

    public void compararListas(){
        List<String>lista2 = new ArrayList<>();
        List<String>lista3 = new ArrayList<>();

        lista2.add("Migue");
        lista3.add("Migue");

        if (lista2.equals(lista3)){
            System.out.println("Las listas son identicas");
        }else{
            System.out.println("Las listas son diferentes");
        }
    }
}
