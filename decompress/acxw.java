import android.view.View$OnClickListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxw implements acxc
{
    public View a;
    public CharSequence b;
    public CharSequence c;
    public aies d;
    public aies e;
    public acxb f;
    public View$OnClickListener g;
    public acyc h;
    private boolean i;
    private int j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private int o;
    private float p;
    private afbh q;
    private afbh r;
    private byte s;
    
    public acxw() {
    }
    
    public acxw(final byte[] array) {
        this();
    }
    
    public acxw(final char[] array) {
        this((byte[])null);
        final afag a = afag.a;
        this.q = a;
        this.r = a;
    }
    
    public final acxw a(final aies d) {
        final acxw e = this.e();
        e.d = d;
        return e;
    }
    
    public final acxw b(final aies e) {
        final acxw j = this.j();
        j.e = e;
        return j;
    }
    
    public final acxx c() {
        if (this.s != -1) {
            final StringBuilder sb = new StringBuilder();
            if ((this.s & 0x1) == 0x0) {
                sb.append(" counterfactual");
            }
            if ((this.s & 0x2) == 0x0) {
                sb.append(" duration");
            }
            if ((this.s & 0x4) == 0x0) {
                sb.append(" rateLimited");
            }
            if ((this.s & 0x8) == 0x0) {
                sb.append(" tapDismissalType");
            }
            if ((this.s & 0x10) == 0x0) {
                sb.append(" targetEffectType");
            }
            if ((this.s & 0x20) == 0x0) {
                sb.append(" placement");
            }
            if ((this.s & 0x40) == 0x0) {
                sb.append(" alignment");
            }
            if ((this.s & 0x80) == 0x0) {
                sb.append(" maxWidthPercentage");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new acxx(this.i, this.j, this.k, this.a, this.b, this.c, this.d, this.e, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.f, this.g, this.h);
    }
    
    public final void d(final afbh r) {
        if (r != null) {
            this.r = r;
            return;
        }
        throw new NullPointerException("Null acceptFeedbackOnTargetTapEnabled");
    }
    
    protected final acxw e() {
        return this;
    }
    
    public final void f(final int o) {
        this.o = o;
        this.s |= 0x40;
    }
    
    public final void g(final afbh q) {
        if (q != null) {
            this.q = q;
            return;
        }
        throw new NullPointerException("Null backgroundColor");
    }
    
    public final void h(final boolean i) {
        this.i = i;
        this.s |= 0x1;
    }
    
    @Override
    public final /* bridge */ void i(final int n) {
        throw null;
    }
    
    protected final acxw j() {
        return this;
    }
    
    public final void k(final int j) {
        this.j = j;
        this.s |= 0x2;
    }
    
    public final void l(final float p) {
        this.p = p;
        this.s |= (byte)128;
    }
    
    public final void m(final int n) {
        this.n = n;
        this.s |= 0x20;
    }
    
    public final void n(final boolean k) {
        this.k = k;
        this.s |= 0x4;
    }
    
    public final void o(final int l) {
        this.l = l;
        this.s |= 0x8;
    }
    
    public final void p(final int m) {
        this.m = m;
        this.s |= 0x10;
    }
    
    public final /* bridge */ void q() {
        this.n(false);
    }
}
