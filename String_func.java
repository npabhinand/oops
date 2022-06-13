public class String_func
{
public static void main(String[] args)
{
//String Concatenation
String str1 = "Rock";
String str2 = "Star";
System.out.println("Strings are:"+str1+","+str2);

//Method 1 : Using concat
String str3 = str1.concat(str2);
System.out.println("String concantenation method1:"+str3);

//Method 2 : Using "+" operator
String str4 = str1 + str2;
System.out.println("String concantenation method2:"+str4);

//Length of a String
System.out.println("Length of String1: " + str1.length());

//character at specific position
System.out.println("Character at position 3: " + str1.charAt(3));

//Compare to
System.out.println("Compare To 'Rock': " + str1.compareTo("Rom"));

//Compare to - Ignore case
System.out.println("Compare To 'Rock' - Case Ignored: " +str1.compareToIgnoreCase("rock"));

//using endsWith
System.out.println("EndsWith character 'k': " + str1.endsWith("k"));

//Convert to lowerCase
System.out.println("Convert to LowerCase: " + str1.toLowerCase());

//Convert to UpperCase
System.out.println("Convert to UpperCase: " + str1.toUpperCase());

//equals
System.out.println("Equals -'Rock': " + str1.equals("rock"));

//equalsIgnoreIgnoreCase
System.out.println("Equals ignore case -'Rock' :" + str1.equalsIgnoreCase("rock"));
}
}
