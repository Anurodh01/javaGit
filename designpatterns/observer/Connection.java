package designpatterns.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Connection {
    private Person person;
    private String status;

    public Connection(Person person) {
        this.person = person;
    }

    private PropertyChangeSupport support = new PropertyChangeSupport(this);
    public void setStatus(String status){
        support.firePropertyChange("status", this.status, status);
        this.status = status;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public void addPropertyChangeListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }

    @Override
    public String toString() {
        return "Connection{" +
                "person=" + person +
                ", status='" + status + '\'' +
                '}';
    }
}
