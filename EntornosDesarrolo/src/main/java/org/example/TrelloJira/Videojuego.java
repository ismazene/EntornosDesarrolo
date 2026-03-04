package org.example.TrelloJira;

public class Videojuego {
    private String titulo;
    private String plataforma;
    private double precio;

    public Videojuego(String titulo, String plataforma, double precio) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
