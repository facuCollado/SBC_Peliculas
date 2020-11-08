/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class Pelicula {
    public String name;
    public String genero;
    public String formato;
    public String duracion;
    public int released_year;
    public String mood_movie;
    public int pertenece_tipo;

    public int getReleased_year() {
        return released_year;
    }

    public void setReleased_year(int released_year) {
        this.released_year = released_year;
    }

    public String getMood_movie() {
        return mood_movie;
    }

    public void setMood_movie(String mood_movie) {
        this.mood_movie = mood_movie;
    }

    public int getPertenece_tipo() {
        return pertenece_tipo;
    }

    public void setPertenece_tipo(int pertenece_tipo) {
        this.pertenece_tipo = pertenece_tipo;
    }

    public Pelicula() { }

       
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
}
