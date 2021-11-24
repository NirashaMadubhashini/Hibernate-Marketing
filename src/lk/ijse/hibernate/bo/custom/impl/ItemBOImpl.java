package lk.ijse.hibernate.bo.custom.impl;

import lk.ijse.hibernate.bo.custom.ItemBO;
import lk.ijse.hibernate.dao.DAOFactory;
import lk.ijse.hibernate.dao.custom.ItemDAO;
import lk.ijse.hibernate.dto.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemBOImpl implements ItemBO {

    private final ItemDAO itemDAO = (ItemDAO) DAOFactory.getDAOFactory().getDAO(DAOFactory.DAOTypes.ITEM);

    @Override
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException {
        ArrayList<ItemDTO> allItems = new ArrayList<>();
//        ArrayList<Item> all = itemDAO.getAll();
//        for (Item i : all) {
//            allItems.add(new ItemDTO(i.getItemCode(), i.getDescription(), i.getPackSize(), i.getQtyOnHand(),
//                    i.getUnitPrice()));
//        }
        return allItems;
    }

    @Override
    public List<ItemDTO> searchItem(String value) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean deleteItem(String code) throws SQLException, ClassNotFoundException {
//        return itemDAO.delete(code);
        return false;
    }

    @Override
    public boolean addItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
//        return itemDAO.add(new Item(dto.getItemCode(), dto.getDescription(), dto.getPackSize(), dto.getQtyOnHand(),
//                dto.getUnitPrice()));
        return false;
    }

    @Override
    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
//        return itemDAO.update(new Item(dto.getItemCode(), dto.getDescription(), dto.getPackSize(), dto.getQtyOnHand(),
//                dto.getUnitPrice()));
        return false;
    }

    @Override
    public boolean ifItemExist(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.ifItemExist(code);
    }


}
