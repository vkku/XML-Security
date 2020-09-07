package me.vkku.security.unmarshall;

import me.vkku.security.models.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

public class Unmarshalling {

    public static Book unmarshalDates(InputStream inputFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return (Book) jaxbUnmarshaller.unmarshal(inputFile);
    }

}
