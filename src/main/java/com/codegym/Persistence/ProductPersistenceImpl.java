package com.codegym.Persistence;

import com.codegym.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductPersistenceImpl implements GeneralPersistence<Product> {


    ArrayList<Product> listProduct = new ArrayList<>();

    {
        listProduct.add(new Product(1, "Samsung", 200.0));
        listProduct.add(new Product(2, "IphoneX", 300.0));
        listProduct.add(new Product(3, "OPPO", 400.0));
    }


    @Override
    public List<Product> findAll() {
        return listProduct;
    }

    @Override
    public void add(Product product) {
        listProduct.add(product);
    }

    @Override
    public Product findById(Long id) {
        int index = -1;
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id) {
                index = i;
                break;
            }
        }

        Product product = listProduct.get(index);
        return product;
    }
}
