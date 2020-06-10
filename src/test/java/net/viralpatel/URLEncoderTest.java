package net.viralpatel;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLEncoderTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(URLEncoderTest.class);

    public static  void encode(String plain) throws UnsupportedEncodingException {

        String encoded = URLEncoder.encode(plain, StandardCharsets.UTF_8.toString());
        LOGGER.info("Plain text: {}, Encoded text: {}", plain, encoded);
    }

    @Test
    public void encodeTests() throws UnsupportedEncodingException {

        encode("john+doe@example.com");
        encode("sample text");
        encode("+1653-124-23");

    }
}
