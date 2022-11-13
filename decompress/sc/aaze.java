import android.graphics.Bitmap;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class aaze extends aazf
{
    final aazi a;
    private final aoto b;
    
    public aaze(final aazi a, final aoto b) {
        this.a = a;
        this.b = b;
    }
    
    public final /* bridge */ void b(final Object o, final Object o2) {
        final Uri uri = (Uri)o;
        final Bitmap b = (Bitmap)o2;
        String.valueOf(uri);
        final itw u = this.a.u;
        final aoto b2 = this.b;
        final int d = b2.d;
        final int e = b2.e;
        u.b = b;
        u.c = d;
        u.d = e;
        ((abbk)u).Z(1);
    }
}
