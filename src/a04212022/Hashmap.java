package a04212022;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee himani = new Employee ();
				himani.setEmployeeName("Lawyer");
				himani.setHours(6);
		Employee rupika = new Employee ();
				rupika.setEmployeeName("Marketer");
				rupika.setHours(5);
				int x = 0;
			HashMap<Integer , Employee> employeeGenerator = new HashMap<Integer, Employee>();
			employeeGenerator.put(1, himani);
			employeeGenerator.put(2,  rupika);
			
			//employeeGenerator.get(rupika);
			
			System.out.println(employeeGenerator.get(1).getEmployeeName() );
			//System.out.println(rupika);
	}

}
