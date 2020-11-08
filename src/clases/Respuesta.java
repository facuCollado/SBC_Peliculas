package clases;


public class Respuesta {
    public String user;
    public String movie_name;
    public String genero;
    public String duracion;
    public String mood;
    public String fecha;
    public int tipo_pelicula;

    public Respuesta() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTipo_pelicula() {
        return tipo_pelicula;
    }

    public void setTipo_pelicula(int tipo_pelicula) {
        this.tipo_pelicula = tipo_pelicula;
    }
    
}
