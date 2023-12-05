package HW7;

public class HW7<T> 
{
    private T value;

    public HW7(T value) 
    {
        this.value = value;
    }

    public T getValue()
    {
        return value;
    }

    public void setValue(T value) 
    {
        this.value = value;
    }

    public static <T> void swapValues(HW7<Swapper<T>> obj1, HW7<Swapper<T>> obj2) 
    {
        Swapper<T> value1 = obj1.getValue();
        Swapper<T> value2 = obj2.getValue();

        Swapper<T> temp = new Swapper<>(value1.get());
        value1.set(value2.get());
        value2.set(temp.get());
    }


    public static void main(String[] args)
    {
        HW7<Swapper<Integer>> obj1 = new HW7<>(new Swapper<>(5));
        HW7<Swapper<Integer>> obj2 = new HW7<>(new Swapper<>(10));

        System.out.println("Values before swap:");
        System.out.println("obj1: " + obj1.getValue().get());
        System.out.println("obj2: " + obj2.getValue().get());

        swapValues(obj1, obj2);

        System.out.println("\nValues after swap:");
        System.out.println("obj1: " + obj1.getValue().get());
        System.out.println("obj2: " + obj2.getValue().get());
    }
}
