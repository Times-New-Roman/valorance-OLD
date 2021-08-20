package Game;

import Game.Command.AgentCommand;
import Game.Command.RoundCommand;
import Game.Event.FireEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Valorance extends JavaPlugin {

    private static Valorance pl;
    public static Valorance getPlugin() {return pl;}

    public void onEnable() {

        getServer().getPluginManager().registerEvents(new FireEvent(), this);
        pl = this;
        pl.getCommand("round").setExecutor(new RoundCommand());
        pl.getCommand("agent").setExecutor(new AgentCommand());

        pl.getCommand("round").setTabCompleter(new RoundCommand());
        pl.getCommand("agent").setTabCompleter(new AgentCommand());
    }
}
