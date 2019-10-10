package com.example.myaudiolibros;

import android.content.Context;

import java.util.Vector;

public class AdaptadorLibrosFiltro extends AdaptadorLibros {
    private Vector<libro> vectorSinFiltro;// Vector con todos los libros
    private Vector<Integer> indiceFiltro; // Índice en vectorSinFiltro de
    // Cada elemento de vectorLibros
    private String busqueda = ""; // Búsqueda sobre autor o título
    private String genero = ""; // Género seleccionado
    private boolean novedad = false; // Si queremos ver solo novedades
    private boolean leido = false; // Si queremos ver solo leidos

    public AdaptadorLibrosFiltro(Context contexto, Vector<libro> vectorLibros) {
        super(contexto, vectorLibros);
        vectorSinFiltro = vectorLibros;
        recalculaFiltro();
    }

    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda.toLowerCase();
        recalculaFiltro();
    }

    public void setGenero(String genero) {
        this.genero = genero;
        recalculaFiltro();
    }
    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
        recalculaFiltro();
    }
    public void setLeido(boolean leido) {
        this.leido = leido;
        recalculaFiltro();
    }
    public void recalculaFiltro() {
        vectorLibros = new Vector<libro>();
        indiceFiltro = new Vector<Integer>();
        for (int i = 0; i < vectorSinFiltro.size(); i++) {
            libro lib = vectorSinFiltro.elementAt(i);
            if ((lib.titulo.toLowerCase().contains(busqueda) || lib.autor.toLowerCase().contains(busqueda))
                    && (lib.genero.startsWith(genero))
                    && (!novedad || (novedad && lib.novedad))
                    && (!leido || (leido && lib.leido))) {
                vectorLibros.add(lib);
                indiceFiltro.add(i);
            }
        }
    }
    public libro getItem(int posicion) {
        return vectorSinFiltro.elementAt(indiceFiltro.elementAt(posicion)); }
    public long getItemId(int posicion) {
        return indiceFiltro.elementAt(posicion);
    }
    public void borrar(int posicion){
        vectorSinFiltro.remove((int)getItemId(posicion));
        recalculaFiltro();
    }
    public void insertar(libro lib){
        vectorSinFiltro.add(lib);
        recalculaFiltro();}
}