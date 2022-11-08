import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgb
{
    public Uri a;
    public Uri b;
    public amob c;
    public String d;
    public String e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Long i;
    public String j;
    public String k;
    public afcr l;
    public apmo m;
    public String n;
    public String o;
    public int p;
    private apfo q;
    private boolean r;
    private boolean s;
    private byte t;
    
    public final hgc a() {
        if (this.t == 3) {
            final apfo q = this.q;
            if (q != null) {
                final int p = this.p;
                if (p != 0) {
                    final Uri a = this.a;
                    if (a != null) {
                        return new hgc(q, p, a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.r, this.s, this.n, this.o);
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.q == null) {
            sb.append(" uploadFlowSource");
        }
        if (this.p == 0) {
            sb.append(" uploadFlowFlavor");
        }
        if (this.a == null) {
            sb.append(" sourceUri");
        }
        if ((this.t & 0x1) == 0x0) {
            sb.append(" usesYTAudioSource");
        }
        if ((this.t & 0x2) == 0x0) {
            sb.append(" isShortsEligible");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final boolean s) {
        this.s = s;
        this.t |= 0x2;
    }
    
    public final void c(final apfo q) {
        if (q != null) {
            this.q = q;
            return;
        }
        throw new NullPointerException("Null uploadFlowSource");
    }
    
    public final void d(final boolean r) {
        this.r = r;
        this.t |= 0x1;
    }
}
