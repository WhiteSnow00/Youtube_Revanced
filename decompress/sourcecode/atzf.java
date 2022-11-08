import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atzf
{
    private static final atze a;
    private static final int b;
    private static final AtomicReference[] c;
    
    static {
        int i = 0;
        a = new atze(new byte[0], 0, 0, false);
        final int availableProcessors = Runtime.getRuntime().availableProcessors();
        final int n = b = Integer.highestOneBit(availableProcessors + availableProcessors - 1);
        final AtomicReference[] c2 = new AtomicReference[n];
        while (i < n) {
            c2[i] = new AtomicReference();
            ++i;
        }
        c = c2;
    }
    
    public static final atze a() {
        final AtomicReference c = c();
        final atze a = atzf.a;
        final atze atze = c.getAndSet(a);
        if (atze == a) {
            return new atze();
        }
        if (atze == null) {
            c.set(null);
            return new atze();
        }
        c.set(atze.f);
        atze.f = null;
        atze.c = 0;
        return atze;
    }
    
    public static final void b(final atze atze) {
        if (atze.f != null || atze.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (atze.d) {
            return;
        }
        final AtomicReference c = c();
        final atze a = atzf.a;
        final atze f = c.getAndSet(a);
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
        atze.f = f;
        atze.b = 0;
        atze.c = c2 + 8192;
        c.set(atze);
    }
    
    private static final AtomicReference c() {
        return atzf.c[(int)(Thread.currentThread().getId() & atzf.b - 1L)];
    }
}
