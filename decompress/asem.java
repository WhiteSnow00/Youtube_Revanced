import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asem
{
    public static final asei a;
    
    static {
        a = (asei)new asek(new byte[0], 0, 0);
    }
    
    public static asei a(final ByteBuffer byteBuffer) {
        return (asei)new asel(byteBuffer);
    }
    
    public static String b(final asei asei, final Charset charset) {
        charset.getClass();
        final int f = asei.f();
        final byte[] array = new byte[f];
        asei.k(array, 0, f);
        return new String(array, charset);
    }
    
    public static InputStream c(final asei asei) {
        return (InputStream)new asej(asei);
    }
}
