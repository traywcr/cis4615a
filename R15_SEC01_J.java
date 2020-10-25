//  Cody Traywick
//  Rule 15. Platform Security (SEC)
//  SEC01-J. Do not allow tainted variables in privileged blocks


public class R15_SEC01_J
{
  private void privilegedMethod(final String filename)
                              throws FileNotFoundException
  {
    final String cleanFilename;
    try 
    {
      cleanFilename = cleanAFilenameAndPath(filename);
    } 
    catch (/* exception as per spec of cleanAFileNameAndPath */) 
    {
      // Log or forward to handler as appropriate based on specification
      // of cleanAFilenameAndPath
    }
    
    try
    {
      FileInputStream fis =
          (FileInputStream) AccessController.doPrivileged(
            new PrivilegedExceptionAction()
            {
              public FileInputStream run() throws FileNotFoundException
              {
                return new FileInputStream(filename);
              }
            }
          );
      // Do something with the file and then close it
    }
    catch (PrivilegedActionException e)
    {
      // Forward to handler
    }
  }
}
