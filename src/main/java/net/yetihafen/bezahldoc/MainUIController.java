package net.yetihafen.bezahldoc;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class MainUIController implements Initializable {
    @FXML
    private ListView<String> list;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        list.setCellFactory(l -> new ListCell<>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);

                if(empty || item == null) {
                    setText(null);
                } else {
                    setFont(Font.font(30));
                    setText(item);
                }
            }
        });


        list.getItems().add("test");
        list.getItems().add("test3");
        list.getItems().add("test4");
        list.getItems().add("test2");
        list.getItems().add("test5");
        list.getItems().add("test6");
        list.getItems().add("test7");
        list.getItems().add("test8");
        list.getItems().add("test9");
        list.getItems().add("test10");
        list.getItems().add("test11");
        list.getItems().add("test12");
        list.getItems().add("test13");
        list.getItems().add("test14");
        list.getItems().add("test15");
        list.getItems().add("test16");
        list.getItems().add("test17");
        list.getItems().add("test18");
        list.getItems().add("test19");
        list.getItems().add("test20");
        list.getItems().add("test21");
        list.getItems().add("test22");
        list.getItems().add("test23");


    }
}