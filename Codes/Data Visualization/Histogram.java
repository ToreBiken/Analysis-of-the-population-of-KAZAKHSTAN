import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Histogram extends Application {

    @Override
    public void start(Stage stage) {

        String[] regions = {"Акмолинская", "Актюбинская", "Алматинская", "Атырауская", "Западно-Казахстанская", "Жамбылская", "Карагандинская", "Костанайская", "Кызылординская", "Мангистауская", "Павлодарская", "Северо-Казахстанская", "Туркестанская**)", "Восточно-Казахстанская", "город Астана", "город Алматы"};
        int[] population = {2182, 3121, 3347, 1403, 2031, 2525, 5779, 2240, 1936, 1192, 2840, 1576, 6210, 5395, 2784, 10052};

        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("Population distribution by regions in 2003");
        barChart.setLegendVisible(false);

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        for (int i = 0; i < regions.length; i++) {
            series.getData().add(new XYChart.Data<>(regions[i], population[i]));
        }

        barChart.getData().add(series);

        Scene scene = new Scene(barChart, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
