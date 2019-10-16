package my.School;

public class Classroom {

	private int roomNumber;
	protected String teacherName;
	public static int globalKey = 54321;
	public int floor = 3;

	/**
	 * @param roomNumber
	 * @param teacherName
	 */
	public Classroom(int roomNumber, String teacherName) {
		this.roomNumber = roomNumber;
		this.teacherName = teacherName;
	}

}
