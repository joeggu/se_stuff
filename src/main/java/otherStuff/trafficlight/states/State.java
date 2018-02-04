package otherStuff.trafficlight.states;

import otherStuff.trafficlight.context.Context;

public interface State {
    public void schalte(Context context) throws InterruptedException;
}
