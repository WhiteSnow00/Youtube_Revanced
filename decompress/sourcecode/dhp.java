import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhp implements dij
{
    private final /* synthetic */ int a;
    
    public dhp(final int a) {
        this.a = a;
    }
    
    public final dii b(final din din) {
        final int a = this.a;
        if (a == 0) {
            return (dii)new dhx((dhm)new dho(0), 1);
        }
        if (a == 1) {
            return (dii)new dhx((dhm)new dho(1), 1);
        }
        if (a == 2) {
            return (dii)new dhr();
        }
        if (a == 3) {
            return (dii)new dhx(din.a((Class)Uri.class, (Class)AssetFileDescriptor.class), 3);
        }
        if (a != 4) {
            return (dii)new dhx(din.a((Class)Uri.class, (Class)InputStream.class), 3);
        }
        return (dii)new dhx(din.a((Class)Uri.class, (Class)ParcelFileDescriptor.class), 3);
    }
    
    public final void c() {
    }
}
