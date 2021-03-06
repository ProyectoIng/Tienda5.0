
package Modelo;

import org.jdom.Element;


public class Producto {

  

  
    private String nombre;
    private String seo;//palabra clave
    private String descripcion;
    private String precio;
    private String imagen;
    private String categoria;
    private String proveedor;
    private String idProducto;
    private String estadoProducto;
    private String cantidadMinima;

    public Producto(String nombre, String seo, String descripcion, String precio, String imagen, String categoria, String proveedor, String idProducto, String estadoProducto, String cantidadMinima) {
        this.nombre = nombre;
        this.seo = seo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
        this.categoria = categoria;
        this.proveedor = proveedor;
        this.idProducto = idProducto;
        this.estadoProducto = estadoProducto;
        this.cantidadMinima = cantidadMinima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeo() {
        return seo;
    }

    public void setSeo(String seo) {
        this.seo = seo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(String estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public String getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(String cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

   
    
    

    
    

    
   
    
    
    
    
    
}