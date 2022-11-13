import android.net.Uri;
import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class diz implements dik
{
    private final Context a;
    private final Class b;
    
    public diz(final Context a, final Class b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final dij b(final dio dio) {
        return new djb(this.a, dio.a(File.class, this.b), dio.a(Uri.class, this.b), this.b);
    }
    
    @Override
    public final void c() {
    }
}
