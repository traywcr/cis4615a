// Cody Traywick
// Rule 04.  Characters and Strings (STR)

public class R04_STR03_J
{
  BigInteger x = new BigInteger("530500452766");
  byte[] byteArray = x.toByteArray();
  String s = new String(byteArray);

  byteArray = s.getBytes();
  x = new BigInteger(byteArray);
}
