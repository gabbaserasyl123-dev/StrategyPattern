package user;

import strategy.IChargingSystem;

public abstract class User {
    protected IChargingSystem strategy;

    public void setW(IChargingSystem strategy) {
        this.strategy = strategy;
    }

    public void co(){
        this.strategy.choice();
    }
}
