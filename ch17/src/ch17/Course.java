package ch17;

public class Course {
	private String id;
	private String name;
	private int credit;
	private String lecturer;
	private int week;
	private int start_hour;
	private int end_end;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getLecturer() {
		return lecturer;
	}
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getStart_hour() {
		return start_hour;
	}
	public void setStart_hour(int start_hour) {
		this.start_hour = start_hour;
	}
	public int getEnd_end() {
		return end_end;
	}
	public void setEnd_end(int end_end) {
		this.end_end = end_end;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", credit=" + credit
				+ ", lecturer=" + lecturer + ", week=" + week + ", start_hour="
				+ start_hour + ", end_end=" + end_end + "]";
	}
	
	
}
