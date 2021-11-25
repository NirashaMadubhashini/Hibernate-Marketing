package lk.ijse.hibernate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Item;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        Customer customer = new Customer();
//        customer.setCustomerId("C001");
//        customer.setTitle("Miss");
//        customer.setName("Nirasha");
//        customer.setAddress("Galle");
//        customer.setCity("Gal");
//        customer.setPostalCode("110");
//        customer.setProvince("South");


        Item item = new Item();
        item.setItemCode("I002");
        item.setDescription("Rice");
        item.setPackSize("100g");
        item.setQtyOnHand(20);
        item.setUnitPrice(120);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


//        session.save(customer);
        session.save(item);


        transaction.commit();

        session.close();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/LoginForm.fxml"))));
        primaryStage.setMaximized(true);
        primaryStage.setTitle("GoldenFresh SuperMarket");
        primaryStage.getIcons().add(new Image("assets/1.png"));
        primaryStage.show();
    }
}
