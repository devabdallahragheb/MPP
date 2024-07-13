package homework.lab8.Answer2.A;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.salary == e2.salary)
			return new EmployeeNameComparator().compare(e1,e2);
		else if(e1.salary < e2.salary)
			return -1;
		else
			return 1;
	}
}
