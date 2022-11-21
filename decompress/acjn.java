import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class acjn implements teq
{
    final dhg a;
    final abo b;
    final dgk c;
    
    public acjn(final dhg a, final dgk c, final abo b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final Object o) {
        final Uri uri = (Uri)o;
        Object a = null;
        if (uri != null) {
            final dgc dgc = (dgc)((dpg)this.a).f((Object)this.b.c((Object)uri));
            acjo acjo;
            if (dgc != null && dgc instanceof acjo) {
                acjo = (acjo)dgc;
            }
            else {
                acjo = null;
            }
            if (acjo != null) {
                a = acjo.a;
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
            ((dpg)this.a).g((Object)this.b.c((Object)uri), (Object)new acjo((zke)o2, this.c));
        }
    }
}
