import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atgg extends AtomicReferenceArray implements asks
{
    private static final Integer f;
    private static final long serialVersionUID = -1296597691183856449L;
    final int a;
    final AtomicLong b;
    long c;
    final AtomicLong d;
    final int e;
    
    static {
        f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    }
    
    public atgg(final int n) {
        super(aumt.q(n));
        this.a = this.length() - 1;
        this.b = new AtomicLong();
        this.d = new AtomicLong();
        this.e = Math.min(n / 4, atgg.f);
    }
    
    public final void c() {
        while (this.tw() != null || !this.i()) {}
    }
    
    public final boolean i() {
        return this.b.get() == this.d.get();
    }
    
    public final boolean j(final Object o) {
        if (o != null) {
            final int a = this.a;
            final long value = this.b.get();
            final int n = (int)value & a;
            if (value >= this.c) {
                final long c = this.e + value;
                if (this.get(a & (int)c) == null) {
                    this.c = c;
                }
                else if (this.get(n) != null) {
                    return false;
                }
            }
            this.lazySet(n, o);
            this.b.lazySet(value + 1L);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }
    
    @Override
    public final Object tw() {
        final long value = this.d.get();
        final int n = (int)value & this.a;
        final Object value2 = this.get(n);
        if (value2 == null) {
            return null;
        }
        this.d.lazySet(value + 1L);
        this.lazySet(n, null);
        return value2;
    }
}
