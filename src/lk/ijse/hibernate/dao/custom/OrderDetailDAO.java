package lk.ijse.hibernate.dao.custom;

import lk.ijse.hibernate.dto.CustomerOrderDTO;
import lk.ijse.hibernate.entity.CustomerOrder;

import java.beans.AppletInitializer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface OrderDetailDAO extends AppletInitializer {
    public List<CustomerOrderDTO> searchOrderDetail(String value) throws SQLException, ClassNotFoundException;

    public ArrayList<CustomerOrder> getAllCustomerDetailHistory() throws SQLException, ClassNotFoundException;
}
