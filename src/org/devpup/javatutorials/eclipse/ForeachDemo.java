package org.devpup.javatutorials.eclipse;

public class ForeachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] members = {"A", "B", "씨", "에프"};
		/*
		 * String[] members = new String[4]; members[0] = "A"; members[1] = "B";
		 * members[2]="씨"; members[3]="에프";
		 */	
		
		for (String e : members) {
			System.out.println("String : " + e);
		}
	}

}
