package otherStuff.trafficlight.context;

import otherStuff.trafficlight.states.Grün;
import otherStuff.trafficlight.states.State;

public class Context implements ContextEvent {

    private State current;
    private State previous;

    public Context(){
        this.current = new Grün();
    }

    public void setState(State state){
        this.current = state;
    }

    public void setPrevious(State state){
        this.previous = state;
    }

    public State getPrevious() {
        return previous;
    }

    public void schalte() throws InterruptedException {
        current.schalte(this);
    }

    public void kontaktSchleife(){
        setState(new Grün());
    }
}
