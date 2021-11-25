package lk.ijse.hibernate.dao.custom;

import lk.ijse.hibernate.dao.CrudDAO;
import lk.ijse.hibernate.dto.CustomerOrderDTO;
import lk.ijse.hibernate.entity.CustomerOrder;
import lk.ijse.hibernate.entity.OrderDetail;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface OrderDetailDAO extends CrudDAO<OrderDetail, String> {
    public List<CustomerOrderDTO> searchOrderDetail(String value) throws SQLException, ClassNotFoundException;

    public ArrayList<CustomerOrder> getAllCustomerDetailHistory() throws SQLException, ClassNotFoundException;
}
