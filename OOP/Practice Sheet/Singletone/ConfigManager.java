public class ConfigManager {
    private static ConfigManager instance;

    private ConfigManager() {
        System.out.println("Config ON");
    }

    public static ConfigManager createObject() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public static void main(String[] args) {
        ConfigManager port = ConfigManager.createObject();
        ConfigManager url = ConfigManager.createObject();

        System.out.println(port == url);
    }
}
