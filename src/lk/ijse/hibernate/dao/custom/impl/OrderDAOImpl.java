package lk.ijse.hibernate.dao.custom.impl;

import lk.ijse.hibernate.dao.CrudUtil;
import lk.ijse.hibernate.entity.Order;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDAOImpl {

    public boolean ifOrderExist(String orderId) throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("SELECT orderId FROM `Order` WHERE orderId=?", orderId);
        return rst.next();
    }


    public String generateNewOrderId() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("SELECT orderId FROM `Order` ORDER BY orderId DESC LIMIT 1");
        if (rst.next()) {

            int tempId = Integer.
                    parseInt(rst.getString(1).split("-")[1]);
            tempId = tempId + 1;
            if (tempId <= 9) {
                return "O-00" + tempId;
            } else if (tempId <= 99) {
                return "O-0" + tempId;
            } else {
                return "O-" + tempId;
            }

        } else {
            return "O-001";
        }
    }


    public boolean updateQty(String itemCode, int qty) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("UPDATE ITEM SET qtyOnHand=(qtyOnHand-" + qty + ") WHERE itemCode='" + itemCode + "'");
    }


    public boolean add(Order dto) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("INSERT INTO `Order` (orderId,itemCode,customerId,cost,orderDate,orderTime) VALUES (?,?,?,?,?,?)",
                dto.getOrderId(), dto.getCustomer(), dto.getCost(), dto.getDate());
    }


    public boolean delete(String s) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not Supported Yet");
    }


    public boolean update(Order order) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not Supported Yet");
    }


    public Order search(String orderId) throws SQLException, ClassNotFoundException {
//        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM `Order` WHERE orderId=?", orderId);
//        rst.next();
//        return new Order(rst.getString("orderId"), rst.getString("itemCode"), rst.getDouble("cost"), rst.getString("orderDate"), rst.getString("orderTime"));
        return null;
    }


    public ArrayList<Order> getAll() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not Supported Yet");
    }

}
