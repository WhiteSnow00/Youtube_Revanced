import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asdw
{
    final int a;
    final int b;
    final int c;
    final AtomicInteger d;
    
    public asdw(final float n, final float n2) {
        final AtomicInteger d = new AtomicInteger();
        this.d = d;
        this.c = (int)(n2 * 1000.0f);
        final int a = (int)(n * 1000.0f);
        this.a = a;
        this.b = a / 2;
        d.set(a);
    }
    
    final boolean a() {
        return this.d.get() > this.b;
    }
    
    final boolean b() {
        int value;
        int n;
        do {
            value = this.d.get();
            if (value == 0) {
                return false;
            }
            n = value - 1000;
        } while (!this.d.compareAndSet(value, Math.max(n, 0)));
        return n > this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof asdw)) {
            return false;
        }
        final asdw asdw = (asdw)o;
        return this.a == asdw.a && this.c == asdw.c;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.c });
    }
}
