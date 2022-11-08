import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpb extends azl
{
    private static final Object b;
    private final long c;
    private final long d;
    private final boolean e;
    private final boolean f;
    private final ayt g;
    private final ayo h;
    
    static {
        b = new Object();
        final ayi ayi = new ayi();
        ayi.c("SinglePeriodTimeline");
        ayi.a = Uri.EMPTY;
        ayi.a();
    }
    
    public bpb(final long n, final boolean e, final boolean f, final boolean b, final ayt g) {
        ayo c;
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
        if (bpb.b.equals(o)) {
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
    
    public final azj d(final int n, final azj azj, final boolean b) {
        dk.j(n, 1);
        Object b2;
        if (b) {
            b2 = bpb.b;
        }
        else {
            b2 = null;
        }
        azj.g((Object)null, b2, this.c, 0L);
        return azj;
    }
    
    public final azk e(final int n, final azk azk, long n2) {
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
        azk.e(azk.a, this.g, (Object)null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.e, this.f, this.h, n2, this.d, 0, 0L);
        return azk;
    }
    
    public final Object f(final int n) {
        dk.j(n, 1);
        return bpb.b;
    }
}
