package lesson6.observer;

import java.util.List;

public class Subscriber implements  Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notify(List<String> vacancies) {
        System.out.println(name + " yeni vakansiyar gelib " + vacancies );
    }
}
