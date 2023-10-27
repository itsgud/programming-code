import java.awt.*;
import java.applet.*;
public class demoapplet  extends Applet
{
    Button btn;
    Label lbl;
    TextField txt;
    public void init() 
    {
        btn =new Button("click me");
        lbl=new Label("enter your name: ");
        txt=new TextField(" ");
        add(lbl);
        add(txt);
        add(btn);
        
    }

    
}
