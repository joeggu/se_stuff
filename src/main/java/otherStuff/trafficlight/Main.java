package otherStuff.trafficlight;

import otherStuff.trafficlight.context.Context;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Context context = new Context();

        for(int i = 0; i < 3; i++){
            context.schalte();
        }
        context.kontaktSchleife();
        for(int i = 0; i < 15; i++){
            context.schalte();
        }
    }
}
