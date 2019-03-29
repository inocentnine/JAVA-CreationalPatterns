package lab2_8;

public class MemoryMode extends ModeBuilder{
    public void buildMenu() {
        mainscreen.setMenu("");
    }

    public void buildPlayList() {
        mainscreen.setPlayList("记忆模式下的收藏列表");
    }

    public void buildMainWindow() {
        mainscreen.setMainWindow("记忆模式下的主窗口");
    }

    public void buildControlBar() {
        mainscreen.setControlBar("记忆模式下的控制条");
    }
}
