package bigfinalassessment;

import java.util.ArrayList;
import java.util.List;

public class CSVDataReader extends DataReader {
	String csvFilePath;
	List<Person> persons = new ArrayList<Person>();

	public CSVDataReader() {
		return;

	}

	public void getPersons(List<Person> persons) {
		this.persons = persons;
	}

}
