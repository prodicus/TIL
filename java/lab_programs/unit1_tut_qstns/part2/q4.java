/*

	Name : Tasdik Rahman
	Question : Unit 1 tutorial questions, PART-II, Question "4"
	
	4.  Apply an Object oriented paradigm using java to develop a stand alone 
		application for Number conversion(all) in java. 

*/


import java.util.Scanner ; 	
public class q4{
	public static void main(String[] args){
		System.out.println() ; 
						
		System.out.print("Enter the number : ") ; 
		int num ; 
		Scanner user_input = new Scanner(System.in) ; 
		num = user_input.nextInt() ; // got the user input

		System.out.println("\n" + num + " in Binary : " + Integer.toBinaryString(num) );
		System.out.println("\n" + num + " in Hexadecimal : " + Integer.toHexString(num) );
		System.out.println("\n" + num + " in Octal : " + Integer.toOctalString(num) );

		System.out.println() ; 
	}
}

/*
	-------------->> OUTPUT <<--------------
	Enter the number : 4

	4 in Binary : 100

	4 in Hexadecimal : 4

	4 in Octal : 4

----------------------------------------------

	Enter the number : 10

	10 in Binary : 1010

	10 in Hexadecimal : a

	10 in Octal : 12

	----------------------------------------
*/




/*
------------------------------------------------------
http://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html#toBinaryString%28int%29
-------------------------------------------------------
*/

/*
 This program converts Integer to Hexadecimal:
01	import java.io.BufferedReader;
02	import java.io.IOException;
03	import java.io.InputStreamReader;
04	 
05	/**
06	 *
07	 * @author M.Vasudevarao
08	 
09	public class DecToHexConverter
10	{
11	    public String convertToHex(int decimalVal)
12	    {
13	        String hexValue = "";
14	        int reminder = 0;
15	        do
16	        {
17	            reminder = decimalVal % 16;
18	            hexValue = (reminder <= 9 && reminder >= 0) ? ((char) ('0' + reminder) + hexValue) : ((char) ('A' + (reminder - 10)) + hexValue);
19	            decimalVal = decimalVal / 16;
20	 
21	        } while (decimalVal != 0);
22	        return hexValue;
23	    }
24	 
25	    public static void main(String args[]) throws IOException
26	    {
27	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
28	        String intValInStr;
29	        System.out.println("Enter the integer val: ");
30	        intValInStr = reader.readLine();
31	        DecToHexConverter converter = new DecToHexConverter();
32	        Integer intVal = Integer.parseInt(intValInStr);
33	        if (intVal.intValue() < 0)
34	        {
35	            System.out.println("Negative Value can't be converted");
36	            return;
37	        }
38	        System.out.println("HexValue = " + converter.convertToHex(intVal));
39	    }
40	}

 

This program is to convert Decimal to Octal:

01	import java.io.BufferedReader;
02	import java.io.IOException;
03	import java.io.InputStreamReader;
04	 
05	/**
06	 *
07	 * @author M.Vasudevarao
08	 
09	public class DecToOctConverter
10	{
11	    public String convertToOct(int decimalVal)
12	    {
13	        String octValue = "";
14	        int reminder = 0;
15	        do
16	        {
17	            reminder = decimalVal % 8;
18	            octValue = reminder + octValue;
19	            decimalVal = decimalVal / 8;
20	 
21	        } while (decimalVal != 0);
22	        return octValue;
23	    }
24	 
25	    public static void main(String args[]) throws IOException
26	    {
27	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
28	        String intValInStr;
29	        System.out.println("Enter the integer val: ");
30	        intValInStr = reader.readLine();
31	        DecToOctConverter converter = new DecToOctConverter();
32	        Integer intVal = Integer.parseInt(intValInStr);
33	        if (intVal.intValue() < 0)
34	        {
35	            System.out.println("Negative Value can't be converted");
36	            return;
37	        }
38	        System.out.println("OctValue = " + converter.convertToOct(intVal));
39	    }
40	}

This Program converts Integer to Binary:

view source
print?
01	/*
02	 * To change this template, choose Tools | Templates
03	 * and open the template in the editor.
04	 
05	package NumConverter;
06	 
07	import java.io.BufferedReader;
08	import java.io.IOException;
09	import java.io.InputStreamReader;
10	 
11	/**
12	 *
13	 * @author M.Vasudevarao
14	 
15	public class DecToBinaryConverter
16	{
17	    public String convertToBinary(int decimalVal)
18	    {
19	        String binaryValue = "";
20	        int reminder = 0;
21	        do
22	        {
23	            reminder = decimalVal % 2;
24	            binaryValue = reminder + binaryValue;
25	            decimalVal = decimalVal / 2;
26	 
27	        } while (decimalVal != 0);
28	        return binaryValue;
29	    }
30	 
31	    public static void main(String args[]) throws IOException
32	    {
33	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
34	        String intValInStr;
35	        System.out.println("Enter the integer val: ");
36	        intValInStr = reader.readLine();
37	        DecToBinaryConverter converter = new DecToBinaryConverter();
38	        Integer intVal = Integer.parseInt(intValInStr);
39	        if (intVal.intValue() < 0)
40	        {
41	            System.out.println("Negative Value can't be converted");
42	            return;
43	        }
44	        System.out.println("BinaryValue = " + converter.convertToBinary(intVal));
45	    }
46	}

*/

