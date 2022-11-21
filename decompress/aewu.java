import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class aewu extends AtomicInteger
{
    public static final aewq a;
    public final aewu b;
    public final String c;
    public volatile aewr currentMetadata;
    public final long d;
    public final aevb e;
    public int f;
    public aewu g;
    public boolean h;
    public volatile long i;
    int j;
    
    static {
        aewq a2;
        try {
            a2 = new aews();
        }
        catch (final RuntimeException | Error runtimeException | Error) {
            a2 = new aewt();
        }
        a = a2;
    }
    
    public aewu(final aewu aewu, final String c, final long d, final aevb e) {
        this.j = 2;
        this.h = false;
        this.i = 0L;
        aewu b = aewu;
        if (aewu.f < 0) {
            b = aewu.b;
        }
        this.b = b;
        this.c = c;
        this.f = -1;
        this.d = d;
        this.e = e;
    }
    
    public aewu(final String c, final aevb e, final int n) {
        this.j = 2;
        this.h = false;
        long i = 0L;
        this.i = 0L;
        this.b = null;
        this.c = c;
        this.f = 0;
        this.d = 0L;
        this.e = e;
        if (n != 2) {
            i = Long.MIN_VALUE;
        }
        this.i = i;
    }
    
    final int a() {
        final aewu b = this.b;
        if (b == null) {
            return -1;
        }
        return b.f;
    }
    
    final void b(final int f, final aewu g) {
        this.f = f;
        this.g = g;
    }
    
    final boolean c() {
        return this.i != 0L;
    }
}
