package Crimson.backend.dao.impl;

import Crimson.Crimson_core.Reserva;
import Crimson.Crimson_core.backend.dao.impl.HibernateGenericDAO;

public class HibernateReservaDao extends HibernateGenericDAO<Reserva> {

    public HibernateReservaDao() {
        super(Reserva.class);
    }


}
