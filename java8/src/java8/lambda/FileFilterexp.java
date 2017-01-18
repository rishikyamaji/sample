package java8.lambda;

import java.io.File;
import java.io.FilenameFilter;

import javax.swing.filechooser.FileFilter;

public class FileFilterexp{
   public static void main(String args[])
   {
// FileFilter filter = new FileFilter() {
//	
//	 @Override
//		public boolean accept(File f) {
//			// TODO Auto-generated method stub
//			return f.f.getName().endsWith(".java")
//	 }
//
//	@Override
//	public String getDescription() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	
//};
    FileFilter filter = (File pathname)_->
    pathname.getName().endsWith(".java");
		
    File dir= new File("d:/pdf");
    File[] javaFiles= dir.listFiles(filter);
	

   }

	
}
