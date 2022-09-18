package pkj.app.behavior.quack;

import pkj.app.behavior.quack.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
