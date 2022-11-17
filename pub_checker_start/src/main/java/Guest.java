import java.util.ArrayList;

public class Guest {

    private String name;
    private int age;
    private double wallet;
    private int sobriety;
    private boolean guestBanned;
    private char currency;
    private String favouriteDrink;

    //CONSTRUCTOR
    public Guest(String name, int age, double wallet, int sobriety, boolean guestBanned, char newCurrency, String favouriteDrink) {
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.sobriety = sobriety;
        this.guestBanned = guestBanned;
        this.currency = newCurrency;
        this.favouriteDrink = favouriteDrink;


    }

    //METHODS

    // GETTERS & SETTERS

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWallet() {
        return this.wallet;
    }

    public void setWallet(double wallet){
        this.wallet = wallet;
    }

    public int getSobriety(){
        return this.sobriety;
    }

    public void setSobriety(int sobriety){
        this.sobriety = sobriety;
    }

    public boolean isGuestBanned(){
        return this.guestBanned;
    }

    public void setGuestBanned(boolean guestBanned){
        this.guestBanned = guestBanned;
    }

    public char getCurrency(){
        return this.currency;
    }

    public void setCurrency(char currency){
        this.currency = currency;
    }

    public String getFavouriteDrink(){
        return this.favouriteDrink;
    }

    public void setFavouriteDrink(String favouriteDrink){
        this.favouriteDrink = favouriteDrink;
    }

}
