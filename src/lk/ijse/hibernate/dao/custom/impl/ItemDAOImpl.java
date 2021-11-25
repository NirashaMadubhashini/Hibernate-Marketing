package lk.ijse.hibernate.dao.custom.impl;

import lk.ijse.hibernate.dao.CrudUtil;
import lk.ijse.hibernate.entity.Item;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ItemDAOImpl {

    public boolean ifItemExist(String itemCode) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeQuery("SELECT itemCode FROM Item WHERE itemCode=?", itemCode).next();
    }



    public boolean add(Item dto) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("INSERT INTO Item (itemCode,description,packSize,qtyOnHand,unitPrice) VALUES (?,?,?,?,?)",
                dto.getItemCode(), dto.getDescription(), dto.getPackSize(), dto.getQtyOnHand(), dto.getUnitPrice());
    }


    public boolean delete(String itemCode) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("DELETE FROM Item WHERE itemCode=?", itemCode);
    }


    public boolean update(Item dto) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("UPDATE Item SET description=?,packSize=?,qtyOnHand=?,unitPrice=? WHERE itemCode=?",
                dto.getDescription(), dto.getPackSize(), dto.getQtyOnHand(), dto.getUnitPrice(), dto.getItemCode());
    }


    public Item search(String itemCode) throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Item WHERE itemCode=?", itemCode);
        rst.next();
        return new Item(itemCode, rst.getString(2), rst.getString(3), rst.getInt(4),
                rst.getDouble(5));
    }


    public ArrayList<Item> getAll() throws SQLException, ClassNotFoundException {
        ArrayList<Item> allItems = new ArrayList();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Item");
        while (rst.next()) {
            allItems.add(new Item(rst.getString("itemCode"), rst.getString("description"), rst.getString("packSize"),
                    rst.getInt("qtyOnHand"), rst.getDouble("unitPrice")));
        }
        return allItems;
    }
}
