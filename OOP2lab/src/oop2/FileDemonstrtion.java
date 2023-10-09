package oop2;
import java.util.Scanner;
	
	 class File
	{
	   // display information about file user specifies
	   public void analyzePath( String path )
	   {
	      // create File object based on user input
	      File name = new File( path );
	
	      if ( name.exists() ) // if name exists, output information about it
	      {
	         // display file (or directory) information
	         System.out.printf(
	            "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
	            name.getName(), " exists",
	            ( name.isFile() ? "is a file" : "is not a file" ),
	            ( name.isDirectory() ? "is a directory" : 
	               "is not a directory" ),
	            ( name.isAbsolute() ? "is absolute path" : 
	               "is not absolute path" ), "Last modified: ",
	            name.lastModified(), "Length: ", name.length(), 
	            "Path: ", name.getPath(), "Absolute path: ",
	            name.getAbsolutePath(), "Parent: ", name.getParent() );
	

	         if ( name.isDirectory() ) // output directory listing
	         {
	            String directory[] = name.list();
	            System.out.println( "\n\nDirectory contents:\n" );
	   
	            for ( String directoryName : directory )
	               System.out.printf( "%s\n", directoryName );
	         } // end else
	      } // end outer if
	      else // not file or directory, output error message
	      {
	         System.out.printf( "%s %s", path, "does not exist." );
	      } // end else  
	   } // end method analyzePath
	} // end class FileDemonstration
	public class FileDemonstrtion
	{
	   public static void main( String args[] )
	   {
	      Scanner input = new Scanner( System.in );
	      FileDemonstration application = new FileDemonstration();
	      
	      System.out.print( "Enter file or directory name here: " );
	      application.analyzePath( input.nextLine() );
	   } // end main
	} // end class FileDemonstrationTest



