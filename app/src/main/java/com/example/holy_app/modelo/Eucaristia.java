package com.example.holy_app.modelo;

public class Eucaristia {
    private String foto;
    private String nombre;
    private String descripcion;
    private String frase;
    private String direccion;
    private long latitud;
    private long longitud;
    private String telefono;

    public Eucaristia() {
    }

    public Eucaristia(String foto, String nombre, String descripcion, String frase, String direccion, long latitud, long longitud, String telefono) {
        this.foto = foto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.frase = frase;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.telefono = telefono;
    }



    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getLatitud() {
        return latitud;
    }

    public void setLatitud(long latitud) {
        this.latitud = latitud;
    }

    public long getLongitud() {
        return longitud;
    }

    public void setLongitud(long longitud) {
        this.longitud = longitud;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
