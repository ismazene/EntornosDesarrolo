package org.example.TrelloJira;


public class Main {

     static void main(String[] args) {

        // Crear objeto Videojuego
        Videojuego juego1 = new Videojuego(
                "The Witcher 3",
                "PS5",
                10.99
        );

        // Mostrar datos usando getters
        System.out.println("Titulo: " + juego1.getTitulo());
        System.out.println("Plataforma: " + juego1.getPlataforma());
        System.out.println("Precio: " + juego1.getPrecio());

    }
}