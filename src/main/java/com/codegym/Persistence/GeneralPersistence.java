package com.codegym.Persistence;

import java.util.List;

public interface GeneralPersistence<E> {

    List<E> findAll();
    void add(E e);

    E findById(Long id);
}
