package lesson6.observer;

public class Main {
    public static void main(String[] args) {
        VacancySite site = new VacancySite();
        site.addVacancy("SMM");
        site.addVacancy("Developer");

        Observer user_1 = new Subscriber("John");
        Observer user_2 = new Subscriber("Alex");

        site.addObserver(user_1);
        site.addObserver(user_2);

        site.addVacancy("HR");
    }
}
