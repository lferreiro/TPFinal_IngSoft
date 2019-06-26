package Crimson.Crimson_core.backend.dao.impl;

import Crimson.Crimson_core.Usuario;

public class UsuarioDAO extends HibernateGenericDAO<Usuario> {
    public UsuarioDAO() {
        super(Usuario.class);
    }
}