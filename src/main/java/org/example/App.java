package org.example;

import software.amazon.awssdk.crt.checksums.CRC32;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        CRC32 crc32 = new CRC32();
        crc32.update(10);
        System.out.println(crc32.getValue());
        System.out.println( "Hello World!" );
    }
}
