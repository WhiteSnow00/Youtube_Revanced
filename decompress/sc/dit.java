import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dit implements dik, diu
{
    private final ContentResolver a;
    private final int b;
    
    public dit(final ContentResolver a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final ddy a(final Uri uri) {
        final int b = this.b;
        if (b == 0) {
            return (ddy)new deg(this.a, uri);
        }
        if (b != 1) {
            return (ddy)new deo(this.a, uri);
        }
        return (ddy)new ddu(this.a, uri);
    }
    
    @Override
    public final dij b(final dio dio) {
        final int b = this.b;
        if (b == 0) {
            return new div(this);
        }
        if (b != 1) {
            return new div(this);
        }
        return new div(this);
    }
    
    @Override
    public final void c() {
    }
}
