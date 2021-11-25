package lk.ijse.hibernate.dao.custom;

import lk.ijse.hibernate.dao.SuperDAO;
import lk.ijse.hibernate.dto.CustomerOrderDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface QueryDAO extends SuperDAO {
    ArrayList<CustomerOrderDTO> getOrderDetailsFromOrderID(String oid) throws SQLException, ClassNotFoundException;
}
