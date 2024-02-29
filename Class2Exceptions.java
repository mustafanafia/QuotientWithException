public class Class2Exceptions {
Public static void main(String[] args) {
try{
int a = 5;
int b = 10;
int[] array = new int[3];
System.out.println(a/b);
array[1] = 10;
if (b==10) throw new InvalidCuzISaySo(“Made up”);
} // try

catch (ArithmeticException ex) {
System.out.println(ex);
System.out.println(“YEEaaw got it”);
} //catch
catch (Exception ex) {
System.out.println(ex);
System.out.println(“This catches almost everything”);
}
finally { 
System.out.println(“…… at bottom”);
} // finally
} // main
} //class
Public class InvalidCuzISaySo extends Exception { 
// no argument constructor
Public InvalidCuzISaySo() { }
//argument constructor 
Public InvalidCuzISaySo(String ex) {
System.out.println(ex);
System.out.println(“Got over here!!! Wow”);
}//constructor 
} //class



