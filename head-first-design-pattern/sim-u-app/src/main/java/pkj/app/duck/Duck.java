package pkj.app.duck;

import pkj.app.behavior.fly.FlyBehavior;
import pkj.app.behavior.quack.QuackBehaviour;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehaviour quackBehaviour;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void display() {
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
