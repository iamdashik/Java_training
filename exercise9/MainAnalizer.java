 import java.io.File;
 import java.io.*;
 import java.net.*;
 import java.util.jar.JarFile;
 import java.lang.reflect.Method;
 import java.lang.reflect.Constructor;
 

class MainAnalizer {
	public static void main(String [] arg) {
		      
		try{      
			
			File dir2 = new File("D:\\Java\\exercises\\exercise9");
			File [] paths = dir2.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.toLowerCase().endsWith(".jar");
				}
			});

			System.out.println(paths[0].toString());
			System.out.println(paths[1]);
			URL [] urls = new URL[2]; 
			int i = 0;
			for (File path : paths) {
				urls[i] = path.toURI().toURL();
				i++;
			}
			
			URLClassLoader classtest = new URLClassLoader(urls, System.class.getClassLoader());
			
			System.out.println(urls[0]);
			Class classreflec = classtest.loadClass("exerciseReflection.addition.Addition");
			System.out.println(classtest.loadClass("exerciseReflection.addition.Addition"));
			Object t = classreflec.getConstructor().newInstance();
			Method method = classreflec.getMethod("execInit", String.class, int.class, int.class);
			method.invoke(t,"class Addition ", 3, 4);
			
			System.out.println(urls[1]);
			Class classreflecM = classtest.loadClass("exerciseReflection.multiplication.Multiplication");
			System.out.println(classtest.loadClass("exerciseReflection.multiplication.Multiplication"));
			Object tM = classreflecM.getConstructor().newInstance();
			Method methodM = classreflecM.getMethod("execInit", String.class, int.class, int.class);
			methodM.invoke(tM,"class Multiplication ", 3 , 2);
			
			
		}
		catch(NoSuchMethodException e){
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}