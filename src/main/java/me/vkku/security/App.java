package me.vkku.security;

import com.sun.xml.internal.ws.util.StreamUtils;
import me.vkku.security.models.Book;
import me.vkku.security.unmarshall.Unmarshalling;

import javax.xml.bind.JAXBException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Hello world!
 *
 */
public class App 
{

    public static final String DEFAULT_DATE_UNMARSHALLING_FILE = "default-date-unmarshalling.xml";

    public static void main( String[] args ) throws JAXBException {
        ClassLoader classLoader = App.class.getClassLoader();
        Book book = Unmarshalling.unmarshalDates(classLoader.getResourceAsStream(DEFAULT_DATE_UNMARSHALLING_FILE));
        System.out.println(book);
    }

}