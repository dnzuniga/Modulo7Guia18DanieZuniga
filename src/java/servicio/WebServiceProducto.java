/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import negocio.Producto;

/**
 *
 * @author dnzun
 */
@Path("/json/producto")
public class WebServiceProducto {
    @GET
    @Path("/get")
    @Produces("application/json")
    public Producto getProductoInJSON() {
        Producto producto = new Producto();
        producto.setNombre("iPad 3");
        producto.setCodigo(999);
        producto.setStock(29);
        return producto;               
    }
}