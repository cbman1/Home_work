package Example3.impl;
import Example3.base.MyList;

public class MyListImpl implements MyList {
    private final String[] elements = new String[100];
    private int size = 0;

    @Override
    public void add(String element) {
        elements[size] = element;
        size++;
    }

    @Override
    public void remove(int index) {
        elements[index] = null;
        int i = 0;
        while(i <= size) {
            if(elements[i] == null) {
                for (int j = i; j < size; j++) {
                    elements[j] = elements[j+1];
                }
            } i++;
        } size--;
    }

    @Override
    public String get(int index) {
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }
}
