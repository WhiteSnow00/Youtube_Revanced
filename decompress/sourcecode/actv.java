import j$.util.Optional;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class actv implements actl
{
    public boolean a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public View$OnClickListener e;
    public aibb f;
    public View$OnClickListener g;
    public aibb h;
    public aorm i;
    public Optional j;
    public wyb k;
    public actk l;
    public byte m;
    private boolean n;
    private int o;
    private CharSequence p;
    private int q;
    
    public actv() {
    }
    
    public actv(final byte[] array) {
        this();
    }
    
    public actv(final char[] array) {
        this((byte[])null);
        this.j = Optional.empty();
    }
    
    public final actv a(final CharSequence charSequence, final View$OnClickListener e) {
        final actv e2 = this.e(charSequence);
        e2.e = e;
        e2.f = null;
        return e2;
    }
    
    public final actv b(final CharSequence charSequence, final View$OnClickListener view$OnClickListener, final aibb f) {
        final actv a = this.a(charSequence, view$OnClickListener);
        a.f = f;
        return a;
    }
    
    public final actv c(final CharSequence charSequence, final View$OnClickListener g) {
        final actv f = this.f(charSequence);
        f.g = g;
        f.h = null;
        return f;
    }
    
    public final actv d(final int n) {
        final actv o = this.o();
        o.n(n);
        o.j = Optional.empty();
        return o;
    }
    
    protected final /* synthetic */ actv e(final CharSequence d) {
        this.d = d;
        return this;
    }
    
    protected final /* synthetic */ actv f(final CharSequence p) {
        this.p = p;
        return this;
    }
    
    public final actw j() {
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
        return new actw(this.n, this.a, this.o, this.b, this.c, this.d, this.e, this.f, this.p, this.g, this.h, this.i, this.q, this.j, this.k, this.l);
    }
    
    public final void k(final boolean n) {
        this.n = n;
        this.m |= 0x1;
    }
    
    public final void m() {
        this.o = -2;
        this.m |= 0x8;
    }
    
    public final /* synthetic */ actv o() {
        this.i = null;
        return this;
    }
}
