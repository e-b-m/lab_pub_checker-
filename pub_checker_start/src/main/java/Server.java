import java.util.ArrayList;

public class Server {
    private ArrayList<String> drinksCanMake;


    // CONSTRUCTOR

    public Server(){
        drinksCanMake = new ArrayList<>();

    }

    public boolean canServeGuest(Guest guest){
        if(guest.getAge() < 18 || guest.getSobriety() <50 || guest.getCurrency() !='£' || guest.isGuestBanned() || guest.getWallet() <5 || !drinksCanMake.contains(guest.getFavouriteDrink())){
            return false;
        }
        else
            System.out.println("You can be served here, enjoy your evening");
            return true;

    }

    public void addDrinksCanMake (String drinksCanMake) {
        this.drinksCanMake.add(drinksCanMake);
     }

}



// The following criteria need to be met:
//Guest must be over 18
//Guest must have enough money (each drink should cost £5.00, if they have more, they can be served)
//Guest must be sober enough (using an integer scale, 100-50 they are sober enough, under 50 refused!)
//Guest must not be banned from the pub
//Guest must have money in the local currency (Hint: Use a char for the currency symbol)

