import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;
import utils.validator.XmlValidator;

import java.io.IOException;

public class CBRTest {

    private final static String XML_BALANCE_PATH = "src/test/resources/xml/Balance.xml";
    private final static String XML_BALANCE_FIX_PATH = "src/test/resources/xml/Balance_fix.xml";
    private final static String XSD_PATH = "src/test/resources/xsd/schema.xsd";

    @Test
    @DisplayName("Validate Balance.xml by xsd schema")
    void validBalanceXml() throws IOException, SAXException {
        Assertions.assertThat(XmlValidator.getXmlValidateErrors(XSD_PATH, XML_BALANCE_PATH))
                .isEmpty();
    }

    @Test
    @DisplayName("Validate Balance_fix.xml by xsd schema")
    void validBalanceFixXml() throws IOException, SAXException {
        Assertions.assertThat(XmlValidator.getXmlValidateErrors(XSD_PATH, XML_BALANCE_FIX_PATH))
                .isEmpty();
    }

}
