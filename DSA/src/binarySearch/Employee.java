package binarySearch;

public class Employee implements Comparable<Employee>{

	int ID;
	
public 	Employee(int x) {
	this.ID = x;     
}

public String toString() {
	return "Employee ID is :"+ ID;
}

public boolean equals(int x) {
	if (this.ID == x) return true;
	else
	return false;
}

@Override
public int compareTo(Employee E) {
	if (ID == E.ID) return 0;
	else if(ID>E.ID)  {
		return 1;
	}
	else return -1;
} 





}
