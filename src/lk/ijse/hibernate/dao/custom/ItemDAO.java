package lk.ijse.hibernate.dao.custom;

import lk.ijse.hibernate.dao.CrudDAO;
import lk.ijse.hibernate.entity.Item;

import java.sql.SQLException;

public interface ItemDAO extends CrudDAO<Item, String> {
    boolean ifItemExist(String code) throws SQLException, ClassNotFoundException;
}
