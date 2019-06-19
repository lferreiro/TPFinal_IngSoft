package Crimson.Crimson_core.backend.dao.impl;

import Crimson.Crimson_core.backend.service.TransactionRunner;
import org.hibernate.Session;

public class HibernateGenericDAO<T> implements GenericDAO<T> {
    private Class<T> entityClass;

    public HibernateGenericDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public void add(T entity) {
        Session session = TransactionRunner.getCurrentSession();
        session.save(entity);
    }

    @Override
    public T get(Integer id) {
        Session session = TransactionRunner.getCurrentSession();
        return session.get(entityClass, id);
    }

}
