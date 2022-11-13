import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eko extends ekg
{
    public eko() {
        this.a.add(ekr.a);
        this.a.add(ekr.v);
        this.a.add(ekr.S);
        this.a.add(ekr.T);
        this.a.add(ekr.U);
        this.a.add(ekr.aa);
        this.a.add(ekr.ab);
        this.a.add(ekr.ad);
        this.a.add(ekr.ae);
        this.a.add(ekr.ah);
    }
    
    public final eka a(String i, final hyx hyx, final List list) {
        final ekr a = ekr.a;
        final int ordinal = epf.r(i).ordinal();
        if (ordinal == 0) {
            epf.u(ekr.a, 2, list);
            final eka w = hyx.w(list.get(0));
            final eka w2 = hyx.w(list.get(1));
            Object o;
            if (!(w instanceof ejw) && !(w instanceof ekd) && !(w2 instanceof ejw) && !(w2 instanceof ekd)) {
                o = new ejt(w.h() + w2.h());
            }
            else {
                i = w.i();
                o = new ekd(String.valueOf(i).concat(String.valueOf(w2.i())));
            }
            return (eka)o;
        }
        if (ordinal == 21) {
            epf.u(ekr.v, 2, list);
            return (eka)new ejt(hyx.w(list.get(0)).h() / hyx.w(list.get(1)).h());
        }
        if (ordinal == 59) {
            epf.u(ekr.ah, 2, list);
            return (eka)new ejt(hyx.w(list.get(0)).h() + new ejt(-hyx.w(list.get(1)).h()).a);
        }
        if (ordinal == 52 || ordinal == 53) {
            epf.v(i, 2, list);
            final eka w3 = hyx.w(list.get(0));
            hyx.w(list.get(1));
            return w3;
        }
        if (ordinal == 55 || ordinal == 56) {
            epf.v(i, 1, list);
            return hyx.w(list.get(0));
        }
        switch (ordinal) {
            default: {
                return super.b(i);
            }
            case 46: {
                epf.u(ekr.U, 1, list);
                return (eka)new ejt(-hyx.w(list.get(0)).h());
            }
            case 45: {
                epf.u(ekr.T, 2, list);
                return (eka)new ejt(hyx.w(list.get(0)).h() * hyx.w(list.get(1)).h());
            }
            case 44: {
                epf.u(ekr.S, 2, list);
                return (eka)new ejt(hyx.w(list.get(0)).h() % hyx.w(list.get(1)).h());
            }
        }
    }
}
