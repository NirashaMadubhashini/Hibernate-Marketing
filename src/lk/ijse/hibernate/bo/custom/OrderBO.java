package lk.ijse.hibernate.bo.custom;

import lk.ijse.hibernate.bo.SuperBo;
import lk.ijse.hibernate.dto.CustomerDTO;
import lk.ijse.hibernate.dto.CustomerOrderDTO;
import lk.ijse.hibernate.dto.ItemDTO;
import lk.ijse.hibernate.dto.OrderDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface OrderBO extends SuperBo {
    boolean purchaseOrder(OrderDTO dto) throws SQLException, ClassNotFoundException;

    String generateNewOrderId() throws SQLException, ClassNotFoundException;

    ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;

    ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;

    List<ItemDTO> getItems() throws SQLException, ClassNotFoundException;

    ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException;

    boolean ifItemExist(String code) throws SQLException, ClassNotFoundException;

    boolean ifCustomerExist(String id) throws SQLException, ClassNotFoundException;

    CustomerDTO searchCustomer(String s) throws SQLException, ClassNotFoundException;

    List<CustomerOrderDTO> searchOrderDetail(String value) throws SQLException, ClassNotFoundException;

    ArrayList<CustomerOrderDTO> getAllCustomerDetailHistory() throws SQLException, ClassNotFoundException;
}
