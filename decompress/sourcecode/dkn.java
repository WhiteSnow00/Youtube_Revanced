import java.io.IOException;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

final class dkn implements djz
{
    private final dkl a;
    private final dow b;
    
    public dkn(final dkl a, final dow b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final dgf dgf, final Bitmap bitmap) {
        final IOException c = this.b.c;
        if (c != null) {
            if (bitmap != null) {
                dgf.d(bitmap);
            }
            throw c;
        }
    }
    
    public final void b() {
        this.a.a();
    }
}
