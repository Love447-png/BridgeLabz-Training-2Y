
// 3. Sensitive Data Tagging (Custom Marker Interface)
interface Sensitive {}

class UserData implements Sensitive {
    String info = "Confidential Info";
}

public class SensitiveDataTagging {
    public static void main(String[] args) {
        UserData data = new UserData();
        if(data instanceof Sensitive)
            System.out.println("This data is sensitive and should be encrypted.");
    }
}
