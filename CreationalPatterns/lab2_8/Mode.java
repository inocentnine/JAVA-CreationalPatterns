package lab2_8;

public class Mode {
    public static void main(String[] args){
        ModeBuilder mb=(ModeBuilder)XMLUtil.getBean();
        ScreenMode screen=new ScreenMode();
        screen.setModeBuilder(mb);
        MainScreen mode=screen.construct();

        //System.out.println(mb+"模式");
        System.out.println(mode.getMenu());
        System.out.println(mode.getPlayList());
        System.out.println(mode.getMainWindow());
        System.out.println(mode.getControlBar());
    }
}
