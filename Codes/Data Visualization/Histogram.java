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
        // Define the data
        String[] regions = {"Акмолинская", "Актюбинская", "Алматинская", "Атырауская", "Западно-Казахстанская", "Жамбылская", "Карагандинская", "Костанайская", "Кызылординская", "Мангистауская", "Павлодарская", "Северо-Казахстанская", "Туркестанская**)", "Восточно-Казахстанская", "город Астана", "город Алматы"};
        int[] population = {2182, 3121, 3347, 1403, 2031, 2525, 5779, 2240, 1936, 1192, 2840, 1576, 6210, 5395, 2784, 10052};

        // Create the x-axis and y-axis
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        // Create the bar chart
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("Population distribution by regions in 2003");
        barChart.setLegendVisible(false);

        // Create a series for the data
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        for (int i = 0; i < regions.length; i++) {
            series.getData().add(new XYChart.Data<>(regions[i], population[i]));
        }

        // Add the series to the bar chart
        barChart.getData().add(series);

        // Create a scene and set it to the stage
        Scene scene = new Scene(barChart, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
