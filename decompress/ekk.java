import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ekk extends ekg
{
    public ekk() {
        this.a.add(ekr.b);
        this.a.add(ekr.V);
        this.a.add(ekr.Y);
    }
    
    public final eka a(final String s, final hyx hyx, final List list) {
        final ekr a = ekr.a;
        final int ordinal = epf.r(s).ordinal();
        if (ordinal != 1) {
            if (ordinal == 47) {
                epf.u(ekr.V, 1, list);
                return (eka)new ejr(hyx.w(list.get(0)).g() ^ true);
            }
            if (ordinal != 50) {
                return super.b(s);
            }
            epf.u(ekr.Y, 2, list);
            final eka w = hyx.w(list.get(0));
            if (w.g()) {
                return w;
            }
            return hyx.w(list.get(1));
        }
        else {
            epf.u(ekr.b, 2, list);
            final eka w2 = hyx.w(list.get(0));
            if (!w2.g()) {
                return w2;
            }
            return hyx.w(list.get(1));
        }
    }
}
