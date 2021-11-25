package lk.ijse.hibernate.dao.custom;

import java.beans.AppletInitializer;
import java.sql.SQLException;

public interface CustomerDAO extends AppletInitializer{
    boolean ifCustomerExist(String id) throws SQLException, ClassNotFoundException;

}
