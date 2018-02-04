package otherStuff.trafficlight.states;

import otherStuff.trafficlight.context.Context;

public class Gelb implements State {

    @Override
    public void schalte(Context context) throws InterruptedException {
        Thread.sleep(1500);
        if(context.getPrevious() instanceof Grün){
            context.setState(new Rot());
        } else {
            context.setState(new Grün());
        }
        context.setPrevious(this);
        System.out.println("Gelb ...");
    }
}
