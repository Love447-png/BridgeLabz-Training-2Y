
// 1. Data Serialization for Backup (Marker Interface)
import java.io.Serializable;

class BackupData implements Serializable {
    String data = "User Backup Data";
}

public class DataSerializationBackup {
    public static void main(String[] args) {
        BackupData b = new BackupData();
        System.out.println("Backup class marked as Serializable: " + (b instanceof Serializable));
    }
}
