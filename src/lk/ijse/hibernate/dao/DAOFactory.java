package lk.ijse.hibernate.dao;

import lk.ijse.hibernate.dao.custom.impl.*;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getDAOFactory() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public SuperDAO getDAO(DAOTypes types) {
        switch (types) {
            case CUSTOMER:
                return (SuperDAO) new CustomerDAOImpl();
            case ITEM:
                return (SuperDAO) new ItemDAOImpl();
            case ORDER:
                return (SuperDAO) new OrderDAOImpl();
            case ORDERDETAIL:
                return (SuperDAO) new OrderDetailDAOImpl();
            case QUERYDAO:
                return new QueryDAOImpl();
            default:
                return null;
        }
    }

    public enum DAOTypes {
        CUSTOMER, ITEM, ORDER, ORDERDETAIL, QUERYDAO
    }

}
