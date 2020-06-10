package net.viralpatel;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class URLDecoderTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(URLEncoderTest.class);

    public static  void decode(String encoded) throws UnsupportedEncodingException {

        String plain = URLDecoder.decode(encoded, StandardCharsets.UTF_8.toString());
        LOGGER.info("Encoded text: {}, Plain text: {}", encoded, plain);
    }

    @Test
    public void decodeTests() throws UnsupportedEncodingException {
        decode("john%2Bdoe%40example.com");
        decode("sample+text");
        decode("%2B1653-124-23");
    }
}
