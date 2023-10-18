package com.Tienda.serviceImpl;

import com.Tienda.dao.ProductoDao;
import com.Tienda.domain.Producto;
import com.Tienda.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl  implements ProductoService {

    @Autowired
    private ProductoDao productoDao;


    @Override
    @Transactional
    public List<Producto> getProductos(boolean activos) {
        var lista = productoDao.findAll();
        if(activos) {lista.removeIf(e -> !e.isActivo());}
        return lista;
    }

    @Override
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    public void delete(Producto producto) {
        productoDao.delete(producto);

    }
}
