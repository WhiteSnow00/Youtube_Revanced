import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dis implements dij, dit
{
    private final ContentResolver a;
    private final /* synthetic */ int b;
    
    public dis(final ContentResolver a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final ddx a(final Uri uri) {
        final int b = this.b;
        if (b == 0) {
            return (ddx)new def(this.a, uri);
        }
        if (b != 1) {
            return (ddx)new den(this.a, uri);
        }
        return (ddx)new ddt(this.a, uri);
    }
    
    public final dii b(final din din) {
        final int b = this.b;
        if (b == 0) {
            return (dii)new diu((dit)this);
        }
        if (b != 1) {
            return (dii)new diu((dit)this);
        }
        return (dii)new diu((dit)this);
    }
    
    public final void c() {
    }
}
