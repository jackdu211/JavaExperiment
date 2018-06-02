public class Circle
{
public static void main(String[] args)    {
        //Test.sayStatic();
        Test test = new Test(1);
        //test.sayInstance();
    }
}
class Test
{   int a;
	public Test(int a){
	this.a=a;
            System.out.println("这是一个构造方法11。");}
    public static void sayStatic()
    {
        System.out.println("这是一个静态方法。");
    }
    public void sayInstance()
    {
        System.out.println("这是一个实例方法。"+a);
    }
    public Test()
    {     this(1);
            System.out.println("这是一个构造方法。");
	
    }
}
