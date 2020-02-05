
public class hello {

    public static void main (String[] args) {
    	System.out.println ("Here ye : important announcement");
		/* This will display the date and time in the format of
		 * 12/09/2017 24:12:35. See the complete program below
		 */
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
		
		/* Total memory currently in use by the JVM */
		System.out.println("Total memory (bytes): " + 
		Runtime.getRuntime().totalMemory());

    	System.out.println ("Hello World!");
    	System.out.println ("Hi Alice");
    	System.out.println ("Hi Bob");
		System.out.println ("Hi Charlie");
		System.out.println ("Hello Denise");
		System.out.println ("Hello Ester");
    	System.out.println ("Thank you for your attention. Goodbye");
    }

}
