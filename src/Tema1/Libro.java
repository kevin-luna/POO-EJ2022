package Tema1;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private String editorial;
    private int paginas;

    public void nextPage(){

    }

    public void beforePage(){

    }

    public void ir_aPagina(){

    }

    public Libro(String titulo){
        this.titulo=titulo;
        this.nextPage();
    }

    public Libro(String titulo,String autor){
        this(titulo);
        this.autor=autor;
    }
}
