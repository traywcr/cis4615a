//  Cody Traywick
//  Rule 07. Exceptional Behavior (ERR)
//  ERR08-J. Do not catch NullPointerException or any of its ancestors


public class R07_ERR08_J
{
  boolean isName(String s)
  {
    try
    {
      String names[] = s.split(" ");

      if (names.length != 2)
      {
        return false;
      }
      return (isCapitalized(names[0]) && isCapitalized(names[1]));
    }
    catch (NullPointerException e)
    {
      return false;
    }
  }
}
