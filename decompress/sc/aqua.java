import com.google.research.aimatter.drishti.DrishtiCache;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqua
{
    public Object a;
    private long b;
    private byte c;
    
    public final aqub a() {
        if (this.c == 1) {
            return new aqub(this.b, (DrishtiCache)this.a);
        }
        throw new IllegalStateException("Missing required properties: parentGlContextHandle");
    }
    
    public final void b(final long b) {
        this.b = b;
        this.c = 1;
    }
    
    public final abjy c() {
        if (this.c == 3) {
            final Object a = this.a;
            if (a != null) {
                return new abjy(this.b, (abjx)a);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if ((this.c & 0x1) == 0x0) {
            sb.append(" mediaDurationMs");
        }
        if ((this.c & 0x2) == 0x0) {
            sb.append(" enableAutoMediaDuration");
        }
        if (this.a == null) {
            sb.append(" prefetchPlaybackContextWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void d() {
        this.c |= 0x2;
    }
    
    public final void e(final long b) {
        this.b = b;
        this.c |= 0x1;
    }
    
    public final void f(final abjx a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null prefetchPlaybackContextWrapper");
    }
    
    public final pms g() {
        if (this.c == 1) {
            return new pms((Long)this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: startTime");
    }
    
    public final void h(final long b) {
        this.b = b;
        this.c = 1;
    }
}
