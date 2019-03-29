package lab2_8;

public class SimpleMode extends ModeBuilder{
    public void buildMenu() {
        mainscreen.setMenu("");
    }

    public void buildPlayList() {
        mainscreen.setPlayList("");
    }

    public void buildMainWindow() {
        mainscreen.setMainWindow("精简模式下的主窗口");
    }

    public void buildControlBar() {
        mainscreen.setControlBar("精简模式下的控制条");
    }
}
