package lk.ijse.hibernate.bo.custom.impl;


import lk.ijse.hibernate.bo.custom.CustomerBO;
import lk.ijse.hibernate.dao.DAOFactory;
import lk.ijse.hibernate.dao.custom.CustomerDAO;
import lk.ijse.hibernate.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;


public class CustomerBOImpl implements CustomerBO {

    private final CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getDAOFactory().getDAO(DAOFactory.DAOTypes.CUSTOMER);

    @Override
    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException {
        ArrayList<CustomerDTO> allCustomers = new ArrayList<>();
//        ArrayList<Customer> all = customerDAO.getAll();
//        for (Customer customer : all) {
//            allCustomers.add(new CustomerDTO(customer.getCustomerId(), customer.getTitle(), customer.getName(),
//                    customer.getAddress(), customer.getCity(), customer.getPostalCode(), customer.getProvince()));
//        }
        return allCustomers;
    }

    @Override
    public boolean addCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
//        return customerDAO.add(new Customer(dto.getCustomerId(), dto.getTitle(), dto.getName(), dto.getAddress(),
//                dto.getCity(), dto.getPostalCode(), dto.getProvince()));
        return false;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
        return false;
    }

//    @Override
//    public boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
////        return customerDAO.update(new Customer(dto.getCustomerId(), dto.getTitle(), dto.getName(), dto.getAddress(),
////                dto.getCity(), dto.getPostalCode(), dto.getProvince()));
//    }

    @Override
    public boolean ifCustomerExist(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.ifCustomerExist(id);
    }

    @Override
    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException {
//        return customerDAO.delete(id);
        return false;
    }

    @Override
    public boolean searchCustomer(String value) throws SQLException, ClassNotFoundException {
        return customerDAO.ifCustomerExist(value);
    }


}
