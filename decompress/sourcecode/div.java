import android.net.Uri;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class div implements dij
{
    public static final div a;
    private final /* synthetic */ int b;
    
    static {
        a = new div(1, null);
    }
    
    public div(final int b) {
        this.b = b;
    }
    
    @Deprecated
    public div(final int b, final byte[] array) {
        this.b = b;
    }
    
    public final dii b(final din din) {
        final int b = this.b;
        if (b == 0) {
            return (dii)new diw(din.a((Class)dhy.class, (Class)InputStream.class));
        }
        if (b == 1) {
            return (dii)dim.a;
        }
        if (b != 2) {
            return (dii)new acfu(din.a((Class)Uri.class, (Class)InputStream.class));
        }
        return (dii)new dhx(din.a((Class)dhy.class, (Class)InputStream.class), 6);
    }
    
    public final void c() {
    }
}
