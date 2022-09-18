package pkj.app;

import pkj.app.behavior.fly.FlyNoWay;
import pkj.app.behavior.fly.FlyRocketPowered;
import pkj.app.duck.Duck;
import pkj.app.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.setFlyBehavior(new FlyNoWay());
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
