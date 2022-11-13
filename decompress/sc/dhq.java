import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhq implements dik
{
    private final int a;
    
    public dhq(final int a) {
        this.a = a;
    }
    
    @Override
    public final dij b(final dio dio) {
        final int a = this.a;
        if (a == 0) {
            return new dhy(new dhp(0), 1);
        }
        if (a == 1) {
            return new dhy(new dhp(1), 1);
        }
        if (a == 2) {
            return new dhs();
        }
        if (a == 3) {
            return new dhy(dio.a(Uri.class, AssetFileDescriptor.class), 3);
        }
        if (a != 4) {
            return new dhy(dio.a(Uri.class, InputStream.class), 3);
        }
        return new dhy(dio.a(Uri.class, ParcelFileDescriptor.class), 3);
    }
    
    @Override
    public final void c() {
    }
}
