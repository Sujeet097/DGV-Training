package First;

public class Subject {
	private String subjectName;
	private String duration;
	private int level;
	
	
	public Subject(String subjectName, String duration, int level) {

		this.subjectName = subjectName;
		this.duration = duration;
		this.level = level;
	}


	public String getSubjectName() {
		return subjectName;
	}
	
	


	public int getLevel() {
		return level;
	}


	


	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", duration=" + duration + ", level=" + level + "]";
	}
		

}
