package Game.Team;

import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.scoreboard.NameTagVisibility;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import java.util.Set;

public class Defenders implements Team {

    String name = "Defenders";
    String displayName = "Defenders";
    String prefix = "[DEF]";
    String suffix = "[DEF]";
    Set<OfflinePlayer> members;
    Set<String> entries;
    Scoreboard scoreboard;


    boolean friendlyFire = false;
    boolean canSeeFriendlyInvisibles = true;

    ChatColor color = ChatColor.RED;





    @Override
    public String getName() throws IllegalStateException {
        return name;
    }

    @Override
    public String getDisplayName() throws IllegalStateException {
        return displayName;
    }

    @Override
    public void setDisplayName(String s) throws IllegalStateException, IllegalArgumentException {
        name = s;
    }

    @Override
    public String getPrefix() throws IllegalStateException {
        return prefix;
    }

    @Override
    public void setPrefix(String s) throws IllegalStateException, IllegalArgumentException {
        prefix = s;
    }

    @Override
    public String getSuffix() throws IllegalStateException {
        return suffix;
    }

    @Override
    public void setSuffix(String s) throws IllegalStateException, IllegalArgumentException {
        suffix = s;
    }

    @Override
    public ChatColor getColor() throws IllegalStateException {
        return color;
    }

    @Override
    public void setColor(ChatColor chatColor) {
        color = chatColor;
    }

    @Override
    public boolean allowFriendlyFire() throws IllegalStateException {
        return false;
    }

    @Override
    public void setAllowFriendlyFire(boolean b) throws IllegalStateException {
        friendlyFire = b;
    }

    @Override
    public boolean canSeeFriendlyInvisibles() throws IllegalStateException {
        return friendlyFire;
    }

    @Override
    public void setCanSeeFriendlyInvisibles(boolean b) throws IllegalStateException {
        canSeeFriendlyInvisibles = b;
    }

    @Override
    public NameTagVisibility getNameTagVisibility() throws IllegalArgumentException {
        return null;
    }

    @Override
    public void setNameTagVisibility(NameTagVisibility nameTagVisibility) throws IllegalArgumentException {

    }

    @Override
    public Set<OfflinePlayer> getPlayers() throws IllegalStateException {
        return members;
    }

    @Override
    public Set<String> getEntries() throws IllegalStateException {
        return entries;
    }

    @Override
    public int getSize() throws IllegalStateException {
        return entries.size();
    }

    @Override
    public Scoreboard getScoreboard() {
        return scoreboard;
    }

    @Override
    public void addPlayer(OfflinePlayer offlinePlayer) throws IllegalStateException, IllegalArgumentException {
        members.add(offlinePlayer);
    }

    @Override
    public void addEntry(String s) throws IllegalStateException, IllegalArgumentException {
        entries.add(s);
    }

    @Override
    public boolean removePlayer(OfflinePlayer offlinePlayer) throws IllegalStateException, IllegalArgumentException {
        return false;
    }

    @Override
    public boolean removeEntry(String s) throws IllegalStateException, IllegalArgumentException {
        if (entries.contains(s)) {
            entries.remove(s);
            return true;
        } else { return false; }
    }

    @Override
    public void unregister() throws IllegalStateException {
    }

    @Override
    public boolean hasPlayer(OfflinePlayer offlinePlayer) throws IllegalArgumentException, IllegalStateException {
        return false;
    }

    @Override
    public boolean hasEntry(String s) throws IllegalArgumentException, IllegalStateException {
        return false;
    }

    @Override
    public OptionStatus getOption(Option option) throws IllegalStateException {
        return null;
    }

    @Override
    public void setOption(Option option, OptionStatus optionStatus) throws IllegalStateException {
    }
}
