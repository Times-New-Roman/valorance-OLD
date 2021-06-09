import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main pl;
    public static Main getPlugin() {return pl;}

    public void onEnable() {
        getServer().getPluginManager().registerEvents(new FireEvent(), this);
        pl = this;
    }
}
