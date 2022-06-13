/**
 *
 * @author Josh Freeman
 */
public class TwoMethodsA02
 {

  
    /**
     * Method checks if a triangle with given lengths of sides is a right triangle
     * @param a triangle side
     * @param b triangle side
     * @param c triangle side
     * @return true if the triangle is right, false if it is not
     */
    public static boolean isRightTri(int a, int b, int c)
    
    /**
     * if/then statement below uses Pythagorean Theorem to calculate if integers input are for a right triangle
     * Checks if the sum of 2 squared values equal the squared value of a 3rd integer
     * Checks all possibilities and orientations of values
     * If the calculation confirms a right triangle, system prints that the test passed
     * If the calculation confirms there is no right triangle, system prints that the test failed
     */
    {
        if((a*a) + (b*b) == (c*c))
        	return true;
       
        else if((a*a) + (c*c) == (b*b))
        	return true;
        
        else if((b*b) + (c*c) == (a*a))
        	return true;
       
        else
        	return false;
    }
    
    public static void testIsRightTri()
    {
         //*** Test 1 ***//
        if(isRightTri(3, 4, 5)) System.out.println("Test 1 for isRightTri() PASSED");
        else System.out.println("Test 1 for isRightTri() Failed");
   
        //*** Test 2 ***//     
        if(isRightTri(4, 5, 3)) System.out.println("Test 2 for isRightTri() PASSED");
        else System.out.println("Test 2 for isRightTri() Failed");
        
        //*** Test 3 ***//     
        if(isRightTri(5, 4, 3)) System.out.println("Test 3 for isRightTri() PASSED");
        else System.out.println("Test 3 for isRightTri() Failed");
        
        //*** Test 4 ***//     
        if(isRightTri(3, 5, 4)) System.out.println("Test 4 for isRightTri() PASSED");
        else System.out.println("Test 4 for isRightTri() Failed");
        
        //*** Test 5 ***//     
        if(isRightTri(5, 3, 4)) System.out.println("Test 5 for isRightTri() PASSED");
        else System.out.println("Test 5 for isRightTri() Failed");
        
        //*** Test 6 ***//     
        if(isRightTri(4, 3, 5)) System.out.println("Test 6 for isRightTri() PASSED");
        else System.out.println("Test 6 for isRightTri() Failed");
        
        //*** Test 7 ***//     
        if(!isRightTri(4, 4, 5)) System.out.println("Test 7 for isRightTri() PASSED");
        else System.out.println("Test 7 for isRightTri() Failed");
    }
    
    /**
     * The method takes hour, minute, and "am", "pm" components of the time stamp of the moment when car crosses the bridge and calculates the toll rate.
     * If any of the time stamp components are invalid, -1 is being returned as an error code.
     * @param hour hour component of the time stamp 
     * @param min minute component of the time stamp
     * @param amPm either string "am" or "pm", component of the time stamp
     * @return the toll rate  
     */
    
    public static double toll520Bridge(int hour, int min, String amPm)
	   
    {
        // Converts hours and minutes into total amount of minutes
    	int total = hour*60 + min;
    	
    	// If an hour value is out of the 0-12 range, or if a minute value is out of the 0-59 range, or if the string doesn't include am or pm, return test failed
    	// This will help if values are input incorrectly by the user
    	if(hour > 12 || hour < 0 || min > 59 || min < 0)
    		return -1;
    		
    	
    	// If the String value is am, run a if-then statement returning values corresponding to the amount of total
    		if(amPm == "am") {
    			
    			if(total <= 299)
    				return 1.25;
    			
    			else if(total <= 479)
    				return 1.40;
    			
    			else if(total <= 659)
    				return 2.05;
    			
    			else if(total <= 719)
    				return 2.65;
    			
    			else
    				return 1.25;
    		}
    		
    		// If the String value is pm, run a if-then statement returning values corresponding to the amount of total
    		else if(amPm == "pm") {
    			
    			if(total <= 359)
    				return 2.65;
    			
    			else if(total <= 539)
    				return 2.05;
    			
    			else if(total <= 659)
    				return 1.40;
    			
    			else
    				return 1.25;
    		}
    		return -1;
    }
    
    public static void testToll520Bridge()
    {
    	//*** Test 1 ***//  
        if(toll520Bridge(5, 20, "aa")==-1) System.out.println("Test 1 for toll520Bridge() PASSED");
        else System.out.println("Test 1 for toll520Bridge() Failed");
        
        //*** Test 2 ***//  
        if(toll520Bridge(5, 65, "am")==-1) System.out.println("Test 2 for toll520Bridge() PASSED");
        else System.out.println("Test 2 for toll520Bridge() Failed");
        
        //*** Test 3 ***//  
        if(toll520Bridge(15, 15, "am")==-1) System.out.println("Test 3 for toll520Bridge() PASSED");
        else System.out.println("Test 3 for toll520Bridge() Failed");
        
        //*** Test 4 ***//  
        if(toll520Bridge(12, 0, "am")==1.25&&toll520Bridge(4, 59, "am")==1.25&&toll520Bridge(3, 35, "am")==1.25) System.out.println("Test 4 for toll520Bridge() PASSED");
        else System.out.println("Test 4 for toll520Bridge() Failed");
        
        //*** Test 5 ***//  
        if(toll520Bridge(5, 0, "am")==1.4&& toll520Bridge(7, 59, "am")==1.4 && toll520Bridge(6, 03, "am")==1.4) System.out.println("Test 5 for toll520Bridge() PASSED");
        else System.out.println("Test 5 for toll520Bridge() Failed");
        
        //*** Test 6 ***//  
        if(toll520Bridge(8, 0, "am")==2.05 && toll520Bridge(10, 59, "am")==2.05 && toll520Bridge(9, 15, "am")==2.05) System.out.println("Test 6 for toll520Bridge() PASSED");
        else System.out.println("Test 6 for toll520Bridge() Failed");
        
        //*** Test 7 ***//  
        if(toll520Bridge(11, 0, "am")==2.65 && toll520Bridge(4, 59, "pm")==2.65&& toll520Bridge(3, 55, "pm")==2.65) System.out.println("Test 7 for toll520Bridge() PASSED");
        else System.out.println("Test 7 for toll520Bridge() Failed");
        
        //*** Test 8 ***//  
        if(toll520Bridge(6, 0, "pm")==2.05 && toll520Bridge(8, 59, "pm")==2.05 && toll520Bridge(6, 15, "pm")==2.05) System.out.println("Test 8 for toll520Bridge() PASSED");
        else System.out.println("Test 8 for toll520Bridge() Failed");
        
        //*** Test 9 ***//  
        if(toll520Bridge(9, 0, "pm")==1.4 && toll520Bridge(10, 59, "pm")==1.4 && toll520Bridge(9, 3, "pm")==1.4) System.out.println("Test 9 for toll520Bridge() PASSED");
        else System.out.println("Test 9 for toll520Bridge() Failed");
        
        //*** Test 10 ***//  
        if(toll520Bridge(11, 0, "pm")==1.25 && toll520Bridge(11, 59, "pm")==1.25 && toll520Bridge(11, 40, "pm")==1.25) System.out.println("Test 10 for toll520Bridge() PASSED");
        else System.out.println("Test 10 for toll520Bridge() Failed");
    }
    
 
     /** Method main()contains all the tests 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        testIsRightTri();
        testToll520Bridge();
        
    }
    
}