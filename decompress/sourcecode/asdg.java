import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asdg
{
    public static final asdc a;
    
    static {
        a = (asdc)new asde(new byte[0], 0, 0);
    }
    
    public static asdc a(final ByteBuffer byteBuffer) {
        return (asdc)new asdf(byteBuffer);
    }
    
    public static String b(final asdc asdc, final Charset charset) {
        charset.getClass();
        final int f = asdc.f();
        final byte[] array = new byte[f];
        asdc.k(array, 0, f);
        return new String(array, charset);
    }
    
    public static InputStream c(final asdc asdc) {
        return (InputStream)new asdd(asdc);
    }
}
