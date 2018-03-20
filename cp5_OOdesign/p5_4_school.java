package p5_4;

class Person{
	public int age;
	public String name;
	private String gender;
	public Person(int age, String name,String gender){
		this.age = age;
		this.name = name;
		this.gender = gender;
		System.out.println("构造了一个人");
	}
	public String getGender(){
		return this.gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void walk(){
		System.out.println("一个人正在走");
	}
}

class Teacher{
	public String subject;
	public Person a;
	public Teacher(Person a,String subject){
		this.a =a;
		this.subject = subject;
		System.out.println("成功构造了老师,姓名:"+a.name+"年龄："+a.age+" 性别："+a.getGender()+
			(a.getGender()=="m"?".他":".她")+"教"+subject);
	}
	public void teaching(){
		System.out.println("老师在教"+this.subject);
	}
}
class Master{
	public String temper;
	private Teacher a;
	public Master(Teacher a,String temper){
		this.a = a;
		this.temper = temper;
		System.out.println("成功构造了班主任,姓名:"+a.a.name+"年龄："+a.a.age+" 性别："+a.a.getGender()+
			(a.a.getGender()=="m"?".他":".她")+"性格"+temper);
	}
	public void teaching(){
		System.out.println("班主任在教"+this.a.subject);
	}
}

public class p5_4_school{
	public static void main(String[] args) {
		Person p1 = new Person(18,"p1","m");
		Person pt1 = new Person(19,"p2","m");
		Person ptm1 = new Person(12,"p3","f");
		Teacher t1 = new Teacher(pt1,"math");
		Teacher t2 = new Teacher(ptm1,"english");
		Master m1 = new Master(t1,"good");
		p1.walk();
		t1.teaching();
		m1.teaching();
	}
} 