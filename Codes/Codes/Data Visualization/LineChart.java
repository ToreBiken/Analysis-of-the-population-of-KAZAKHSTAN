import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class LineChart extends Application {

    @Override
    public void start(Stage stage) {

        String[] years = {"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"};
        int[] population = {54613, 54758, 55509, 57514, 59375, 58945, 60656, 63855, 62239, 64432, 66038, 68864, 69722, 74611, 72134, 72877, 74046, 76443, 78227};

        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Year");
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Population");

        javafx.scene.chart.LineChart<String, Number> lineChart = new javafx.scene.chart.LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Regression line");

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        for (int i = 0; i < years.length; i++) {
            series.getData().add(new XYChart.Data<>(years[i], population[i]));
        }

        lineChart.getData().add(series);

        Scene scene = new Scene(lineChart, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