/*

A. Binary to Decimal conversion in Java

Binary_Decimal.java

import java.util.Scanner;
 
public class Binary_Decimal {
	
	Scanner scan;
	int num;
	
	void getVal() {
		
		System.out.println("Binary to Decimal");
		scan = new Scanner(System.in);
		
		System.out.println("\nEnter the number :");
		num = Integer.parseInt(scan.nextLine(), 2);
	}
	
	void convert() {
		
		String decimal = Integer.toString(num);
		
		System.out.println("Decimal Value is : " + decimal);
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		Binary_Decimal obj = new Binary_Decimal();
		
		obj.getVal();
		obj.convert();
	}
}


Sample Output

Binary to Decimal

Enter the number :
1010
Decimal Value is : 10





B. Binary to Octal conversion in Java

Binary_Octal.java

import java.util.Scanner;
 
public class Binary_Octal {
	
	Scanner scan;
	int num;
	
	void getVal() {
		
		System.out.println("Binary to Octal");
		scan = new Scanner(System.in);
		
		System.out.println("\nEnter the number :");
		num = Integer.parseInt(scan.nextLine(), 2);
	}
	
	void convert() {
		
		String octal = Integer.toOctalString(num);
		
		System.out.println("Octal Value is : " + octal);
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		Binary_Octal obj = new Binary_Octal();
		
		obj.getVal();
		obj.convert();
	}
}


Sample Output

Binary to Octal

Enter the number :
1010
Octal Value is : 12





C. Binary to HexaDecimal conversion in Java

Binary_Hexa.java

import java.util.Scanner;
 
public class Binary_Hexa {
	
	Scanner scan;
	int num;
	
	void getVal() {
		
		System.out.println("Binary to HexaDecimal");
		scan = new Scanner(System.in);
		
		System.out.println("\nEnter the number :");
		num = Integer.parseInt(scan.nextLine(), 2);
	}
	
	void convert() {
		
		String hexa = Integer.toHexString(num);
		
		System.out.println("HexaDecimal Value is : " + hexa);
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		Binary_Hexa obj = new Binary_Hexa();
		
		obj.getVal();
		obj.convert();
	}
}


Sample Output

Binary to HexaDecimal

Enter the number :
1010
HexaDecimal Value is : a


*/



