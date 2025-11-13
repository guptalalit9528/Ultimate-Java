package advance.Generics;

class Box<T> {   // yaha T ek type ka placeholder hai
    T value;

    public void set(T value) {
        this.value = value;
    }
    public T get() {
        return value;
    }
}