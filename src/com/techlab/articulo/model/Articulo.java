package com.techlab.articulo.model;

public abstract class Articulo {
    private int codigo;
    private String nombre;
    private double precio;
    private Categoria categoria;

    public Articulo(int codigo, String nombre, double precio, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Cada clase hija define su propio tipo y su propio detalle
    public abstract String getTipoArticulo();

    public abstract String getDetalleEspecifico();

    @Override
    public String toString() {
        String nombreCategoria = (categoria != null) ? categoria.getNombre() : "Sin categoría";
        return "Articulo {\n" +
                "  codigo=" + codigo + ",\n" +
                "  nombre='" + nombre + "',\n" +
                "  precio=" + precio + ",\n" +
                "  categoria='" + nombreCategoria + "',\n" +
                "  tipo='" + getTipoArticulo() + "',\n" +
                "  detalle='" + getDetalleEspecifico() + "'\n" +
                "}";
    }
}
