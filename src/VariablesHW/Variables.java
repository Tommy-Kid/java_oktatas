package VariablesHW;

public class Variables {
	// Hozz létre 3 osztályváltozót és 3 konstanst.
		static final String CONSTANT_STRING = "Global variable";
		static String stringValueable = CONSTANT_STRING;
		static int integerValuable = 55;
		static final long CONSTANT_INTEGER = integerValuable;
		static final char CONSTANT_CHAR = 'a';
		static int integerValuable2 = 156;
			
		public static void main (String[] args) {
			
			//Hozz létre 16 darab, egész számokat tároló változót.
			//The range of “byte” data type is -128 to 127
			byte b1 = -128;
			byte b2 = -127;
			byte b3 = 126;
			byte b4 = 127;
			
			// -32,768 to 32,767
			short s1 = -32768;      
		    short s2 = -129;       
		    short s3 = 130;     
		    short s4 = 32767; 
		    
		    //-2,147,483,648 to 2,147,483,647
		    int i1 = Integer.MIN_VALUE;
		    int i2 = Integer.MAX_VALUE;
		    int i3 = -35000;
		    int i4 = 40000;
		    
		    // –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
		    long l1 = Long.MIN_VALUE;
		    long l2 = Long.MAX_VALUE;
		    long l3 = Integer.MIN_VALUE - 10;
		    long l4 = Integer.MAX_VALUE + 5;
		    
		    
		    int szamKettesRendszer = 0b1100011;
		    int szamNyolcasRendszer = 0143;
		    int szamTizesRendszer = 99;
		    int szamTizenhatosRendszer = 0x63;
	        System.out.println("Bináris (0b1100011): " + szamKettesRendszer);
	        System.out.println("Oktális (0143): " + szamNyolcasRendszer);
		    System.out.println("Tízes számrendszer: " + szamTizesRendszer);
	        System.out.println("Hexadecimális (0x63): " + szamTizenhatosRendszer);
	        System.out.println("----------------------------");
	        
	        //Hozz létre karaktereket (char változók) a saját nevedhez.
		    char t ='T';
		    char a = 'a';
		    char m = 'm';
		    char a2 = 'á';
		    char s = 's';
		    
		    System.out.println("" + t + a + m + a2 + s); 
		    
		    char ascii1 = 84;   
		    char ascii2 = 97;  
		    char ascii3 = 109;
		    char ascii4 = 225;  
		    char ascii5 = 115;  
		    
		    System.out.println("" + ascii1 + ascii2 + ascii3 + ascii4 + ascii5); 
		    System.out.println("----------------------------");
		    
		    //Hozz létre 6 különböző Stringet.
		    String st1 = "Szia";
		    String st2 =  "" + t + a + m + a2 + s;
		    
		    String st3 = st1;
		    String st4 = st1 + " " + s2;
		    
		    String st5 = st1 + " "+ st2 + ", hogy telik a napod?";
		    String st6 = "További szép napot," + st2 + "!";
		    
		    System.out.println(st1);
		    System.out.println(st2);
		    System.out.println(st3);
		    System.out.println(st4);
		    System.out.println(st5);
		    System.out.println(st6);
		    System.out.println("----------------------------");
		    
		    //Hozz létre 1 float változót.
		    float result = (6 * 2 - 3 + 2) / 2.0f;
	        System.out.println("Az eredmény: " + result); 
	       
	        System.out.println("----------------------------");
	        
	        int i = -1;
	        long l = 2L;
	        float f = 1.15f;
	         		
	        double result2 = b1 + s3 - integerValuable - CONSTANT_INTEGER - 165.15d;
	        System.out.println("Az eredmény: " + result2);
	        System.out.println("----------------------------");		
	        
	        printSquare("Tamás",5);
	        System.out.println("----------------------------");	
		    
		}
		
		public static void printSquare(String nickname, int number) {
	        System.out.println("Szia "+nickname +"! Az adott szám négyzete amit megadtál az a : " + (number*number));
	    }
	}