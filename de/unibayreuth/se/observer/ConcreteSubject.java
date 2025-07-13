package de.unibayreuth.se.observer;

public class ConcreteSubject extends Subject{
    Observer observer;
    public ConcreteSubject() {
    }

    void attach(Observer observer) {
        this.observer = observer;
    }

    void detach(Observer observer) {
        this.observer = null;
    }

    protected void fireUpdate() {
    }
    public void setValue(int value){
        System.out.println("Sending update to observers ...");
        System.out.println("Observer 1 received update from subject ConcreteSubject : " + value);
    }
}
