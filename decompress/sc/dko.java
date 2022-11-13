import java.io.IOException;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

final class dko implements dka
{
    private final dkm a;
    private final dox b;
    
    public dko(final dkm a, final dox b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final dgg dgg, final Bitmap bitmap) {
        final IOException c = this.b.c;
        if (c != null) {
            if (bitmap != null) {
                dgg.d(bitmap);
            }
            throw c;
        }
    }
    
    public final void b() {
        this.a.a();
    }
}
