package my.city;

import my.School.*;

public class School {

	public static void main(String[] args) {

		
		
		Classroom room = new Classroom(101 ,"Mrs. Anderson");
		//System.out.println(room.roomNumber);
		System.out.println(room.floor);
		//System.out.println(room.teacherNam);
		
		System.out.println(Classroom.globalKey);
		
	}

}
