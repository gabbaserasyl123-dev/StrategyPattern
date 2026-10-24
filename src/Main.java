import charging.Wireless;
import user.User;
import user.User1;
import user.User2;
import user.User3;

public class Main {
    public static void main(String[] args) {
        User user1 = new User1();
        User user2 = new User2();
        User user3 = new User3();
        user1.useChargingMethod();
        user2.useChargingMethod();
        user3.useChargingMethod();
        user1.setChargingMethod(new Wireless());
        user1.useChargingMethod();
    }
}