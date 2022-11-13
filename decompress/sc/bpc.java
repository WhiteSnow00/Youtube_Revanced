import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpc extends azm
{
    private static final Object b;
    private final long c;
    private final long d;
    private final boolean e;
    private final boolean f;
    private final ayu g;
    private final ayp h;
    
    static {
        b = new Object();
        final ayj ayj = new ayj();
        ayj.c("SinglePeriodTimeline");
        ayj.a = Uri.EMPTY;
        ayj.a();
    }
    
    public bpc(final long n, final boolean e, final boolean f, final boolean b, final ayu g) {
        ayp c;
        if (b) {
            c = g.c;
        }
        else {
            c = null;
        }
        this.c = n;
        this.d = n;
        this.e = e;
        this.f = f;
        dk.d((Object)g);
        this.g = g;
        this.h = c;
    }
    
    public final int a(final Object o) {
        if (bpc.b.equals(o)) {
            return 0;
        }
        return -1;
    }
    
    public final int b() {
        return 1;
    }
    
    public final int c() {
        return 1;
    }
    
    public final azk d(final int n, final azk azk, final boolean b) {
        dk.j(n, 1);
        Object b2;
        if (b) {
            b2 = bpc.b;
        }
        else {
            b2 = null;
        }
        azk.g((Object)null, b2, this.c, 0L);
        return azk;
    }
    
    public final azl e(final int n, final azl azl, long n2) {
        dk.j(n, 1);
        if (this.f && n2 != 0L) {
            final long d = this.d;
            if (d == -9223372036854775807L || n2 > d) {
                n2 = -9223372036854775807L;
            }
        }
        else {
            n2 = 0L;
        }
        azl.e(azl.a, this.g, (Object)null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.e, this.f, this.h, n2, this.d, 0, 0L);
        return azl;
    }
    
    public final Object f(final int n) {
        dk.j(n, 1);
        return bpc.b;
    }
}
