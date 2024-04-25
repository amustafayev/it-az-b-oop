package lesson6.observer;

import java.util.List;

public interface Observer {
    void notify(List<String> vacancies);
}
