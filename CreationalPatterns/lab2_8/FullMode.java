package lab2_8;

public class FullMode extends ModeBuilder{
    public void buildMenu() {
        mainscreen.setMenu("完整模式下的菜单");
    }

    public void buildPlayList() {
        mainscreen.setPlayList("完整模式下的播放列表");
    }

    public void buildMainWindow() {
        mainscreen.setMainWindow("完整模式下的主窗口");
    }

    public void buildControlBar() {
        mainscreen.setControlBar("完整模式下的控制条");
    }
}
