
public class Horse extends Animal implements ProfessionalRacing {
	private String color;
	private String sex;
	private int age;
	public Horse(String color, String sex, int age) {
		super();
		this.color = color;
		this.sex = sex;
		this.age = age;
	}
	public Horse() {
		super();
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Horse [color=" + color + ", sex=" + sex + ", age=" + age + "]";
	}
}
