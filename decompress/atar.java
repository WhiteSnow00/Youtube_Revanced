import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atar implements asln
{
    final asku a;
    final atas[] b;
    final AtomicInteger c;
    
    public atar(final asku a) {
        this.c = new AtomicInteger();
        this.a = a;
        this.b = new atas[2];
    }
    
    public final boolean a(final int n) {
        final int value = this.c.get();
        int i = 0;
        if (value != 0) {
            return value == n;
        }
        if (this.c.compareAndSet(0, n)) {
            final atas[] b = this.b;
            while (i < 2) {
                final int n2 = i + 1;
                if (n2 != n) {
                    asmr.b(b[i]);
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
            final atas[] b = this.b;
            for (int i = 0; i < 2; ++i) {
                asmr.b(b[i]);
            }
        }
    }
    
    @Override
    public final boolean tz() {
        return this.c.get() == -1;
    }
}
