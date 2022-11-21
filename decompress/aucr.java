import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aucr
{
    private static final aucq a;
    private static final int b;
    private static final AtomicReference[] c;
    
    static {
        int i = 0;
        a = new aucq(new byte[0], 0, 0, false);
        final int availableProcessors = Runtime.getRuntime().availableProcessors();
        final int n = b = Integer.highestOneBit(availableProcessors + availableProcessors - 1);
        final AtomicReference[] c2 = new AtomicReference[n];
        while (i < n) {
            c2[i] = new AtomicReference();
            ++i;
        }
        c = c2;
    }
    
    public static final aucq a() {
        final AtomicReference c = c();
        final aucq a = aucr.a;
        final aucq aucq = c.getAndSet(a);
        if (aucq == a) {
            return new aucq();
        }
        if (aucq == null) {
            c.set(null);
            return new aucq();
        }
        c.set(aucq.f);
        aucq.f = null;
        aucq.c = 0;
        return aucq;
    }
    
    public static final void b(final aucq aucq) {
        if (aucq.f != null || aucq.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (aucq.d) {
            return;
        }
        final AtomicReference c = c();
        final aucq a = aucr.a;
        final aucq f = c.getAndSet(a);
        if (f == a) {
            return;
        }
        int c2;
        if (f != null) {
            c2 = f.c;
        }
        else {
            c2 = 0;
        }
        if (c2 >= 65536) {
            c.set(f);
            return;
        }
        aucq.f = f;
        aucq.b = 0;
        aucq.c = c2 + 8192;
        c.set(aucq);
    }
    
    private static final AtomicReference c() {
        return aucr.c[(int)(Thread.currentThread().getId() & aucr.b - 1L)];
    }
}
