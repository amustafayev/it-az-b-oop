package lesson6.observer;

import java.util.ArrayList;
import java.util.List;

public class VacancySite implements Observed  {
    List<String> vacancies = new ArrayList<String>();
    List<Observer> subscribers = new ArrayList<Observer>();;

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        this.notifyObserver();

    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObserver() {
            for(Observer subscriber : this.subscribers) {
                subscriber.notify(vacancies);
            }
    }
}
