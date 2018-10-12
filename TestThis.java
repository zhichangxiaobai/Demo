/**
 * 068_this的本质_对象创建过程的4步
 * @author c
 *
 */
public class TestThis {
 int a,b,c;
 TestThis( int a,int b){
	this.a=a;
	this.b=b;
 }
 
 TestThis( int a,int b,int c){
		this(a,b);//调用带参的构造方法，并且必须位于第一行
		
		this.c=c;
	 }
 void sing(){
	 
 }
 void eat(){
	 this.sing();//调用本类中的this（）；
	 System.out.println("你妈妈喊你回家吃饭呢？");
 }
public static void main(String []args){
	TestThis hi=new TestThis(2,3);
	hi.eat();
}
}
