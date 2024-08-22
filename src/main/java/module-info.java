module net.yetihafen.bezahldoc {
    requires atlantafx.base;
    requires javafx.fxml;

    opens net.yetihafen.bezahldoc to javafx.fxml;
    exports net.yetihafen.bezahldoc;
}