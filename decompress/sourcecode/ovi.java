import java.nio.ByteBuffer;
import j$.nio.charset.StandardCharsets;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ovi extends aglu
{
    private static final Charset b;
    private static final aglu c;
    private final otd d;
    
    static {
        b = StandardCharsets.UTF_8;
        c = (aglu)new aglw();
    }
    
    public ovi(final otd d) {
        this.d = d;
    }
    
    public final int a(final CharSequence charSequence) {
        try {
            return aglw.e(charSequence);
        }
        catch (final IllegalArgumentException ex) {
            this.d.d(22, "Failed to encode UTF-8 string length", ex);
            return 0;
        }
    }
    
    public final String b(final ByteBuffer byteBuffer, final int n, final int n2) {
        try {
            if (byteBuffer.hasArray()) {
                return new String(byteBuffer.array(), byteBuffer.arrayOffset() + n, n2, ovi.b);
            }
            return ovi.c.b(byteBuffer, n, n2);
        }
        catch (final IllegalArgumentException ex) {
            this.d.d(22, "Failed to decode UTF-8 string", ex);
            return "";
        }
    }
    
    public final void c(final CharSequence charSequence, final ByteBuffer byteBuffer) {
        try {
            ovi.c.c(charSequence, byteBuffer);
        }
        catch (final IllegalArgumentException ex) {
            this.d.d(22, "Failed to encode UTF-8 string", ex);
        }
    }
}
