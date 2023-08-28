package POO;

import java.util.Scanner;

public class Libro_1 {
    private int ISBN;
    private String titulo;
    private String autor;
    private int n_paginas;

    public Libro_1() {

    }

    public Libro_1(int ISBN, String titulo, String autor, int n_paginas){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.n_paginas = n_paginas;
    }

    public  void cargarLibro(){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa el ISBN del libro: ");
        this.ISBN = entrada.nextInt();
        System.out.println("Ingresa el Titulo del libro: ");
        this.titulo = entrada.next();
        System.out.println("Ingresa el Autor del libro: ");
        this.autor = entrada.next();
        System.out.println("Ingresa el numero de paginas: ");
        this.n_paginas = entrada.nextInt();
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN=" + ISBN +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", n_paginas=" + n_paginas +
                '}';
    }
}
