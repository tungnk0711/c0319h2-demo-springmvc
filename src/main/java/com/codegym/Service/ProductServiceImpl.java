package com.codegym.Service;

import com.codegym.Model.Product;
import com.codegym.Persistence.ProductPersistenceImpl;

import java.util.List;

public class ProductServiceImpl implements GeneralService {


    ProductPersistenceImpl productPersistence = new ProductPersistenceImpl();

    @Override
    public List<Product> findAll() {
        return productPersistence.findAll();
    }
}
