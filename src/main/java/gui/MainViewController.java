package gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

    @FXML
    public MenuItem menuItemSeller;

    @FXML
    public MenuItem menuItemAbout;

    @FXML
    public MenuItem menuItemDepartment;

    @FXML
    public void onMenuItemSellerAction(){
        System.out.println("onMenuItemSellerAction");
    }

    @FXML
    public void onMenuItemAboutAction(){
        System.out.println("onMenuItemAboutAction");
    }

    @FXML
    public void onMenuItemDepartmentAction(){
        System.out.println("onMenuItemDepartmentAction");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
