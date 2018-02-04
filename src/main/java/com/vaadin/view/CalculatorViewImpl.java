package com.vaadin.view;

import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

import java.util.ArrayList;
import java.util.List;

public class CalculatorViewImpl extends CustomComponent implements CalculatorView, Button.ClickListener {

    private Label display = new Label("0.0");
    private List<CalculatorViewListener> listeners = new ArrayList<>();

    public CalculatorViewImpl(){
        GridLayout layout = new GridLayout(4,5);

        layout.addComponent(display, 0, 0, 3, 0);

        String[] operations = new String[]{
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "=", "C", "+"
        };

        for(String caption : operations){
            layout.addComponent(new Button(caption, this));
        }

        setCompositionRoot(layout);
    }

    @Override
    public void buttonClick(Button.ClickEvent clickEvent) {
        for (CalculatorViewListener listener : listeners) {
            listener.buttonClick(clickEvent.getButton().getCaption().charAt(0));
        }
    }

    @Override
    public void setDisplay(double value) {
        display.setValue(Double.toString(value));
    }

    @Override
    public void addListener(CalculatorViewListener listener) {
        listeners.add(listener);
    }
}
