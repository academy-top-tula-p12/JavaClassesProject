package publishers;

public enum Ways {
    LEFT(5),
    RIGHT(10),
    FORWARD(15),
    BACKWARD(20);
    private int count;
    Ways(int count){
        this.count = count;
    }
    public int count(){
        return count;
    }
}
