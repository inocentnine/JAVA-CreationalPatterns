# JAVA-CreationalPatterns

创建型设计模式有： 共6种

    简单工厂模式（Simple Factory）

    工厂方法模式（Factory Method）

    抽象工厂模式（Abstract Factory）

    建造者模式（Builder）

    原型模式（Prototype）

    单例模式（Singleton）

  1、使用合理的模式模拟女娲(Nvwa)造人(Person)，如果传入参数M，则返回一个Man对象，如果传入参数W，则返回一个Woman对象，用Java语言模拟实现该场景。现需要增加一个新的Robot类，如果传入参数R，则返回一个Robot对象，对代码进行修改并注意“女娲”的变化。
  
  2、假设我们要开发一个绘图程序，用来绘制简单的几何图形，这个软件应该能够处理下面的几种几何对象：圆形（Circle）、矩形（Rectangle）和正方形（Square）。除了各自特有的属性和方法之外，所有的几何图形几乎都可以抽象出绘制（draw）和擦除（erase）两个公共方法，利用简单工厂模型进行设计，画出结构图并指明类之间的关系，然后用工厂方法模式将其改进。
  
  3、现需要设计一个程序来读取多种不同类型的图片格式，针对每一种图片格式设计一个图片读取器（ImageReader），如GIF图片读取器（GifReader）用于读取GIF格式的图片，JPEG图片读取器（JpgReader）用于读取JPEG格式的图片。图片读取器对象通过图片读取器工厂ImageReaderFactory来创建，ImageReaderFactory是一个抽象类，用于定义创建图片读取器的工厂方法，其子类GifReaderFactory和JpgReaderFactory用于创建具体的图片读取器对象。
  
  4、某系统为了改进数据库操作的性能，自定义数据库连接对象Connection和语句对象Statement，可针对不同类型的数据库提供不同的连接对象和语句对象，如提供Oracle或MySQL专用连接类和语句类，而且用户可以通过配置文件等方式根据实际需要动态更换系统数据库。
  
  5、有一快餐店经营良好，并逐渐发展壮大，为了适合不同地方人的饮食习惯，创建了两大系列（相当于产品族）快餐，北方系列和南方系列。1）每个系列分别由一个大厨掌勺，要求给出快餐店类的关系图及代码。2）在快餐店案例中添加一个美国系列快餐，给出类图并说明如何添加。
  
  6、程序中经常有这样的要求，整个程序运行时只有一个实例被使用。比如：数据库连接池，系统参数配置，Java API 中的 Runtime, Calendar 等等。如何实现这种需求是一个值得讨论的问题。  以往的做法，是在程序的某个类里面（比如是GlobalObject）建立一个这个此种类的实例，然后规定所有需要用到此类的，都从GlobalObject那里获得，看下面的例子：  
  
    public class ConnectionPoolManager {   

    public ConnectionPoolManager { // do some initialize work }  

    public Connection getConnection(){ .... }  

    }   

    public class GlobalObject {   

    private ConnectionPoolManager connectionPoolManager;  

    publicGlobalObject () {   connectionPoolManager = new ConnectionPoolManager(); ... }  

    public void getConnectionPoolManager() { return connectionPoolManager; }  

    }   

     public class QueryFunctions {   

    public static Collection findStudentByName(String name){   

	    ConnectionPoolManager = globalObject.getConnectionPoolManager();  
  
	    Connection connection = connectionPoolManager.getConnection();  
  
	    // query database } 
  
     }   

  但这样做有如下缺点：其他人可能调用ConnectionPoolManager的构造函数自己建立一个数据库连接池，导致程序中存在多个ConnectionPoolManager，人为的规定只创建一个数据库连接池往往不会很好的执行。如何利用单件模式来改进设计，保证系统只建立唯一的连接池，并完善代码。 
  
  7、在游戏中，要求设计一个程序来画小人（person），要求小人有头（head）、身体（body）、两手（arm）、两脚（leg）就可以了，小人有高、矮之分，利用建造者模式进行设计，并画出其类关系图。
  
  8、某软件公司欲开发一个音频和视频播放软件，为了给用户使用提供方便，该播放软件提供了多种界面显示模式，如完整模式、精简模式、记忆模式、网络模式等。在不同的显示模式下主界面的组成元素有所差异，如在完整模式下将显示菜单、播放列表、主窗口、控制条等，在精简模式下只显示主窗口和控制条，而在记忆模式下将显示主窗口、控制条、收藏列表等。现使用建造者模式设计该软件。
  
  9、设计一个客户类Customer，其中客户地址存储在地址类Address中，用浅克隆和深克隆分别实现Customer对象的复制并比较这两种克隆方式的异同。
