package Ingenieria_de_Software.backend.dao.impl;

import Ingenieria_de_Software.backend.service.TransactionRunner;
import org.hibernate.Session;

import java.io.Serializable;

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
