public class Main{
  public static void main(string[]args){
    System.out.println("hello world");
  }
}


/* just remember that every Java program has
a class name which must match the filename, and that every program must contain the main() method.*/
//every class MUST be associated to a file,like"Main"is a simulated file that every debugger has

//"println" is the "print" of the java language.
//note there is also the "print" method wich does not insert a new line at the end of output
//to get a code to work you must type first"System.out.(placeholder);"example:
//system.out.println("hello world");
//system: built in java class that has useful members
//remember ";" is the ":" of the java language every code has to end with it ";"
//also remember,the curly braces"{}"mark the beginning and the end of a block code
/*para adicionar comentarios apenas digite duas barras no inicio de uma linha e para usar mais de uma 
linha apenas digite */
/*types of variables:String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
you can also declar "final int" to make it unchangeable
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false
byte - stores whole values from -128 to 127(we will be calling whole "w"from now on)
short - stores w from -32768 to 32767
long - store w from -9223372036854775808 to 9223372036854775807(noting that it MUST end it with"L"if using long variable)
double - basically float but stores bigger values lol
NOTE(using "e" will idicate "power of 10" if using float/double)
other examples
int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";

declaring variables
"variable"EX:STRING variablename="placeholder"
or
"variable"EX:CHAR variablename='S'
a variable MUST have a unique name
it cant contain any spaces(instead use"_"for when you need it) 
you can declare one value to more than one variable
EX: int x,y,z;
    x=y=z="variable"EX:"50";*/
public class Phrase{
  public static void phrase(string[]args){
    System.out.println("this should work")
      }
}
