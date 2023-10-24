import java.util.Date;

public class BugHandler {
private String name;
private Date created;
public BugHandler() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getCreated() {
	return created;
}
public void setCreated(Date created) {
	this.created = created;
}
@Override
public String toString() {
	return "BugHandler [name=" + name + ", created=" + created + "]";
}
public BugHandler(String name, Date created) {
	this.name = name;
	this.created = created;
}
}
