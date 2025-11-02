
// 2. Data Export Feature with default JSON method
interface Exporter {
    void exportToCSV();
    void exportToPDF();
    default void exportToJSON() {
        System.out.println("Exporting to JSON (default method)");
    }
}

class ReportExporter implements Exporter {
    public void exportToCSV() { System.out.println("Exporting to CSV"); }
    public void exportToPDF() { System.out.println("Exporting to PDF"); }
}

public class DataExportFeature {
    public static void main(String[] args) {
        Exporter ex = new ReportExporter();
        ex.exportToCSV();
        ex.exportToJSON();
    }
}
