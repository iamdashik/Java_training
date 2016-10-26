import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class MainAnalizertest{

    public static void main(String[] args) throws MalformedURLException

    {
        List<URL> urls = new ArrayList<URL>();
        urls.add(new URL("file:\\D:\\Java\\exercises\\exercise9\\Addition.jar"));

 
            try (URLClassLoader urlClassLoader = new URLClassLoader(urls.toArray(new URL[urls.size()])))
            {
                    //Loading the class
                    Class simpleClass = urlClassLoader.loadClass("exerciseReflection.addition.Addition");

 
                    //accessing the constructor to instantiate the class

                  /*  Constructor simpleConstructor = simpleClass.getConstructor();

 

                    //instantiating the class

                    Object simpleClassObj = simpleConstructor.newInstance();

 

                    //accessing an instance method*/

                    Method method = simpleClass.getMethod("execInit");

 

                    //invoking the method..

                  /*  method.invoke(simpleClassObj);*/
            }

            catch (Exception e)

            {

                    e.printStackTrace();

            }

    }

}
