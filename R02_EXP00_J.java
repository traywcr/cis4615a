// Cody Traywick
// Rule 02.  Expressions (EXP)
// EXP00-J. Do not ignore values returned by methods

public class R02_EXP00_J
{
  public void deleteFile()
  {
    File someFile = new File("someFileName.txt");
    // Do something with someFile
    someFile.delete();
  }
}
