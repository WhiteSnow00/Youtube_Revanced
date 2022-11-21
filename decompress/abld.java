// 
// Decompiled by Procyon v0.6.0
// 

public final class abld
{
    public int a;
    public byte b;
    public int c;
    
    public final able a() {
        if (this.b == 1) {
            final int c = this.c;
            if (c != 0) {
                return new able(c, this.a);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" prefetchReason");
        }
        if (this.b == 0) {
            sb.append(" playbackBeginsInSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final int a) {
        this.a = a;
        this.b = 1;
    }
    
    public final qex c() {
        if (this.b == 1) {
            final int a = this.a;
            if (a != 0) {
                return new qex(a, this.c);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" enablement");
        }
        if (this.b == 0) {
            sb.append(" rateLimitPerSecond");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void d(final boolean b) {
        int a;
        if (!b) {
            a = 2;
        }
        else {
            a = 3;
        }
        this.a = a;
    }
}
