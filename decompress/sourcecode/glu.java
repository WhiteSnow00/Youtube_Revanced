import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glu implements vus
{
    private final Context a;
    private final boolean b;
    
    public glu(final Context a, final uyf uyf) {
        this.a = a;
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        this.b = alvl.aB;
    }
    
    public final void oN(final vuv vuv) {
        if (this.b && szc.g()) {
            final agza u = ((vii)vuv).u();
            akja akja;
            if ((akja = ((akjd)u.instance).c) == null) {
                akja = akja.a;
            }
            akiy akiy;
            if ((akiy = akiy.b(akja.K)) == null) {
                akiy = akiy.a;
            }
            if (akiy != akiy.c && akiy != akiy.b && akiy != akiy.a) {
                return;
            }
            akja akja2;
            if ((akja2 = ((akjd)u.instance).c) == null) {
                akja2 = akja.a;
            }
            final agza builder = ((agzi)akja2).toBuilder();
            final akiy d = hob.d(this.a);
            builder.copyOnWrite();
            final akja akja3 = (akja)builder.instance;
            akja3.K = d.f;
            akja3.d |= 0x2;
            u.copyOnWrite();
            final akjd akjd = (akjd)u.instance;
            final akja c = (akja)builder.build();
            c.getClass();
            akjd.c = c;
            akjd.b |= 0x1;
        }
    }
}
