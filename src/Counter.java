public class Counter {

    public String name;
    public int count;

    public Counter(String name){
        this(name, 0);
    }

    public Counter(String name, int count){
        this.name = name;
        this.count = count;
    }
    public int decrement(){
        return -- count;
    }

    public int increment(){
        return ++ count;
    }

    public int increase(int value) {
        count += value;

        return count;
    }

    public int decrease(int value) {
        count -= value;

        return count;
    }


}