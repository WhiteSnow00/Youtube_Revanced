import android.net.Uri;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class diw implements dik
{
    public static final diw a;
    private final int b;
    
    static {
        a = new diw(1, null);
    }
    
    public diw(final int b) {
        this.b = b;
    }
    
    @Deprecated
    public diw(final int b, final byte[] array) {
        this.b = b;
    }
    
    @Override
    public final dij b(final dio dio) {
        final int b = this.b;
        if (b == 0) {
            return new dix(dio.a(dhz.class, InputStream.class));
        }
        if (b == 1) {
            return din.a;
        }
        if (b != 2) {
            return new achx(dio.a(Uri.class, InputStream.class));
        }
        return new dhy(dio.a(dhz.class, InputStream.class), 6);
    }
    
    @Override
    public final void c() {
    }
}
