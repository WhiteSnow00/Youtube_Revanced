import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

final class asgt extends asgu
{
    private static final AtomicIntegerFieldUpdater a;
    private final List b;
    private volatile int c;
    
    static {
        a = AtomicIntegerFieldUpdater.newUpdater(asgt.class, "c");
    }
    
    public asgt(final List b, final int n) {
        adkp.I(b.isEmpty() ^ true, (Object)"empty list");
        this.b = b;
        this.c = n - 1;
    }
    
    public final arvo a() {
        final int size = this.b.size();
        final AtomicIntegerFieldUpdater a = asgt.a;
        int incrementAndGet;
        final int n = incrementAndGet = a.incrementAndGet(this);
        if (n >= size) {
            incrementAndGet = n % size;
            a.compareAndSet(this, n, incrementAndGet);
        }
        return arvo.c((arvr)this.b.get(incrementAndGet));
    }
    
    @Override
    public final boolean b(final asgu asgu) {
        final boolean b = asgu instanceof asgt;
        boolean b2 = false;
        if (!b) {
            return false;
        }
        final asgt asgt = (asgt)asgu;
        if (asgt != this) {
            if (this.b.size() != asgt.b.size()) {
                return b2;
            }
            if (!new HashSet(this.b).containsAll(asgt.b)) {
                return false;
            }
        }
        b2 = true;
        return b2;
    }
    
    public final String toString() {
        final aezo aa = adkp.aa((Class)asgt.class);
        aa.b("list", (Object)this.b);
        return aa.toString();
    }
}
