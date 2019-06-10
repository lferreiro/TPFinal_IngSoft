package Ingenieria_de_Software.backend.dao.impl;

import java.io.Serializable;

public interface GenericDAO<T> {
    void add(T entity);

    T get(Integer id);
}
