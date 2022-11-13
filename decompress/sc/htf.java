import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class htf
{
    public oby a;
    public Uri b;
    public String c;
    public Boolean d;
    public aomw e;
    public aona f;
    public aidi g;
    private long h;
    private long i;
    private boolean j;
    private boolean k;
    private byte l;
    
    public htf() {
    }
    
    public htf(final htg htg) {
        this.b = htg.b;
        this.c = htg.c;
        this.h = htg.d;
        this.i = htg.e;
        this.j = htg.f;
        this.k = htg.g;
        this.d = htg.h;
        this.e = htg.i;
        this.f = htg.j;
        this.g = htg.k;
        this.l = 15;
    }
    
    public final htg a() {
        if (this.a != null) {
            if ((this.l & 0x2) == 0x0) {
                throw new IllegalStateException("Property \"clientTimestamp\" has not been set");
            }
            if (this.i == 0L) {
                this.b(System.currentTimeMillis());
            }
        }
        if (this.l == 15 && this.b != null && this.c != null) {
            return new htg(this.b, this.c, this.h, this.i, this.j, this.k, this.d, this.e, this.f, this.g);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" uri");
        }
        if (this.c == null) {
            sb.append(" channelId");
        }
        if ((this.l & 0x1) == 0x0) {
            sb.append(" serverTimestamp");
        }
        if ((this.l & 0x2) == 0x0) {
            sb.append(" clientTimestamp");
        }
        if ((this.l & 0x4) == 0x0) {
            sb.append(" subscriptionStateChanged");
        }
        if ((this.l & 0x8) == 0x0) {
            sb.append(" didRequireSignIn");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final long i) {
        this.i = i;
        this.l |= 0x2;
    }
    
    public final void c(final boolean k) {
        this.k = k;
        this.l |= 0x8;
    }
    
    public final void d(final long h) {
        this.h = h;
        this.l |= 0x1;
    }
    
    public final void e(final boolean j) {
        this.j = j;
        this.l |= 0x4;
    }
}
