package loose.oose.fis.lab.student.manager.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import loose.oose.fis.lab.student.manager.model.Students;

public class ViewStudentsController {

    @FXML
    public TableView<Students> studentTable;

    @FXML
    public TableColumn<Students, String> studentLastNameColumn;
    @FXML
    public TableColumn<Students, String> studentFirstNameColumn;
    @FXML
    public TableColumn<Students, Integer> studentAgeColumn;
    @FXML
    public TableColumn<Students, Double> studentMeanGradeColumn;

    @FXML
    public void initialize() {
        studentLastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        studentFirstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        studentAgeColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        studentMeanGradeColumn.setCellValueFactory(new PropertyValueFactory<>("meanGrade"));

        studentTable.setItems(students);
    }

    private ObservableList<Students> students = FXCollections.observableArrayList(
            new Students("John", "Doe", 20, 8.73),
            new Students("Jane", "Does", 23, 9.35),
            new Students("Jack", "Black", 19, 6.58),
            new Students("Julia", "Nice", 21, 9.85),
            new Students("Johnny", "Jackson", 24, 9.97),
            new Students("Michelle", "Roberts", 22, 7.65)
    );
}