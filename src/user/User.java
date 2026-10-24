package user;

import charging.IChargingMethod;

public abstract class User {
    protected IChargingMethod charging;

    public void setChargingMethod(IChargingMethod charging) {
        this.charging = charging;
    }

    public void useChargingMethod() {
        this.charging.choice();
    }
}
