import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class ServerTest {

    Server server;
    Guest guest;

    @BeforeEach
    public void setUp(){
        server = new Server();
        guest = new Guest("John", 21, 45.50, 60, false, '£', "Woo Woo");

    }

    // TODO: test that guest can only get served if over 18

    @Test
    public void canServeGuestIfOver18__true() {
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
    }

    @Test
    public void canServeGuestIfOver18__false() {
        guest.setAge(17);
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    @Test
    public void canServeGuestIfMoney__true() {
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
    }

    @Test
    public void canServeGuestIfMoney__false() {
        guest.setWallet(4.50);
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

    @Test
    public void canServeGuestIfSobrietyOver50__true(){
        guest.setSobriety(60);
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
    }

    @Test
    public void canServeGuestIfSobrietyOver50__false(){
        guest.setSobriety(40);
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest is not banned from the pub

    @Test
    public void canServeGuestIfNotBanned__true(){
        guest.setGuestBanned(false);
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
    }

    @Test
    public void canServeGuestIfNotBanned__false(){
        guest.setGuestBanned(true);
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    @Test
    public void canServeGuestIfHasLocalCurrency__true(){
        guest.setCurrency('£');
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
    }

    @Test
    public void canServeGuestIfHasLocalCurrency__false(){
        guest.setCurrency('$');
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

    @Test
    public void canServeGuestIfDrinksCanMake__true(){
        guest.setFavouriteDrink("Woo Woo");
        server.addDrinksCanMake("Dark and Stormy");
        server.addDrinksCanMake("Long Island Iced Tea");
        server.addDrinksCanMake("Woo Woo");
        assertThat(server.canServeGuest(guest)).isEqualTo(true);

    }

    @Test
    public void canServeGuestIfDrinksCanMake__false(){
        guest.setFavouriteDrink("Woo Woo");
        server.addDrinksCanMake("Dark and Stormy");
        server.addDrinksCanMake("Long Island Iced Tea");
        assertThat(server.canServeGuest(guest)).isEqualTo(false);

    }

}
