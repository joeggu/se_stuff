package otherStuff.observer;

import java.util.ArrayList;
import java.util.List;
public class Button {

    List<OnClickListener> observerList = new ArrayList<>();

    public void addClickListener(OnClickListener observer){
        if(observer != null) observerList.add(observer);
    }

    public void notifyListener(){
        for (OnClickListener observer : observerList){
            observer.onButtonClick(this);
        }
    }
}
