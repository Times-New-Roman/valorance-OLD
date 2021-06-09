package Game.Weapon;

public class TestWeapon extends Gun{

    //--WEAPON STATS. DO NOT HARDCODE TEMPORARY VALUES!--//
    String weaponName = "Test Weapon";
    int damage = 10;
    int headshotDamage = 20;
    int cost = 1000;
    String skin = "default";



    @Override
    void setDamage(int headshot, int normal) { headshotDamage = headshot; damage = normal; }

    @Override
    int getDamage() {
        return damage;
    }

    @Override
    int getHeadshotDamage() {
        return headshotDamage;
    }

    @Override
    void setName(String name) {
        weaponName = name;
    }

    @Override
    String getName() {
        return weaponName;
    }

    @Override
    void setSkin(String newSkin) { skin = newSkin; }

    @Override
    String getSkin() {
        return null;
    }

    @Override
    void setClipAmmo(int ammo) {

    }

    @Override
    int getClipAmmo() {
        return 0;
    }

    @Override
    void setMaxAmmo(int ammo) {

    }

    @Override
    int getMaxAmmo() {
        return 0;
    }

    @Override
    void setReloadTime(int milliseconds) {

    }

    @Override
    int getReloadTime() {
        return 0;
    }

    @Override
    void setRecoil(int percentage) {

    }

    @Override
    int getRecoil() {
        return 0;
    }

    @Override
    void setZoom(int percentage) {

    }

    @Override
    int getZoom() {
        return 0;
    }

    @Override
    void setCost(int cost) {

    }

    @Override
    int getCost() {
        return 0;
    }
}
