import java.io.IOException;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class auap
{
    public static final byte[] a;
    public static final int[] b;
    
    static {
        a = new byte[1024];
        b = new int[1024];
    }
    
    static int a(final InputStream inputStream, final byte[] array, int read, final int n) {
        try {
            read = inputStream.read(array, read, n);
            return read;
        }
        catch (final IOException ex) {
            throw new auaj(ex);
        }
    }
    
    static void b(final byte[] array, final int n, final int n2, final int n3) {
        System.arraycopy(array, n2, array, n, n3 - n2);
    }
}
