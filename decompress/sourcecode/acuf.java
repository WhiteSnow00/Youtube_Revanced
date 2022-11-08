import android.view.View$OnClickListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acuf implements actl
{
    public View a;
    public CharSequence b;
    public CharSequence c;
    public aibb d;
    public aibb e;
    public actk f;
    public View$OnClickListener g;
    public acul h;
    private boolean i;
    private int j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private int o;
    private float p;
    private aexq q;
    private aexq r;
    private byte s;
    
    public acuf() {
    }
    
    public acuf(final byte[] array) {
        this();
    }
    
    public acuf(final char[] array) {
        this((byte[])null);
        final aewp a = aewp.a;
        this.q = a;
        this.r = a;
    }
    
    public final acuf a(final aibb d) {
        final acuf e = this.e();
        e.d = d;
        return e;
    }
    
    public final acuf b(final aibb e) {
        final acuf j = this.j();
        j.e = e;
        return j;
    }
    
    public final acug c() {
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
        return new acug(this.i, this.j, this.k, this.a, this.b, this.c, this.d, this.e, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.f, this.g, this.h);
    }
    
    public final void d(final aexq r) {
        if (r != null) {
            this.r = r;
            return;
        }
        throw new NullPointerException("Null acceptFeedbackOnTargetTapEnabled");
    }
    
    protected final /* synthetic */ acuf e() {
        return this;
    }
    
    public final void f(final int o) {
        this.o = o;
        this.s |= 0x40;
    }
    
    public final void g(final aexq q) {
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
    
    protected final /* synthetic */ acuf j() {
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
}
