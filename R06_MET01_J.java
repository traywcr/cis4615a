// Cody Traywick
// Rule 06.  Methods (MET)
// MET01-J. Never use assertions to validate method arguments

public class R06_MET01_J
{
  public static int getAbsAdd(int x, int y) 
  {
    assert x != Integer.MIN_VALUE;
    assert y != Integer.MIN_VALUE;

    int absX = Math.abs(x);
    int absY = Math.abs(y);

    assert (absX <= Integer.MAX_VALUE - absY);
    return absX + absY;
  }
}
