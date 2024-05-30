package oopsM;

public class Student {
	int id;
	String name;
	String branch;
	int subject1;
	int subject2;
	int subject3;
	String gender;
	//Declaring the Method for assigning values to Fields
	void assignValues(int studentId,String studentName,String studentBranch,
				          int firstSubjectMarks,int secondSubjectMarks,int thirdSubjectMarks,
				          String studentGender) {
			//Assigning the values
			id = studentId;
			name = studentName;
			branch = studentBranch;
			subject1 = firstSubjectMarks;
			subject2 = secondSubjectMarks;
			subject3 = thirdSubjectMarks;
			gender = studentGender;
		}	
		//Declaring the Method for displaying values
		void displayStudentDetails() {
			//Define logic
			System.out.println("Student ID      ::::::" + id);
			System.out.println("Student Name    ::::::" + name);
			System.out.println("Student Branch  ::::::" + branch);
			System.out.println("Student Gender  ::::::" + gender);
			System.out.println("Subject-1 Marks ::::::" + subject1);
			System.out.println("Subject-2 Marks ::::::" + subject2);
			System.out.println("Subject-3 Marks ::::::" + subject3);
			System.out.println("Total Marks     ::::::" + getTotalMarks()); //Nested Method Calling
			System.out.println("Average Marks   ::::::" + getAverageMarks());//Nested Method Calling
			System.out.println("Student Result  ::::::" + getStudentResult());//Nested Method Calling
		}
		//Declaring the Method for calculating totalMarks of an Student
		int getTotalMarks() {		
			return (subject1 + subject2 + subject3);
		}
		//Declaring the Method for calculating averageMarks of an Student
		double getAverageMarks() {
			//We need to find the total Marks by calling getTotalMarks();
			int totalMarks = getTotalMarks();
			double avgMarks = totalMarks / 3;
			return avgMarks;
		}//Declaring the Method for evaluating Student Result
		String getStudentResult() {		
			// First we need to get Average Marks of an Student
		    double averageMarks = getAverageMarks();	    
		    //Implement the Business Conditions
		    if(averageMarks > 75) {
		    	return "Congrats Student Passed In First Class....";
		    }else if(averageMarks > 60 && averageMarks <=75) {
		    	return "Congrats Student Passed in Second Class...";
		    }else {
		    	return "Congrats Student Passed in Third Class...";
		    }
		}
		
	public static void main(String[] args) {
		//Creating the object for Student Class
		Student stObj = new Student();
		
		//Accessing the Fields and Assigning Values
		stObj.id = 25;
		stObj.name= "Mahesh";
		stObj.branch = "CSE";		
		
		//Accessing the Fields for Verifying the values
		System.out.println("Student Id     ::::" + stObj.id);
		System.out.println("Student Name   ::::" + stObj.name);
		System.out.println("Student Branch ::::" + stObj.branch);
		
		
		System.out.println("*******************************************************");
		
		//Creating the another object for student class
		Student stObj1 = new Student();
		
		//Accessing the Fields and Assigning Values
		stObj1.id = 35;
		stObj1.name= "Ashok";
		stObj1.branch = "IT";
		
		//Accessing the Fields for Verifying the values
		System.out.println("Student Id     ::::" + stObj1.id);
		System.out.println("Student Name   ::::" + stObj1.name);
		System.out.println("Student Branch ::::" + stObj1.branch);			

	}

}
