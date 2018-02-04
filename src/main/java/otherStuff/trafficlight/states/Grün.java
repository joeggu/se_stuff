package otherStuff.trafficlight.states;

import otherStuff.trafficlight.context.Context;

public class Grün implements State {

    @Override
    public void schalte(Context context) throws InterruptedException {
        Thread.sleep(1500);
        context.setPrevious(this);
        context.setState(new Gelb());
        System.out.println("Grün ...");
    }
}
