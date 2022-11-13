// 
// Decompiled by Procyon v0.6.0
// 

public final class iwf implements six
{
    public final slg a;
    public final slm b;
    public final wyw c;
    public final sdh d;
    public sli e;
    public iwt f;
    public slo g;
    public slj h;
    public sll i;
    public sln j;
    public boolean k;
    public boolean l;
    public kwr m;
    
    public iwf(final slm b, final wyw c, final sdh d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = new slg();
        this.l = false;
    }
    
    public final void po(final sln a) {
        this.j = a;
        this.b.f = a;
        final sll i = this.i;
        if (i != null) {
            i.a = a;
        }
    }
    
    public final void rV(final skh skh) {
        final boolean m = qdw.m(skh, 2);
        final sli e = this.e;
        e.getClass();
        ((slh)e).e((Object)skh.e, m);
        final kwr i = this.m;
        i.getClass();
        final skl g = skh.g;
        final skf a = g.a;
        if (!a.equals((Object)((skl)i.a).a)) {
            final Object b = i.b;
            final CharSequence b2 = a.b;
            final CharSequence c = a.c;
            aotp d;
            if ((d = a.d) == null) {
                d = null;
            }
            ((iwt)b).b(b2, c, d);
        }
        i.a = g;
        this.a.e((Object)m, skh.b);
        final slo g2 = this.g;
        g2.getClass();
        ((slh)g2).e((Object)skh.c, m);
        final slj h = this.h;
        h.getClass();
        ((slh)h).e((Object)skh.h, m);
        final sll j = this.i;
        j.getClass();
        ((slh)j).e((Object)skh.i, m);
    }
}
