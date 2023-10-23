import java.util.Date;

public class Bug {
 public int id;
 public String title;
 public String description;
 public String status;
 public int assigned_to;
 public Date created;
 public Date modified;
public Bug() {
	// TODO Auto-generated constructor stub
}
public Bug(int id, String title, String description, String status, int assigned_to, Date created, Date modified) {
	this.id = id;
	this.title = title;
	this.description = description;
	this.status = status;
	this.assigned_to = assigned_to;
	this.created = created;
	this.modified = modified;
}
@Override
public String toString() {
	return "Bug [id=" + id + ", title=" + title + ", description=" + description + ", status=" + status
			+ ", assigned_to=" + assigned_to + ", created=" + created + ", modified=" + modified + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getAssigned_to() {
	return assigned_to;
}
public void setAssigned_to(int assigned_to) {
	this.assigned_to = assigned_to;
}
public Date getCreated() {
	return created;
}
public void setCreated(Date created) {
	this.created = created;
}
public Date getModified() {
	return modified;
}
public void setModified(Date modified) {
	this.modified = modified;
}
 
}
