package lk.ijse.hibernate.bo.custom;

import lk.ijse.hibernate.bo.SuperBo;
import lk.ijse.hibernate.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;


public interface CustomerBO extends SuperBo {
    ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;

    boolean addCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    boolean updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    boolean ifCustomerExist(String id) throws SQLException, ClassNotFoundException;

    boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;

    boolean searchCustomer(String value) throws SQLException, ClassNotFoundException;

}
