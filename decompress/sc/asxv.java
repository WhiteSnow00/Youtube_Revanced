import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxv implements asir
{
    final ashy a;
    final asxw[] b;
    final AtomicInteger c;
    
    public asxv(final ashy a) {
        this.c = new AtomicInteger();
        this.a = a;
        this.b = new asxw[2];
    }
    
    public final boolean a(final int n) {
        final int value = this.c.get();
        int i = 0;
        if (value != 0) {
            return value == n;
        }
        if (this.c.compareAndSet(0, n)) {
            final asxw[] b = this.b;
            while (i < 2) {
                final int n2 = i + 1;
                if (n2 != n) {
                    asjv.b((AtomicReference)b[i]);
                }
                i = n2;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final void dispose() {
        if (this.c.get() != -1) {
            this.c.lazySet(-1);
            final asxw[] b = this.b;
            for (int i = 0; i < 2; ++i) {
                asjv.b((AtomicReference)b[i]);
            }
        }
    }
    
    @Override
    public final boolean tA() {
        return this.c.get() == -1;
    }
}
