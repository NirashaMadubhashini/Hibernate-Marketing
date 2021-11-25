package lk.ijse.hibernate.dao.custom;

import java.beans.AppletInitializer;
import java.sql.SQLException;

public interface OrderDAO extends AppletInitializer {
    boolean ifOrderExist(String oid) throws SQLException, ClassNotFoundException;

    String generateNewOrderId() throws SQLException, ClassNotFoundException;

    boolean updateQty(String itemCode, int qty) throws SQLException, ClassNotFoundException;
}
