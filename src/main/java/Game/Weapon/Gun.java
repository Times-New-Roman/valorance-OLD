package Game.Weapon;

public abstract class Gun {
    abstract void setDamage(int headshotDamage, int damage);
    abstract int getDamage();
    abstract int getHeadshotDamage();

    abstract void setName(String name);
    abstract String getName();

    abstract void setSkin(String newSkin);
    abstract String getSkin();

    abstract void setClipAmmo(int ammo);
    abstract int getClipAmmo();

    abstract void setMaxAmmo(int ammo);
    abstract int getMaxAmmo();

    abstract void setReloadTime(int milliseconds);
    abstract int getReloadTime();

    abstract void setRecoil(int percentage);
    abstract int getRecoil();

    abstract void setZoom(int percentage);
    abstract int getZoom();

    abstract void setCost(int cost);
    abstract int getCost();
}