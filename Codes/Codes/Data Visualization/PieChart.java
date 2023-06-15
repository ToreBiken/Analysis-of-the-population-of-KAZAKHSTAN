import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class PieChart extends Application {

    @Override
    public void start(Stage stage) {
        String[] regions = {"Акмолинская", "Актюбинская", "Алматинская", "Атырауская", "Западно-Казахстанская", "Жамбылская", "Карагандинская", "Костанайская", "Кызылординская", "Мангистауская", "Павлодарская", "Северо-Казахстанская", "Туркестанская**)", "Восточно-Казахстанская", "город Астана", "город Алматы"};
        int[] population = {2182, 3121, 3347, 1403, 2031, 2525, 5779, 2240, 1936, 1192, 2840, 1576, 6210, 5395, 2784, 10052};

        List<javafx.scene.chart.PieChart.Data> pieChartData = new ArrayList<>();

        for (int i = 0; i < regions.length; i++) {
            pieChartData.add(new javafx.scene.chart.PieChart.Data(regions[i], population[i]));
        }

        javafx.scene.chart.PieChart pieChart = new javafx.scene.chart.PieChart();
        pieChart.setData(FXCollections.observableArrayList(pieChartData));
        pieChart.setTitle("Population Distribution by Region for 2003");
        Scene scene = new Scene(pieChart, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
