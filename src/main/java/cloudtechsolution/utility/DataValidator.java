package cloudtechsolution.utility;

public class DataValidator {
	
	public static boolean isName(String val) {
		String name = "^[A-Za-z ]*$";
		if (val.matches(name)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isRollNo(String val) {
		String passregex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		if (val.matches(passregex)) {
			return true;
		}
		else {
			return false;
		}		
	}
	
	 public static boolean isValidPassword(String password) {
		 String passregex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d@#$%^&+=!]{8,}$"; 
		  if (password.matches(passregex)) {
			  return true;			  
		  }
		  else {
			  return false;
		  }
	 }
	 
	 public static boolean isPhoneNo(String val) {
		 String regex = "^(\\+\\d{1,3}[- ]?)?\\d{10}$";
		 if (val.matches(regex)) {
			 return true;
		 }
			 else {
				 return false;
			 }
		 }
	 
	 public static boolean isNul(String val) {
		 if (val == null || val.trim().length() == 0){
			 return true;
		 }
			 else {
				 return false;
			 }				 
		 }
	 
	 public static boolean isNotNul(String val) {
		 return !isNotNul(val);	 
		
	    }
	 
	 public static boolean isInteger(String val) {
		 if (isNotNul(val)) {
			 try {
				 int i = Integer.parseInt(val);
				 return true;
			 } catch (NumberFormatException e) {
				 return false;				 
			 }
		 }
			 else {
				 return false;
			 }
		 }
	 public static boolean isLong(String val){
		 if (isNotNul(val)) {
			 try {
				 long i = Long.parseLong(val);
				 return true;
			 } catch (NumberFormatException e) {
				 return false;				 
			 }
		 }
			 else {
				 return false;
			 }
	 }
	 
	 public static boolean isEmail(String val) {
		 String emailReg = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		 if (isNotNul(null)) {
			 try {
				 return val.matches(emailReg);
			 } catch (NumberFormatException e) {
				 return false;
			 }				 
		   }  
		 else {
			 	return false;						 
		     }			 
		 }	 
}
	 
