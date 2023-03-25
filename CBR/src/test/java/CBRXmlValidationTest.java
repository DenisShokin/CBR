import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;
import utils.validator.XmlValidator;

import java.io.IOException;

public class CBRXmlValidationTest {

    private final static String xmlPath = "src/test/resources/xml/Balance.xml";
    private final static String xsdPath = "src/test/resources/xsd/schema.xsd";

    @Test
    @DisplayName("Validate Balance.xml by xsd schema")
    void validBalanceXml() throws IOException, SAXException {
        Assertions.assertThat(XmlValidator.getXmlValidateErrors(xsdPath, xmlPath))
                .isEmpty();
    }

}
