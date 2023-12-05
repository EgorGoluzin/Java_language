package HW7;

public class Swapper<T> 
    {
    private T value;

    public Swapper(T value)
    {
        this.value = value;
    }

    public T get() 
    {
        return value;
    }

    public void set(T value)
    {
        this.value = value;
    }
}
