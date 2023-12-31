public class Libro {
    /**
     *  Codigo ISBN del libro
     */
    private String ISBN;
    /**
     * Titulo del libro
     */
    private String titulo;
    /**
     *  El Autor del libro
     */
    private String autor;
    /**
     *  Categoria del libro
     */
    private String categoria;
    /**
     *  Cantidad de paginas del libro
     */
    private int cantPaginas;
    /**
     *  Stock disponible del libro en el sistema
     */
    private int stock;

    /**
     * Constructor de la clase objeto libro
     * @param ISBN
     * @param titulo
     * @param autor
     * @param categoria
     * @param cantPaginas
     * @param stock
     */

    public Libro(String ISBN, String titulo, String autor, String categoria, int cantPaginas, int stock) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.cantPaginas = cantPaginas;
        this.stock = stock;
    }

    /**
     * Retorna el codigo ISBN del libro
     * @return
     */
    public String getISBN() { return ISBN; }

    /**
     * Retorna el nombre del libro
     * @return
     */
    public String getTitulo() { return titulo; }

    /**
     * Retorna el autor del libro
     * @return
     */
    public String getAutor() { return autor; }

    /**
     * Retorna la categoria del libro
     * @return
     */
    public String getCategoria() { return categoria; }

    /**
     * Retorna la cantidad de paginas del libro
     * @return
     */
    public int getCantPaginas() { return cantPaginas; }

    /**
     * Retorna el stock disponible del libro en el sistema
     * @return
     */
    public int getStock() { return stock; }

    /**
     * Cambia el stock del libro en el sistema
     * @param stock
     */
    public void setStock(int stock) { this.stock = stock; }

    /**
     * Metodo para retornar todos los datos del nodo (reemplaza el print de la direccion de memoria por los atributos del objeto)
     * @return
     */
    @Override
    public String toString() { return ISBN + ", " + titulo + ", " + autor + ", " + categoria + ", " + cantPaginas + ", " + stock; }
}
