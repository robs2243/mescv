module de.hssfds.rd.mescv {
    requires javafx.controls;
    requires javafx.fxml;
    requires opencv;
    requires javafx.swing;


    opens de.hssfds.rd.mescv to javafx.fxml;
    exports de.hssfds.rd.mescv;
}