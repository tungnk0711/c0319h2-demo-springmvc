package com.codegym.Persistence;

import java.util.List;

public interface GeneralPersistence<E> {

    List<E> findAll();
}
