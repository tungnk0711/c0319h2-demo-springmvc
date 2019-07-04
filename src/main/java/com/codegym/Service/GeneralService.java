package com.codegym.Service;

import java.util.List;

public interface GeneralService<E> {
    List<E> findAll();

    void add(E e);

    E findById(Long id);
}
