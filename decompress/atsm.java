import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atsm
{
    @Deprecated
    private static final AtomicReferenceFieldUpdater b;
    public volatile Object a;
    private final aupp c;
    
    static {
        b = AtomicReferenceFieldUpdater.newUpdater(atsm.class, Object.class, "a");
    }
    
    public atsm(final Object a, final aupp c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
    }
    
    public final Object a(final Object o) {
        final Object andSet = atsm.b.getAndSet(this, o);
        if (this.c != atsn.a) {
            final StringBuilder sb = new StringBuilder("getAndSet(");
            sb.append(o);
            sb.append("):");
            sb.append(andSet);
        }
        return andSet;
    }
    
    public final void b(final Object o) {
        atsm.b.lazySet(this, o);
        if (this.c != atsn.a) {
            new StringBuilder("lazySet(").append(o);
        }
    }
    
    public final void c(final Object a) {
        this.a = a;
        if (this.c != atsn.a) {
            new StringBuilder("set(").append(a);
        }
    }
    
    public final boolean d(final Object o, final Object o2) {
        final AtomicReferenceFieldUpdater b = atsm.b;
        while (true) {
            while (!b.compareAndSet(this, o, o2)) {
                if (b.get(this) != o) {
                    final boolean b2 = false;
                    if (b2 && this.c != atsn.a) {
                        final StringBuilder sb = new StringBuilder("CAS(");
                        sb.append(o);
                        sb.append(", ");
                        sb.append(o2);
                        return true;
                    }
                    return b2;
                }
            }
            final boolean b2 = true;
            continue;
        }
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.a);
    }
}
