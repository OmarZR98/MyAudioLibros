package com.example.myaudiolibros;


import java.util.Vector;

public class libro {
    public String titulo;
    public  String autor;
    public  int recursoImagen;
    public  String urlAudio;

    public String genero; // Género literario
    public Boolean novedad; // Es una novedad
    public Boolean leido; // Leído por el usuario
    public final static String G_TODOS = "Todos los géneros";
    public final static String G_EPICO = "Poema épico";
    public final static String G_S_XIX = "Literatura siglo XIX";
    public final static String G_SUSPENSE = "Suspense";
    public final static String[] G_ARRAY = new String[] {G_TODOS, G_EPICO,
            G_S_XIX, G_SUSPENSE };

    public libro(){

    }

    public libro(String titulo, String autor, int recursoImagen,
                 String urlAudio, String genero, Boolean novedad, Boolean leido) {
        this.titulo = titulo;
        this.autor = autor;
        this.recursoImagen = recursoImagen;
        this.urlAudio = urlAudio;
        this.genero = genero;
        this.novedad = novedad;
        this.leido = leido;
    }

    public static Vector<libro> ejemploLibros() {
        final String SERVIDOR =
                "http://www.dcomg.upv.es/~jtomas/android/audiolibros/";

        Vector<libro> libros = new Vector<libro>();

        libros.add(new libro("Kappa", "Akutagawa",
                R.drawable.kappa, SERVIDOR+"kappa.mp3",
                libro.G_S_XIX, false, false));

        libros.add(new libro("Avecilla", "Alas Clarín, Leopoldo",
                R.drawable.avecilla, SERVIDOR+"avecilla.mp3",
                libro.G_S_XIX, true, false));

        libros.add(new libro("Divina Comedia", "Dante",
                R.drawable.divina_comedia, SERVIDOR+"divina_comedia.mp3",
                libro.G_EPICO, true, false));

        libros.add(new libro("Viejo Pancho, El", "Alonso y Trelles, José",
                R.drawable.viejo_pancho, SERVIDOR+"viejo_pancho.mp3",
                libro.G_S_XIX, true, true));

        libros.add(new libro("Canción de Rolando", "Anónimo",
                R.drawable.cancion_rolando, SERVIDOR+"cancion_rolando.mp3",
                libro.G_EPICO, false, true));

        libros.add(new libro("Matrimonio de sabuesos", "Agata Christie",
                R.drawable.matrim_sabuesos,SERVIDOR+"matrim_sabuesos.mp3",
                libro.G_SUSPENSE, false, true));

        libros.add(new libro("La iliada", "Homero",
                R.drawable.la_iliada, SERVIDOR+"la_iliada.mp3",
                libro.G_EPICO, true, false));

        return libros;
    }

}

