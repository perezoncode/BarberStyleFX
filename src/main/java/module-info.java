module br.ufrrj.barberstylefx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens br.ufrrj.barberstylefx to javafx.fxml;
    exports br.ufrrj.barberstylefx;
}