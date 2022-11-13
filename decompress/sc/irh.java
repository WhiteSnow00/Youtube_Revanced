import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irh implements abnn
{
    public final Activity a;
    public final kuf b;
    public final vcy c;
    public final wyv d;
    public aixf e;
    public acax f;
    public final aeea g;
    public final aeea h;
    
    public irh(final Activity a, final kuf b, final vcy c, final wyv d, final aeea h, final aeea g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        this.g = g;
    }
    
    public static /* bridge */ void c(final irh irh) {
        irh.f = null;
    }
    
    @Override
    public final Activity a() {
        return this.a;
    }
    
    @Override
    public final void b() {
        final acax f = this.f;
        if (f != null) {
            f.c();
            this.f = null;
        }
    }
}
