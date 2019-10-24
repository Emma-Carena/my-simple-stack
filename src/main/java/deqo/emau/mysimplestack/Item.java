package deqo.emau.mysimplestack;

public class Item {

    // Commentaire exigence 2

    private Object value;

    Item(Object value) {
        setValue(value);
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
