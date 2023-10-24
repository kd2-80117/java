
public class Report {
private String name;
private int count;
public Report() {
	// TODO Auto-generated constructor stub
}
public Report(String name, int count) {
	this.name = name;
	this.count = count;
}
@Override
public String toString() {
	return "Report [name=" + name + ", count=" + count + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}

}
