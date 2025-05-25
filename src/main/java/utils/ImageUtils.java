package utils;

import java.io.*;

public class ImageUtils {

    public static byte[] fileToBytes(File archivo, int tamanoFile) throws IOException {
        try (InputStream is = new FileInputStream(archivo);
             ByteArrayOutputStream buffer = new ByteArrayOutputStream()) {

            byte[] datos = new byte[tamanoFile];
            int n;
            while ((n = is.read(datos)) != -1)
                buffer.write(datos, 0, n);

            return buffer.toByteArray();
        }
    }

    public static byte[] archivoABytes(File archivo) throws IOException {
        try (InputStream is = new FileInputStream(archivo);
             ByteArrayOutputStream buffer = new ByteArrayOutputStream()) {

            byte[] datos = new byte[1024];
            int n;
            while ((n = is.read(datos)) != -1)
                buffer.write(datos, 0, n);

            return buffer.toByteArray();
        }
    }

}
