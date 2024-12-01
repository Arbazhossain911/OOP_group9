module cse213.group9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.group9 to javafx.fxml;
    exports cse213.group9;
}