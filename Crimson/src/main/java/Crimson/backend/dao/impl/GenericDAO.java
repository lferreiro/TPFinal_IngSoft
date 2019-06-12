package Crimson.backend.dao.impl;

public interface GenericDAO<T> {
    void add(T entity);

    T get(Integer id);
}
