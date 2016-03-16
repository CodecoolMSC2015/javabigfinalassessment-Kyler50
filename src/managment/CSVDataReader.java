package managment;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import common.Person;

public abstract class CSVDataReader extends DataReader {
	String csvFilePath;
	List<Person> persons = new ArrayList<Person>();

	public CSVDataReader() {
		return;

	}

	public void getPersons(List<Person> persons) {
		this.persons = persons;
	}
	public static void main(String[] args) throws IOException
	{
		File f = new File("C:\\Users\\Vas Richard Roland\\workspace\\bigfinalassessment\\Documentation\\persons.csv");
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new java.io.FileReader(f));
		String line;
		while ((line = br.readLine()) != null)
		{
			sb.append(line + "\n");
		}
		br.close();
		System.out.println(sb.toString());
	}

}
