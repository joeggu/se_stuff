package com.vaadin.presenter;

import com.vaadin.model.CalculatorModel;
import com.vaadin.view.CalculatorView;
import com.vaadin.view.CalculatorViewImpl;

public class CalculatorPresenter implements CalculatorView.CalculatorViewListener{

    CalculatorView view;
    CalculatorModel model;

    private double current = 0.0;
    private char lastOperationRequested = 'C';

    public CalculatorPresenter(CalculatorModel model, CalculatorViewImpl view) {
        this.view = view;
        this.model = model;

        view.setDisplay(current);
        view.addListener(this);
    }

    @Override
    public void buttonClick(char operation) {
        if('0' <= operation && operation <= '9'){
            current = current * 10 + Double.parseDouble("" + operation);
            view.setDisplay(current);
            return;
        }

        switch(lastOperationRequested) {
            case '+':
                model.add(current);
                break;
            case '-':
                model.add(-current);
                break;
            case '/':
                model.divide(current);
                break;
            case '*':
                model.multiply(current);
                break;
            case 'C':
                model.clear();
                break;
            default:
                break;
        }

        lastOperationRequested = operation;

        current = 0.0;
        if(operation == 'C') {
            model.clear();
        }

        view.setDisplay(model.getValue());
    }
}
