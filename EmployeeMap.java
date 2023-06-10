package map;
import java.util.*;

class Faculty{
	private int facultyId;
	private String facultyName;
	private String facultySubject;
	public Faculty(int facultyId, String facultyName, String facultySubject) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.facultySubject = facultySubject;
	}
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public String getFacultySubject() {
		return facultySubject;
	}
	public void setFacultySubject(String facultySubject) {
		this.facultySubject = facultySubject;
	}
	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", facultySubject=" + facultySubject
				+ "]";
	}
	
}
class FacultyId implements Comparator<Faculty>{
	@Override
	public int compare(Faculty f1, Faculty f2) {
		if(f1.getFacultyId()>f2.getFacultyId())
		return 1;
		else if(f1.getFacultyId()<f2.getFacultyId())
		return -1;
		else
		return 0;
		}
}
public class EmployeeMap {

	public static void main(String[] args) {
		Faculty ram=new Faculty(111,"Rammohan","Core Java");
		Faculty venkat=new Faculty(123,"Venkat","Advanced Java");
		Faculty mohan=new Faculty(168,"Mohan",".Net");
		Faculty rao=new Faculty(189,"Rao","Phython");
		Faculty srinivas=new Faculty(121,"Srinivas","C");
		TreeMap<Faculty,String>tm=new TreeMap<Faculty,String>(new FacultyId());
		tm.put(ram,"Java");
		tm.put(venkat, "advjava");
		tm.put(mohan, ".net");
		tm.put(rao,"phython");
		tm.put(srinivas, "c");
		for (Faculty key:tm.keySet()) {
			System.out.println(key);
		}

	}

}
