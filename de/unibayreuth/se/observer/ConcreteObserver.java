package de.unibayreuth.se.observer;

public class ConcreteObserver implements Observer {
    Subject subject;
    int number = 0;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        number++;
    }

    @Override
    public void update(Subject subject) {
        Subject newsubject = subject;
        this.subject = newsubject;
    }

    public void detach() {
        this.subject = null;
        number--;
    }
}
