package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import software.amazon.awssdk.crt.checksums.CRC32;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        CRC32 crc32 = new CRC32();
        crc32.update(10);
        System.out.println(crc32.getValue());

        assertTrue( true );
    }
}
