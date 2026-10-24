package user;

import strategy.Cable;

public class d extends User {
    public d() {
        this.strategy = new Cable();
    }
}
