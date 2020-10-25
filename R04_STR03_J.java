// Cody Traywick
// Rule 04.  Characters and Strings (STR)

public class R04_STR03_J
{
  BigInteger x = new BigInteger("530500452766");
  String s = x.toString();  // Valid character data
  byte[] byteArray = s.getBytes();

  String ns = new String(byteArray); 
  x = new BigInteger(ns); 
}
