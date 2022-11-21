import j$.util.Optional;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxm implements acxc
{
    public boolean a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public View$OnClickListener e;
    public aies f;
    public View$OnClickListener g;
    public aies h;
    public aowb i;
    public Optional j;
    public xbg k;
    public acxb l;
    public byte m;
    private boolean n;
    private int o;
    private CharSequence p;
    private int q;
    
    public acxm() {
    }
    
    public acxm(final byte[] array) {
        this();
    }
    
    public acxm(final char[] array) {
        this((byte[])null);
        this.j = Optional.empty();
    }
    
    public final acxm a(final CharSequence charSequence, final View$OnClickListener e) {
        final acxm e2 = this.e(charSequence);
        e2.e = e;
        e2.f = null;
        return e2;
    }
    
    public final acxm b(final CharSequence charSequence, final View$OnClickListener view$OnClickListener, final aies f) {
        final acxm a = this.a(charSequence, view$OnClickListener);
        a.f = f;
        return a;
    }
    
    public final acxm c(final CharSequence charSequence, final View$OnClickListener g) {
        final acxm f = this.f(charSequence);
        f.g = g;
        f.h = null;
        return f;
    }
    
    public final acxm d(final int n) {
        final acxm o = this.o();
        o.n(n);
        o.j = Optional.empty();
        return o;
    }
    
    protected final acxm e(final CharSequence d) {
        this.d = d;
        return this;
    }
    
    protected final acxm f(final CharSequence p) {
        this.p = p;
        return this;
    }
    
    public final /* bridge */ acxm g(final boolean b) {
        this.k(b);
        return this;
    }
    
    public final acxm h(final CharSequence b) {
        this.b = b;
        return this;
    }
    
    @Override
    public final /* bridge */ void i(final int n) {
        throw null;
    }
    
    public final acxn j() {
        if (this.m != 31) {
            final StringBuilder sb = new StringBuilder();
            if ((this.m & 0x1) == 0x0) {
                sb.append(" rateLimited");
            }
            if ((this.m & 0x2) == 0x0) {
                sb.append(" shownOnFullscreen");
            }
            if ((this.m & 0x4) == 0x0) {
                sb.append(" counterfactual");
            }
            if ((this.m & 0x8) == 0x0) {
                sb.append(" duration");
            }
            if ((this.m & 0x10) == 0x0) {
                sb.append(" icon");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new acxn(this.n, this.a, this.o, this.b, this.c, this.d, this.e, this.f, this.p, this.g, this.h, this.i, this.q, this.j, this.k, this.l);
    }
    
    public final void k(final boolean n) {
        this.n = n;
        this.m |= 0x1;
    }
    
    public final /* bridge */ void l(final boolean a) {
        this.a = a;
        this.m |= 0x4;
    }
    
    public final void m() {
        this.o = -2;
        this.m |= 0x8;
    }
    
    public final /* bridge */ void n(final int q) {
        this.q = q;
        this.m |= 0x10;
    }
    
    public final acxm o() {
        this.i = null;
        return this;
    }
}
