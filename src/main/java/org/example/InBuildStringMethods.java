package org.example;

import java.util.Locale;

public class InBuildStringMethods {
    private static String str2;

    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "hello";
        String str3 = "Hello World";
        StringBuffer stringBuffer = new StringBuffer("Hello World");

        // charAt(int index)
        // Returns the character at the specified index
        System.out.println("charAt(1): " + str.charAt(1)); // 'e'

        // equals(Object obj)
        // Compares the string with the specified string and returns true if both match
        System.out.println("equals: " + str.equals(str3)); // true

        // equalsIgnoreCase(String string)
        //It works same as equals method but it doesn't consider the case while comparing strings. It does a case insensitive comparison
        System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase(str2)); // true

        // compareTo(String string)
        //compares the two strings based on the Unicode value of each character in the strings
        System.out.println("compareTo: " + str.compareTo(str2)); // 32

        // compareToIgnoreCase(String string)
        //Same as CompareTo method however it ignores the case during comparison
        System.out.println("compareToIgnoreCase: " + str.compareToIgnoreCase(str2)); // 0

        // startsWith(String prefix, int offset)
        // Tests if the substring of this string starting at the specified offset begins with the specified prefix
        System.out.println("startsWith with offset: " + str.startsWith("World", 6)); // true

        // startsWith(String prefix)
        // Tests if this string starts with the specified prefix.
        System.out.println("startsWith: " + str.startsWith("Hello")); // true

        // endsWith(String suffix)
        // Tests if this string ends with the specified suffix.
        System.out.println("endsWith: " + str.endsWith("World")); // true

        // hashCode()
        // Returns a hash code for this string.
        System.out.println("hashCode: " + str.hashCode()); // Hash code of "Hello World"

        // indexOf(int ch)
       // Returns the index of first occurrence of the specified character ch in the string.
        System.out.println("indexOf('e'): " + str.indexOf('e')); // 1

        // indexOf(int ch, int fromIndex)
        //Returns the index of first occurrence of the specified character ch in the string.
        System.out.println("indexOf('l', 4): " + str.indexOf('l', 4)); // 9

        // lastIndexOf(int ch)
        //It returns the last occurrence of the character ch in the string.
        System.out.println("lastIndexOf('l'): " + str.lastIndexOf('l')); // 9

        // lastIndexOf(int ch, int fromIndex)
        //Same as lastIndexOf(int ch) method, it starts search from fromIndex.
        System.out.println("lastIndexOf('l', 3): " + str.lastIndexOf('l', 3)); // 2

        // indexOf(String str)
        //This method returns the index of first occurrence of specified substring str.
        System.out.println("indexOf(\"World\"): " + str.indexOf("World")); // 6

        // lastIndexOf(String str)
        //Returns the index of last occurrence of string str.
        System.out.println("lastIndexOf(\"World\"): " + str.lastIndexOf("World")); // 6

        // substring(int beginIndex)
        // Returns a new string that is a substring of this string.
        System.out.println("substring(6): " + str.substring(6)); // "World"

        // substring(int beginIndex, int endIndex)
        // Returns a new string that is a substring of this string.
        System.out.println("substring(0, 5): " + str.substring(0, 5)); // "Hello"

        // concat(String str)
        // Concatenates the specified string to the end of this string.
        System.out.println("concat: " + str.concat("!!!")); // "Hello World!!!"

        // replace(char oldChar, char newChar)
        // Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
        System.out.println("replace('e', 'a'): " + str.replace('e', 'a')); // "Hallo World"

        // contains(CharSequence s)
        // Returns true if and only if this string contains the specified sequence of char values.
        System.out.println("contains(\"World\"): " + str.contains("World")); // true

        // toUpperCase(Locale locale)
        //Converts the string to upper case string using the rules defined by specified locale.
        System.out.println("toUpperCase(Locale.US): " + str.toUpperCase(Locale.US)); // "HELLO WORLD"

        // toUpperCase()
        // Converts all of the characters in this String to upper case using the default locale.
        System.out.println("toUpperCase: " + str.toUpperCase()); // "HELLO WORLD"

        // intern()
        // Returns a canonical representation for the string object.
        String internedString = str.intern();
        System.out.println("intern: " + internedString); // "Hello World"

        // isEmpty()
        // Returns true if, and only if, length() is 0.
        System.out.println("isEmpty: " + str.isEmpty()); // false
        System.out.println("isEmpty (empty string): " + "".isEmpty()); // true

        // join()
        // Returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified delimiter.
        System.out.println("join: " + String.join(", ", "one", "two", "three")); // "one, two, three"

        // replaceFirst(String regex, String replacement)
        // Replaces the first substring of this string that matches the given regular expression with the given replacement.
        System.out.println("replaceFirst: " + str.replaceFirst("l", "L")); // "HeLlo World"

        // replaceAll(String regex, String replacement)
        // Replaces each substring of this string that matches the given regular expression with the given replacement.
        System.out.println("replaceAll: " + str.replaceAll("l", "L")); // "HeLLo WorLd"

        // split(String regex, int limit)
        // Splits this string around matches of the given regular expression.
        String[] partsWithLimit = str.split(" ", 2);
        System.out.println("split with limit: ");
        for (String part : partsWithLimit) {
            System.out.println(part); // "Hello" "World"
        }

        // split(String regex)
        // Splits this string around matches of the given regular expression.
        String[] parts = str.split(" ");
        System.out.println("split: ");
        for (String part : parts) {
            System.out.println(part); // "Hello" "World"
        }

        // toLowerCase(Locale locale)
        // Converts all of the characters in this String to lower case using the rules of the given Locale.
        System.out.println("toLowerCase(Locale.US): " + str.toLowerCase(Locale.US)); // "hello world"

        // toLowerCase()
        // Converts all of the characters in this String to lower case using the default locale.
        System.out.println("toLowerCase: " + str.toLowerCase()); // "hello world"

        // format()
        // Returns a formatted string using the specified format string and arguments.
        System.out.println("format: " + String.format("Formatted %s", str)); // "Formatted Hello World"

        // trim()
        // Returns a string whose value is this string, with any leading and trailing whitespace removed.
        String strWithSpaces = "  Hello World  ";
        System.out.println("trim: '" + strWithSpaces.trim() + "'"); // "Hello World"

        // toCharArray()
        // Converts this string to a new character array.
        char[] charArray = str.toCharArray();
        System.out.println("toCharArray: ");
        for (char c : charArray) {
            System.out.print(c + " "); // 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'
        }
        System.out.println();

        // copyValueOf(char[] data)
        // Returns a string that represents the character sequence in the array specified.
        char[] data = {'H', 'e', 'l', 'l', 'o'};
        System.out.println("copyValueOf: " + String.copyValueOf(data)); // "Hello"

        // copyValueOf(char[] data, int offset, int count)
        // Returns a string that represents the character sequence in the array specified.
        System.out.println("copyValueOf with offset and count: " + String.copyValueOf(data, 1, 3)); // "ell"

        // getChars(int srcBegin, int srcEnd, char[] dest, int destBegin)
        // Copies characters from this string into the destination character array.
        char[] dest = new char[5];
        str.getChars(0, 5, dest, 0);
        System.out.print("getChars: ");
        for (char c : dest) {
            System.out.print(c); // "Hello"
        }
        System.out.println();

        // valueOf()
        // Returns the string representation of the passed argument.
        System.out.println("valueOf(int): " + String.valueOf(123)); // "123"
        System.out.println("valueOf(double): " + String.valueOf(123.45)); // "123.45"

        // contentEquals(StringBuffer sb)
        // Compares this string to the specified StringBuffer.
        System.out.println("contentEquals: " + str.contentEquals(stringBuffer)); // true

        // regionMatches(int srcoffset, String dest, int destoffset, int len)
        // Tests if two string regions are equal.
        System.out.println("regionMatches: " + str.regionMatches(0, "Hello Universe", 0, 5)); // true

        // regionMatches(boolean ignoreCase, int srcoffset, String dest, int destoffset, int len)
        // Tests if two string regions are equal.
        System.out.println("regionMatches ignoreCase: " + str.regionMatches(true, 0, "hello universe", 0, 5)); // true

        // getBytes(String charsetName)
        // Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array.
        try {
            byte[] bytes = str.getBytes("UTF-8");
            System.out.println("getBytes(String charsetName): " + new String(bytes)); // "Hello World"
        } catch (Exception e) {
            e.printStackTrace();
        }

        // getBytes()
        // Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.
        byte[] bytes = str.getBytes();
        System.out.println("getBytes: " + new String(bytes)); // "Hello World"

        // length()
        // Returns the length of this string.
        System.out.println("length: " + str.length()); // 11

        // matches(String regex)
        // Tells whether or not this string matches the given regular expression.
        System.out.println("matches: " + str.matches("Hello World")); // true

        // codePointAt(int index)
        // Returns the character (Unicode code point) at the specified index.
        System.out.println("codePointAt: " + str.codePointAt(1)); // Unicode code point of 'e'



    }

}
