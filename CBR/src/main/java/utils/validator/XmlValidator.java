package utils.validator;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class XmlValidator {

    public static List<SAXParseException> getXmlValidateErrors(String xsdPath, String xmlPath) throws SAXException, IOException {
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = factory.newSchema(new File(xsdPath));
        Validator validator = schema.newValidator();
        List<SAXParseException> errors = new ArrayList<>();

        validator.setErrorHandler(new ErrorHandler() {
            @Override
            public void warning(SAXParseException e) {
                errors.add(e);
            }

            @Override
            public void error(SAXParseException e) {
                errors.add(e);
            }

            @Override
            public void fatalError(SAXParseException e) {
                errors.add(e);
            }
        });

        validator.validate(new StreamSource(new File(xmlPath)));

        if (errors.size() > 0) {
            return errors;
        } else {
            return Collections.emptyList();
        }
    }

}
