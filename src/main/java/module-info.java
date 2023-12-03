module sudoku.javadesktopsudoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens sudoku.javadesktopsudoku to javafx.fxml;
    exports sudoku;
}