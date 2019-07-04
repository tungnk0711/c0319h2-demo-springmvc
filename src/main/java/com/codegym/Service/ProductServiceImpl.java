package com.codegym.Service;

import com.codegym.Model.Product;
import com.codegym.Persistence.ProductPersistenceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements GeneralService<Product> {


    @Autowired
    private ProductPersistenceImpl productPersistence;

    @Override
    public List<Product> findAll() {
        return productPersistence.findAll();
    }

    @Override
    public void add(Product product) {
        productPersistence.add(product);
    }

    @Override
    public Product findById(Long id) {
        return productPersistence.findById(id);
    }
}
