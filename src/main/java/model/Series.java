package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "id")
public class Series {
@Id
@GeneratedValue
@Column
	private Long id;
private String title;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}

}
