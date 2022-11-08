// 
// Decompiled by Procyon v0.6.0
// 

public final class ivh implements sgs
{
    public final sja a;
    public final sjh b;
    public final wwv c;
    public final sbc d;
    public sjc e;
    public ivu f;
    public sjj g;
    public sjd h;
    public sjf i;
    public sji j;
    public boolean k;
    public boolean l;
    public kvp m;
    
    public ivh(final sjh b, final wwv c, final sbc d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = new sja();
        this.l = false;
    }
    
    public final void pm(final sji a) {
        this.j = a;
        this.b.f = a;
        final sjf i = this.i;
        if (i != null) {
            i.a = a;
        }
    }
    
    public final void rP(final sib sib) {
        final boolean p = qcv.p(sib, 2);
        final sjc e = this.e;
        e.getClass();
        ((sjb)e).e((Object)sib.e, p);
        final kvp m = this.m;
        m.getClass();
        final sif g = sib.g;
        final shz a = g.a;
        if (!a.equals((Object)((sif)m.a).a)) {
            final Object b = m.b;
            final CharSequence b2 = a.b;
            final CharSequence c = a.c;
            aorm d;
            if ((d = a.d) == null) {
                d = null;
            }
            ((ivu)b).b(b2, c, d);
        }
        m.a = g;
        this.a.e((Object)p, sib.b);
        final sjj g2 = this.g;
        g2.getClass();
        ((sjb)g2).e((Object)sib.c, p);
        final sjd h = this.h;
        h.getClass();
        ((sjb)h).e((Object)sib.h, p);
        final sjf i = this.i;
        i.getClass();
        ((sjb)i).e((Object)sib.i, p);
    }
}
