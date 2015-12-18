package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test<K> {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Albert", "Beyonce", "Chandler", dBirthDate, "256 Dalmation Drive", "315-808-5590", "aChandler@udel.edu", "CHEM");
		Student stu3 = new Student("Adolf", "Bernhardt", "Ford", dBirthDate, "1001 Llama Drive", "315-275-5590", "aFord@gmail.com", "CHEM");
		Student stu4 = new Student("Albert", "The Dingo", "Holmes", dBirthDate, "10 Lion Lane", "315-808-5555", "aDingo@gmail.edu", "ENVR");
		Student stu5 = new Student("Albert", "Beyonce", "Chandler", dBirthDate, "83 Pterodactyl Blvd", "315-555-5555", "SaveTheTrees@aol.edu", "ENVR");
		HashMap<UUID, Student> map = new HashMap();
		map.put(stu1.getPersonID(), stu1);
		map.put(stu2.getPersonID(), stu2);
		map.put(stu3.getPersonID(), stu3);
		map.put(stu4.getPersonID(), stu4);
		map.put(stu5.getPersonID(), stu5);
		assertTrue(map.size()==5);
	}

}
