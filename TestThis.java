/**
 * 068_this�ı���_���󴴽����̵�4��
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
		this(a,b);//���ô��εĹ��췽�������ұ���λ�ڵ�һ��
		
		this.c=c;
	 }
 void sing(){
	 
 }
 void eat(){
	 this.sing();//���ñ����е�this������
	 System.out.println("�����躰��ؼҳԷ��أ�");
 }
public static void main(String []args){
	TestThis hi=new TestThis(2,3);
	hi.eat();
}
}
