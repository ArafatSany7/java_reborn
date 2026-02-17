interface CloudStorage {
    String UploadFile(String FileName);
}

class S3Storage implements CloudStorage {
    public String UploadFile(String S) {
        return "File Uploaded " + S;
    }
}

class GoogleStorage implements CloudStorage {
    public String UploadFile(String S) {
        return "File Uploaded " + S;
    }
}

class AzureStorage implements CloudStorage {
    public String UploadFile(String S) {
        return "File Uploaded " + S;
    }
}

class StorageFactory {
    public static CloudStorage create(String method) {
        return switch (method) {
            case "S3" -> new S3Storage();
            case "GS" -> new GoogleStorage();
            case "AZ" -> new GoogleStorage();
            default -> throw new IllegalArgumentException("Unknown selection" + method);

        };
    }
}

public class BackupSystem {
    public static void main(String[] args) {

        CloudStorage S3 = StorageFactory.create("S3");
        CloudStorage GS = StorageFactory.create("GS");

        System.out.println("Via " + S3.UploadFile("Amazon S3"));

    }
}
