package publishers;

public enum Colors {
    Red("#FF0000"),
    Green("#00FF00"),
    Blue("#0000FF");

    private String rgb;
    Colors(String rgb){
        this.rgb = rgb;
    }

    public String getRgb(){ return rgb; }
}
