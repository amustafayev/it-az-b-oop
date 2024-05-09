package lesson8.generics.generic_list;

public class MyList<A> {
    A[] yaddas = (A[]) new Object[100];
    int index = 0;

    public void add(A object){
        yaddas[index] = object;
        index++;
    }

    public A get(int index){
        return yaddas[index];
    }


    public int size() {
        return this.index;
    }
}
