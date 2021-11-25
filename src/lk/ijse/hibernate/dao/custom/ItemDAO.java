package lk.ijse.hibernate.dao.custom;

import java.beans.AppletInitializer;
import java.sql.SQLException;

public interface ItemDAO extends AppletInitializer {
    boolean ifItemExist(String code) throws SQLException, ClassNotFoundException;
}
