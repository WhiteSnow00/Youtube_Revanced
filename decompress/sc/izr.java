// 
// Decompiled by Procyon v0.6.0
// 

public final class izr implements fpz
{
    public final long a;
    public final wyw b;
    public final vcy c;
    public final atjm d;
    public final atjm e;
    public final atjm f;
    public final atjm g;
    public final atjm h;
    public final atjm i;
    public final abag j;
    public final ashi k;
    public ivf l;
    public final msr m;
    public final pvh n;
    public final pvh o;
    private final qv p;
    
    public izr(final wyw b, final vcy c, final abag j, final ashi k, final msr m, final qv p14, final pvh o, final long a, final pvh n, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.p = p14;
        this.o = o;
        this.a = a;
        this.n = n;
        this.b = b;
        this.c = c;
        this.d = atjm.e();
        this.e = atjm.e();
        this.f = atjm.e();
        this.h = atjm.e();
        this.i = atjm.e();
        this.g = atjm.e();
        this.j = j;
        this.k = k;
        this.m = m;
        p14.a((iyv)new ivt(this, 5));
    }
    
    public final void a(final boolean b) {
        final ivf l = this.l;
        if (l == null) {
            return;
        }
        l.a(b);
    }
    
    public final void b(final boolean b) {
        this.e.tu((Object)b);
    }
    
    public final void c(final boolean b) {
        this.d.tu((Object)b);
    }
    
    public final void d(final boolean b) {
        this.f.tu((Object)b);
    }
    
    public final void e(final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3) {
        this.i.tu((Object)new ajb(charSequence, charSequence2, charSequence3));
    }
    
    public final void f(final boolean b) {
        Boolean b2;
        if (this.f.ba()) {
            b2 = (Boolean)this.f.aX();
        }
        else {
            b2 = null;
        }
        if (b2 != null && b2) {
            this.p.b();
        }
        final ivf l = this.l;
        if (l == null) {
            return;
        }
        l.f(b);
    }
    
    public final void g(final boolean b) {
        final ivf l = this.l;
        if (l != null) {
            l.g(b);
        }
    }
}
