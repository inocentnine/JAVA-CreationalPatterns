package lab2_8;

public class ScreenMode {
    private ModeBuilder mb;

    public void setModeBuilder(ModeBuilder mb){
        this.mb=mb;
    }

    public MainScreen construct(){
        mb.buildMenu();
        mb.buildPlayList();
        mb.buildMainWindow();
        mb.buildControlBar();
        return mb.getMainScreen();
    }
}
