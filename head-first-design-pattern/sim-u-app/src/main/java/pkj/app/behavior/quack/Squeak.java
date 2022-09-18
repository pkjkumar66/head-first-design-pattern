package pkj.app.behavior.quack;

import pkj.app.behavior.quack.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
