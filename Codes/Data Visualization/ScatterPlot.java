import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ScatterPlot extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Create the x-axis and y-axis
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        // Create the scatter chart
        ScatterChart<String, Number> scatterChart = new ScatterChart<>(xAxis, yAxis);
        scatterChart.setTitle("Population Scatter Plot");

        // Create data series
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Population");

        // Define the dataset
        String[] regions = {
                "Акмолинская", "Актюбинская", "Алматинская", "Атырауская",
                "Западно-Казахстанская", "Жамбылская", "Карагандинская", "Костанайская", "Кызылординская",
                "Мангистауская", "Павлодарская", "Северо-Казахстанская", "Туркестанская**", "Восточно-Казахстанская",
                "город Астана", "город Алматы"
        };
        String[] populations = {
                "2182", "3121", "3347", "1403", "2031", "2525", "5779", "2240", "1936",
                "1192", "2840", "1576", "6210", "5395", "2784", "10052"
        };

        // Add data points to the series
        for (int i = 0; i < regions.length; i++) {
            String region = regions[i];
            int population = Integer.parseInt(populations[i].replaceAll("\\s+", ""));
            series.getData().add(new XYChart.Data<>(region, population));
        }

        // Add the series to the chart
        scatterChart.getData().add(series);

        // Create the scene and set it on the stage
        Scene scene = new Scene(scatterChart, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Scatter Plot Example");
        stage.show();
    }
}
