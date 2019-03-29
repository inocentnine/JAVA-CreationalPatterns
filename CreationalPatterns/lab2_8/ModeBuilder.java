package lab2_8;

public abstract class ModeBuilder {
    protected MainScreen mainscreen=new MainScreen();

    public abstract void buildMenu();
    public abstract void buildPlayList();
    public abstract void buildMainWindow();
    public abstract void buildControlBar();

    public MainScreen getMainScreen(){
        return mainscreen;
    }
}
