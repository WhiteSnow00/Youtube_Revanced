import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class acia implements tdm
{
    final dhc a;
    final abn b;
    final dgg c;
    
    public acia(final dhc a, final dgg c, final abn b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final Object o) {
        final Uri uri = (Uri)o;
        Object a = null;
        if (uri != null) {
            final dfy dfy = (dfy)this.a.f((Object)this.b.c((Object)uri));
            acib acib;
            if (dfy != null && dfy instanceof acib) {
                acib = (acib)dfy;
            }
            else {
                acib = null;
            }
            if (acib != null) {
                a = acib.a;
            }
        }
        return a;
    }
    
    public final void b() {
        throw null;
    }
    
    public final /* bridge */ void c(final Object o, final Object o2) {
        final Uri uri = (Uri)o;
        if (uri != null) {
            this.a.g((Object)this.b.c((Object)uri), (Object)new acib((zii)o2, this.c));
        }
    }
}
