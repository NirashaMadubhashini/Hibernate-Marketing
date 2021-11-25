package lk.ijse.hibernate.dao.custom;

import lk.ijse.hibernate.dao.CrudDAO;
import lk.ijse.hibernate.entity.Customer;

import java.sql.SQLException;

public interface CustomerDAO extends CrudDAO<Customer, String> {
    boolean ifCustomerExist(String id) throws SQLException, ClassNotFoundException;

}
