package otherStuff.trafficlight.context;

import otherStuff.trafficlight.states.State;

public interface ContextEvent {

    public void setState(State state);

    public void setPrevious(State state);

    public State getPrevious();

    public void schalte() throws InterruptedException;

    public void kontaktSchleife();
}
