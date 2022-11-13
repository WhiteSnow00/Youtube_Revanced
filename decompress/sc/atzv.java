import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atzv
{
    private static final atzu a;
    private static final int b;
    private static final AtomicReference[] c;
    
    static {
        int i = 0;
        a = new atzu(new byte[0], 0, 0, false);
        final int availableProcessors = Runtime.getRuntime().availableProcessors();
        final int n = b = Integer.highestOneBit(availableProcessors + availableProcessors - 1);
        final AtomicReference[] c2 = new AtomicReference[n];
        while (i < n) {
            c2[i] = new AtomicReference();
            ++i;
        }
        c = c2;
    }
    
    public static final atzu a() {
        final AtomicReference c = c();
        final atzu a = atzv.a;
        final atzu atzu = c.getAndSet(a);
        if (atzu == a) {
            return new atzu();
        }
        if (atzu == null) {
            c.set(null);
            return new atzu();
        }
        c.set(atzu.f);
        atzu.f = null;
        atzu.c = 0;
        return atzu;
    }
    
    public static final void b(final atzu atzu) {
        if (atzu.f != null || atzu.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (atzu.d) {
            return;
        }
        final AtomicReference c = c();
        final atzu a = atzv.a;
        final atzu f = c.getAndSet(a);
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
        atzu.f = f;
        atzu.b = 0;
        atzu.c = c2 + 8192;
        c.set(atzu);
    }
    
    private static final AtomicReference c() {
        return atzv.c[(int)(Thread.currentThread().getId() & atzv.b - 1L)];
    }
}
