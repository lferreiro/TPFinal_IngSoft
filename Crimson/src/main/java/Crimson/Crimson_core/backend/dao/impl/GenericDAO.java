package Crimson.Crimson_core.backend.dao.impl;

import java.io.Serializable;

public interface GenericDAO<T> {
    void add(T entity);

    T get(Serializable id);
}
