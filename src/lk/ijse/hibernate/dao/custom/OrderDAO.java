package lk.ijse.hibernate.dao.custom;

import lk.ijse.hibernate.dao.CrudDAO;
import lk.ijse.hibernate.entity.Order;

import java.sql.SQLException;

public interface OrderDAO extends CrudDAO<Order, String> {
    boolean ifOrderExist(String oid) throws SQLException, ClassNotFoundException;

    String generateNewOrderId() throws SQLException, ClassNotFoundException;

    boolean updateQty(String itemCode, int qty) throws SQLException, ClassNotFoundException;
}
