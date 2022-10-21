package week3day2;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("id= " +id);
		
	}
	public void getStudentInfo(int id ,String Name) {
		System.out.println("id= " +id);
		System.out.println("Name= " +Name);
		
	}
	
	public void getStudentInfo(String Email, String PhoneNumber) {
		System.out.println("Email= " +Email);
		System.out.println("PhoneNumber= " +PhoneNumber);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Students s =new Students();
         s.getStudentInfo(123);
         s.getStudentInfo(123, "Testleaf");
         s.getStudentInfo("testleaf123@gmail.com", "1234567890");
	}

}