/*

 toString

public static String toString(int i,
                              int radix)

    Returns a string representation of the first argument in the radix specified by the second argument.

    If the radix is smaller than Character.MIN_RADIX or larger than Character.MAX_RADIX, then the radix 10 is used instead.

    If the first argument is negative, the first element of the result is the ASCII minus character '-' ('\u002D'). If the first argument is not negative, no sign character appears in the result.

    The remaining characters of the result represent the magnitude of the first argument. If the magnitude is zero, it is represented by a single zero character '0' ('\u0030'); otherwise, the first character of the representation of the magnitude will not be the zero character. The following ASCII characters are used as digits:

           0123456789abcdefghijklmnopqrstuvwxyz
         

    These are '\u0030' through '\u0039' and '\u0061' through '\u007A'. If radix is N, then the first N of these characters are used as radix-N digits in the order shown. Thus, the digits for hexadecimal (radix 16) are 0123456789abcdef. If uppercase letters are desired, the String.toUpperCase() method may be called on the result:

         Integer.toString(n, 16).toUpperCase()
         

    Parameters:
        i - an integer to be converted to a string.
        radix - the radix to use in the string representation. 
    Returns:
        a string representation of the argument in the specified radix.
    See Also:
        Character.MAX_RADIX, Character.MIN_RADIX

toHexString

public static String toHexString(int i)

    Returns a string representation of the integer argument as an unsigned integer in base 16.

    The unsigned integer value is the argument plus 232 if the argument is negative; otherwise, it is equal to the argument. This value is converted to a string of ASCII digits in hexadecimal (base 16) with no extra leading 0s. If the unsigned magnitude is zero, it is represented by a single zero character '0' ('\u0030'); otherwise, the first character of the representation of the unsigned magnitude will not be the zero character. The following characters are used as hexadecimal digits:

         0123456789abcdef
         

    These are the characters '\u0030' through '\u0039' and '\u0061' through '\u0066'. If uppercase letters are desired, the String.toUpperCase() method may be called on the result:

         Integer.toHexString(n).toUpperCase()
         

    Parameters:
        i - an integer to be converted to a string. 
    Returns:
        the string representation of the unsigned integer value represented by the argument in hexadecimal (base 16).
    Since:
        JDK1.0.2

toOctalString

public static String toOctalString(int i)

    Returns a string representation of the integer argument as an unsigned integer in base 8.

    The unsigned integer value is the argument plus 232 if the argument is negative; otherwise, it is equal to the argument. This value is converted to a string of ASCII digits in octal (base 8) with no extra leading 0s.

    If the unsigned magnitude is zero, it is represented by a single zero character '0' ('\u0030'); otherwise, the first character of the representation of the unsigned magnitude will not be the zero character. The following characters are used as octal digits:

         01234567
         

    These are the characters '\u0030' through '\u0037'.

    Parameters:
        i - an integer to be converted to a string. 
    Returns:
        the string representation of the unsigned integer value represented by the argument in octal (base 8).
    Since:
        JDK1.0.2

toBinaryString

public static String toBinaryString(int i)

    Returns a string representation of the integer argument as an unsigned integer in base 2.

    The unsigned integer value is the argument plus 232 if the argument is negative; otherwise it is equal to the argument. This value is converted to a string of ASCII digits in binary (base 2) with no extra leading 0s. If the unsigned magnitude is zero, it is represented by a single zero character '0' ('\u0030'); otherwise, the first character of the representation of the unsigned magnitude will not be the zero character. The characters '0' ('\u0030') and '1' ('\u0031') are used as binary digits.

    Parameters:
        i - an integer to be converted to a string. 
    Returns:
        the string representation of the unsigned integer value represented by the argument in binary (base 2).
    Since:
        JDK1.0.2

toString

public static String toString(int i)

    Returns a String object representing the specified integer. The argument is converted to signed decimal representation and returned as a string, exactly as if the argument and radix 10 were given as arguments to the toString(int, int) method.

    Parameters:
        i - an integer to be converted. 
    Returns:
        a string representation of the argument in base 10.

parseInt

public static int parseInt(String s,
                           int radix)
                    throws NumberFormatException

    Parses the string argument as a signed integer in the radix specified by the second argument. The characters in the string must all be digits of the specified radix (as determined by whether Character.digit(char, int) returns a nonnegative value), except that the first character may be an ASCII minus sign '-' ('\u002D') to indicate a negative value. The resulting integer value is returned.

    An exception of type NumberFormatException is thrown if any of the following situations occurs:

        The first argument is null or is a string of length zero.
        The radix is either smaller than Character.MIN_RADIX or larger than Character.MAX_RADIX.
        Any character of the string is not a digit of the specified radix, except that the first character may be a minus sign '-' ('\u002D') provided that the string is longer than length 1.
        The value represented by the string is not a value of type int. 

    Examples:

         parseInt("0", 10) returns 0
         parseInt("473", 10) returns 473
         parseInt("-0", 10) returns 0
         parseInt("-FF", 16) returns -255
         parseInt("1100110", 2) returns 102
         parseInt("2147483647", 10) returns 2147483647
         parseInt("-2147483648", 10) returns -2147483648
         parseInt("2147483648", 10) throws a NumberFormatException
         parseInt("99", 8) throws a NumberFormatException
         parseInt("Kona", 10) throws a NumberFormatException
         parseInt("Kona", 27) returns 411787
         

    Parameters:
        s - the String containing the integer representation to be parsed
        radix - the radix to be used while parsing s. 
    Returns:
        the integer represented by the string argument in the specified radix. 
    Throws:
        NumberFormatException - if the String does not contain a parsable int.

parseInt

public static int parseInt(String s)
                    throws NumberFormatException

    Parses the string argument as a signed decimal integer. The characters in the string must all be decimal digits, except that the first character may be an ASCII minus sign '-' ('\u002D') to indicate a negative value. The resulting integer value is returned, exactly as if the argument and the radix 10 were given as arguments to the parseInt(java.lang.String, int) method.

    Parameters:
        s - a String containing the int representation to be parsed 
    Returns:
        the integer value represented by the argument in decimal. 
    Throws:
        NumberFormatException - if the string does not contain a parsable integer.

valueOf

public static Integer valueOf(String s,
                              int radix)
                       throws NumberFormatException

    Returns an Integer object holding the value extracted from the specified String when parsed with the radix given by the second argument. The first argument is interpreted as representing a signed integer in the radix specified by the second argument, exactly as if the arguments were given to the parseInt(java.lang.String, int) method. The result is an Integer object that represents the integer value specified by the string.

    In other words, this method returns an Integer object equal to the value of:

        new Integer(Integer.parseInt(s, radix)) 

    Parameters:
        s - the string to be parsed.
        radix - the radix to be used in interpreting s 
    Returns:
        an Integer object holding the value represented by the string argument in the specified radix. 
    Throws:
        NumberFormatException - if the String does not contain a parsable int.

valueOf

public static Integer valueOf(String s)
                       throws NumberFormatException

    Returns an Integer object holding the value of the specified String. The argument is interpreted as representing a signed decimal integer, exactly as if the argument were given to the parseInt(java.lang.String) method. The result is an Integer object that represents the integer value specified by the string.

    In other words, this method returns an Integer object equal to the value of:

        new Integer(Integer.parseInt(s)) 

    Parameters:
        s - the string to be parsed. 
    Returns:
        an Integer object holding the value represented by the string argument. 
    Throws:
        NumberFormatException - if the string cannot be parsed as an integer.

valueOf

public static Integer valueOf(int i)

    Returns a Integer instance representing the specified int value. If a new Integer instance is not required, this method should generally be used in preference to the constructor Integer(int), as this method is likely to yield significantly better space and time performance by caching frequently requested values.

    Parameters:
        i - an int value. 
    Returns:
        a Integer instance representing i.
    Since:
        1.5

byteValue

public byte byteValue()

    Returns the value of this Integer as a byte.

    Overrides:
        byteValue in class Number

    Returns:
        the numeric value represented by this object after conversion to type byte.

shortValue

public short shortValue()

    Returns the value of this Integer as a short.

    Overrides:
        shortValue in class Number

    Returns:
        the numeric value represented by this object after conversion to type short.

intValue

public int intValue()

    Returns the value of this Integer as an int.

    Specified by:
        intValue in class Number

    Returns:
        the numeric value represented by this object after conversion to type int.

longValue

public long longValue()

    Returns the value of this Integer as a long.

    Specified by:
        longValue in class Number

    Returns:
        the numeric value represented by this object after conversion to type long.

floatValue

public float floatValue()

    Returns the value of this Integer as a float.

    Specified by:
        floatValue in class Number

    Returns:
        the numeric value represented by this object after conversion to type float.

doubleValue

public double doubleValue()

    Returns the value of this Integer as a double.

    Specified by:
        doubleValue in class Number

    Returns:
        the numeric value represented by this object after conversion to type double.

toString

public String toString()

    Returns a String object representing this Integer's value. The value is converted to signed decimal representation and returned as a string, exactly as if the integer value were given as an argument to the toString(int) method.

    Overrides:
        toString in class Object

    Returns:
        a string representation of the value of this object in base 10.

hashCode

public int hashCode()

    Returns a hash code for this Integer.

    Overrides:
        hashCode in class Object

    Returns:
        a hash code value for this object, equal to the primitive int value represented by this Integer object.
    See Also:
        Object.equals(java.lang.Object), Hashtable

equals

public boolean equals(Object obj)

    Compares this object to the specified object. The result is true if and only if the argument is not null and is an Integer object that contains the same int value as this object.

    Overrides:
        equals in class Object

    Parameters:
        obj - the object to compare with. 
    Returns:
        true if the objects are the same; false otherwise.
    See Also:
        Object.hashCode(), Hashtable

getInteger

public static Integer getInteger(String nm)

    Determines the integer value of the system property with the specified name.

    The first argument is treated as the name of a system property. System properties are accessible through the System.getProperty(java.lang.String) method. The string value of this property is then interpreted as an integer value and an Integer object representing this value is returned. Details of possible numeric formats can be found with the definition of getProperty.

    If there is no property with the specified name, if the specified name is empty or null, or if the property does not have the correct numeric format, then null is returned.

    In other words, this method returns an Integer object equal to the value of:

        getInteger(nm, null) 

    Parameters:
        nm - property name. 
    Returns:
        the Integer value of the property.
    See Also:
        System.getProperty(java.lang.String), System.getProperty(java.lang.String, java.lang.String)

getInteger

public static Integer getInteger(String nm,
                                 int val)

    Determines the integer value of the system property with the specified name.

    The first argument is treated as the name of a system property. System properties are accessible through the System.getProperty(java.lang.String) method. The string value of this property is then interpreted as an integer value and an Integer object representing this value is returned. Details of possible numeric formats can be found with the definition of getProperty.

    The second argument is the default value. An Integer object that represents the value of the second argument is returned if there is no property of the specified name, if the property does not have the correct numeric format, or if the specified name is empty or null.

    In other words, this method returns an Integer object equal to the value of:

        getInteger(nm, new Integer(val)) 

    but in practice it may be implemented in a manner such as:

         Integer result = getInteger(nm, null);
         return (result == null) ? new Integer(val) : result;
         

    to avoid the unnecessary allocation of an Integer object when the default value is not needed.

    Parameters:
        nm - property name.
        val - default value. 
    Returns:
        the Integer value of the property.
    See Also:
        System.getProperty(java.lang.String), System.getProperty(java.lang.String, java.lang.String)

getInteger

public static Integer getInteger(String nm,
                                 Integer val)

    Returns the integer value of the system property with the specified name. The first argument is treated as the name of a system property. System properties are accessible through the System.getProperty(java.lang.String) method. The string value of this property is then interpreted as an integer value, as per the Integer.decode method, and an Integer object representing this value is returned.

        If the property value begins with the two ASCII characters 0x or the ASCII character #, not followed by a minus sign, then the rest of it is parsed as a hexadecimal integer exactly as by the method valueOf(java.lang.String, int) with radix 16.
        If the property value begins with the ASCII character 0 followed by another character, it is parsed as an octal integer exactly as by the method valueOf(java.lang.String, int) with radix 8.
        Otherwise, the property value is parsed as a decimal integer exactly as by the method valueOf(java.lang.String, int) with radix 10. 

    The second argument is the default value. The default value is returned if there is no property of the specified name, if the property does not have the correct numeric format, or if the specified name is empty or null.

    Parameters:
        nm - property name.
        val - default value. 
    Returns:
        the Integer value of the property.
    See Also:
        System.getProperty(java.lang.String), System.getProperty(java.lang.String, java.lang.String), decode(java.lang.String)

decode

public static Integer decode(String nm)
                      throws NumberFormatException

    Decodes a String into an Integer. Accepts decimal, hexadecimal, and octal numbers given by the following grammar:

        DecodableString:
            Signopt DecimalNumeral 
            Signopt 0x HexDigits 
            Signopt 0X HexDigits 
            Signopt # HexDigits 
            Signopt 0 OctalDigits

        Sign:
            - 

    DecimalNumeral, HexDigits, and OctalDigits are defined in §3.10.1 of the Java Language Specification.

    The sequence of characters following an (optional) negative sign and/or radix specifier ("0x", "0X", "#", or leading zero) is parsed as by the Integer.parseInt method with the indicated radix (10, 16, or 8). This sequence of characters must represent a positive value or a NumberFormatException will be thrown. The result is negated if first character of the specified String is the minus sign. No whitespace characters are permitted in the String.

    Parameters:
        nm - the String to decode. 
    Returns:
        a Integer object holding the int value represented by nm 
    Throws:
        NumberFormatException - if the String does not contain a parsable integer.
    See Also:
        parseInt(java.lang.String, int)

compareTo

public int compareTo(Integer anotherInteger)

    Compares two Integer objects numerically.

    Specified by:
        compareTo in interface Comparable<Integer>

    Parameters:
        anotherInteger - the Integer to be compared. 
    Returns:
        the value 0 if this Integer is equal to the argument Integer; a value less than 0 if this Integer is numerically less than the argument Integer; and a value greater than 0 if this Integer is numerically greater than the argument Integer (signed comparison).
    Since:
        1.2

highestOneBit

public static int highestOneBit(int i)

    Returns an int value with at most a single one-bit, in the position of the highest-order ("leftmost") one-bit in the specified int value. Returns zero if the specified value has no one-bits in its two's complement binary representation, that is, if it is equal to zero.

    Returns:
        an int value with a single one-bit, in the position of the highest-order one-bit in the specified value, or zero if the specified value is itself equal to zero.
    Since:
        1.5

lowestOneBit

public static int lowestOneBit(int i)

    Returns an int value with at most a single one-bit, in the position of the lowest-order ("rightmost") one-bit in the specified int value. Returns zero if the specified value has no one-bits in its two's complement binary representation, that is, if it is equal to zero.

    Returns:
        an int value with a single one-bit, in the position of the lowest-order one-bit in the specified value, or zero if the specified value is itself equal to zero.
    Since:
        1.5

numberOfLeadingZeros

public static int numberOfLeadingZeros(int i)

    Returns the number of zero bits preceding the highest-order ("leftmost") one-bit in the two's complement binary representation of the specified int value. Returns 32 if the specified value has no one-bits in its two's complement representation, in other words if it is equal to zero.

    Note that this method is closely related to the logarithm base 2. For all positive int values x:

        floor(log2(x)) = 31 - numberOfLeadingZeros(x)
        ceil(log2(x)) = 32 - numberOfLeadingZeros(x - 1) 

    Returns:
        the number of zero bits preceding the highest-order ("leftmost") one-bit in the two's complement binary representation of the specified int value, or 32 if the value is equal to zero.
    Since:
        1.5

numberOfTrailingZeros

public static int numberOfTrailingZeros(int i)

    Returns the number of zero bits following the lowest-order ("rightmost") one-bit in the two's complement binary representation of the specified int value. Returns 32 if the specified value has no one-bits in its two's complement representation, in other words if it is equal to zero.

    Returns:
        the number of zero bits following the lowest-order ("rightmost") one-bit in the two's complement binary representation of the specified int value, or 32 if the value is equal to zero.
    Since:
        1.5

bitCount

public static int bitCount(int i)

    Returns the number of one-bits in the two's complement binary representation of the specified int value. This function is sometimes referred to as the population count.

    Returns:
        the number of one-bits in the two's complement binary representation of the specified int value.
    Since:
        1.5

rotateLeft

public static int rotateLeft(int i,
                             int distance)

    Returns the value obtained by rotating the two's complement binary representation of the specified int value left by the specified number of bits. (Bits shifted out of the left hand, or high-order, side reenter on the right, or low-order.)

    Note that left rotation with a negative distance is equivalent to right rotation: rotateLeft(val, -distance) == rotateRight(val, distance). Note also that rotation by any multiple of 32 is a no-op, so all but the last five bits of the rotation distance can be ignored, even if the distance is negative: rotateLeft(val, distance) == rotateLeft(val, distance & 0x1F).

    Returns:
        the value obtained by rotating the two's complement binary representation of the specified int value left by the specified number of bits.
    Since:
        1.5

rotateRight

public static int rotateRight(int i,
                              int distance)

    Returns the value obtained by rotating the two's complement binary representation of the specified int value right by the specified number of bits. (Bits shifted out of the right hand, or low-order, side reenter on the left, or high-order.)

    Note that right rotation with a negative distance is equivalent to left rotation: rotateRight(val, -distance) == rotateLeft(val, distance). Note also that rotation by any multiple of 32 is a no-op, so all but the last five bits of the rotation distance can be ignored, even if the distance is negative: rotateRight(val, distance) == rotateRight(val, distance & 0x1F).

    Returns:
        the value obtained by rotating the two's complement binary representation of the specified int value right by the specified number of bits.
    Since:
        1.5

reverse

public static int reverse(int i)

    Returns the value obtained by reversing the order of the bits in the two's complement binary representation of the specified int value.

    Returns:
        the value obtained by reversing order of the bits in the specified int value.
    Since:
        1.5

signum

public static int signum(int i)

    Returns the signum function of the specified int value. (The return value is -1 if the specified value is negative; 0 if the specified value is zero; and 1 if the specified value is positive.)

    Returns:
        the signum function of the specified int value.
    Since:
        1.5

reverseBytes

public static int reverseBytes(int i)

    Returns the value obtained by reversing the order of the bytes in the two's complement representation of the specified int value.

    Returns:
        the value obtained by reversing the bytes in the specified int value.
    Since:
        1.5



*/

