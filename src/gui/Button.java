package gui;

public class Button {
    String text;
    EventHandler handler;

    public Button(EventHandler handler){
        this.handler = handler;
    }

    public void click(){
        handler.handle();
    }
}


