import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main{
    public static void main(String[] args) {
        String[][] data = {
                {"Республика Казахстан", "54 613", "54 758", "55 509", "57 514", "59 375", "58 945", "60 656", "63 855", "62 239", "64 432", "66 038", "68 864", "69 722", "74 611", "72 134", "72 877", "74 046", "76 443", "78 227"},
                {"Акмолинская", "2 182", "2 206", "2 234", "2 334", "2 299", "2 204", "2 177", "2 165", "2 227", "2 423", "2 247", "2 227", "2 202", "2 186", "2 202", "2 128", "1 834", "1 842", "1 921"},
                {"Актюбинская", "3 121", "3 213", "3 275", "3 274", "3 404", "3 380", "3 425", "3 586", "3 091", "3 222", "3 750", "3 702", "3 641", "3 607", "3 848", "4 061", "4 088", "4 104", "4 111"},
                {"Алматинская", "3 347", "3 329", "3 374", "3 954", "4 015", "3 327", "3 577", "3 898", "4 146", "4 616", "4 413", "4 493", "4 703", "4 863", "4 701", "4 765", "5 032", "5 214", "5 276"},
                {"Атырауская", "1 403", "1 445", "1 422", "1 492", "1 539", "1 509", "1 541", "1 622", "1 707", "1 814", "1 859", "1 694", "1 710", "1 710", "1 758", "1 825", "1 855", "2 026", "2 062"},
                {"Западно-Казахстанская", "2 031", "2 019", "1 968", "2 018", "2 026", "1 837", "1 931", "1 892", "2 113", "2 127", "2 197", "1 930", "1 962", "2 083", "2 068", "2 090", "2 130", "2 177", "2 216"},
                {"Жамбылская", "2 525", "2 526", "2 514", "2 558", "2 907", "2 642", "2 682", "2 770", "3 209", "3 117", "3 266", "2 989", "3 053", "3 195", "3 157", "3 336", "3 262", "3 287", "3 395"},
                {"Карагандинская", "5 779", "5 862", "6 013", "6 173", "6 074", "6 150", "6 304", "6 404", "5 354", "5 408", "5 466", "6 363", "6 274", "6 306", "6 344", "6 276", "6 233", "6 380", "6 422"},
                {"Костанайская", "2 240", "2 225", "2 216", "2 295", "2 277", "2 208", "2 245", "2 347", "2 366", "2 306", "2 298", "2 302", "2 281", "2 255", "2 331", "2 324", "2 455", "2 526", "2 462"},
                {"Кызылординская", "1 936", "1 970", "1 967", "2 177", "2 289", "2 069", "2 169", "2 208", "2 366", "2 520", "2 630", "2 154", "2 404", "2 455", "2 644", "2 697", "2 740", "2 842", "2 860"},
                {"Мангистауская", "1 192", "1 210", "1 189", "1 432", "1 447", "1 586", "1 637", "1 687", "1 704", "1 782", "1 884", "1 757", "1 845", "1 923", "2 130", "2 219", "2 347", "2 424", "2 494"},
                {"Павлодарская", "2 840", "2 859", "2 945", "2 870", "2 826", "2 860", "2 903", "2 997", "3 068", "3 088", "3 108", "2 969", "2 906", "2 946", "2 855", "2 855", "2 884", "2 944", "3 017"},
                {"Северо-Казахстанская", "1 576", "1 613", "1 600", "1 545", "1 596", "1 624", "1 650", "1 672", "1 693", "1 722", "1 730", "1 733", "1 746", "1 743", "1 669", "1 695", "1 687", "1 694", "1 664"},
                {"Туркестанская**)", "6 210", "6 269", "6 361", "6 450", "6 720", "6 837", "7 155", "8 039", "8 492", "8 231", "8 295", "9 280", "8 795", "9 315", "9 384", "5 195", "5 625", "5 883", "6 056"},
                {"Восточно-Казахстанская", "5 395", "5 493", "5 551", "5 625", "5 788", "5 753", "5 739", "5 814", "5 045", "5 729", "5 797", "5 891", "5 876", "5 912", "5 879", "5 878", "5 848", "6 002", "5 954"},
                {"город Астана", "2 784", "3 015", "3 287", "3 716", "4 246", "4 675", "5 109", "5 488", "5 417", "6 229", "6 587", "7 252", "7 604", "7 780", "7 897", "8 220", "8 622", "9 048", "9 469"},
                {"город Алматы", "10 052", "9 504", "9 593", "9 601", "9 922", "10 284", "10 412", "11 266", "10 241", "10 098", "10 511", "12 128", "12 720", "16 332", "13 267", "13 298", "13 052", "13 450", "13 884"}
        };

        int[][] values = new int[data.length - 1][data[0].length - 1];
        for (int i = 1; i < data.length; i++) {
            for (int j = 1; j < data[i].length; j++) {
                values[i - 1][j - 1] = Integer.parseInt(data[i][j].replaceAll("\\s+", ""));
            }
        }

        System.out.println();

        int[] xValues = new int[data[0].length - 1];
        int[] yValues = new int[data[0].length - 1];

        for (int i = 1; i < data[0].length; i++) {
            xValues[i - 1] = Integer.parseInt(data[0][i].replaceAll("\\s+", ""));
            yValues[i - 1] = Integer.parseInt(data[data.length - 1][i].replaceAll("\\s+", ""));
        }

        for (int i = 1; i < data[0].length; i++) {
            xValues[i - 1] = Integer.parseInt(data[0][i].replaceAll("\\s+", ""));
            yValues[i - 1] = Integer.parseInt(data[data.length - 1][i].replaceAll("\\s+", ""));
        }

        double[] regressionLine = linearRegression(xValues, yValues);
        double slope = regressionLine[0];
        double intercept = regressionLine[1];

        System.out.println("Regression Line: Y = " + slope + "X + " + intercept);

        int xInput = 80_000;
        double yPrediction = predictValue(xInput, slope, intercept);
        System.out.println("Predicted value for X = " + xInput + ": Y = " + yPrediction+"\n");
    }
    private static double[] linearRegression(int[] xValues, int[] yValues) {
        int n = xValues.length;

        double meanX = Arrays.stream(xValues).average().orElse(0);
        double meanY = Arrays.stream(yValues).average().orElse(0);

        double sumXY = 0;
        double sumX2 = 0;
        for (int i = 0; i < n; i++) {
            double deviationX = xValues[i] - meanX;
            double deviationY = yValues[i] - meanY;
            sumXY += deviationX * deviationY;
            sumX2 += deviationX * deviationX;
        }

        double slope = sumXY / sumX2;
        double intercept = meanY - slope * meanX;

        return new double[]{slope, intercept};
    }

    private static double predictValue(double xInput, double slope, double intercept) {
        return slope * xInput + intercept;
    }
}
