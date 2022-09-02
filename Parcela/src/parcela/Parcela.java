
package parcela;

import parcela.ParcelaFolder.Productos;
import parcela.ParcelaFolder.Cliente;


public class Parcela {
    static void main(String[] args) {
        
        Productos NuevoProducto = new Productos();
        
        NuevoProducto.setCodigo(0);
        NuevoProducto.setSubCategoria("");
        NuevoProducto.setDescripcion("");
        NuevoProducto.setPrecio(0);
        NuevoProducto.setUnidad_gramos(0);
        
    }
    
}
