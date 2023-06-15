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

        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        ScatterChart<String, Number> scatterChart = new ScatterChart<>(xAxis, yAxis);
        scatterChart.setTitle("Population Scatter Plot");

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Population");

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

        for (int i = 0; i < regions.length; i++) {
            String region = regions[i];
            int population = Integer.parseInt(populations[i].replaceAll("\\s+", ""));
            series.getData().add(new XYChart.Data<>(region, population));
        }

        scatterChart.getData().add(series);

        Scene scene = new Scene(scatterChart, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Scatter Plot Example");
        stage.show();
    }
}
