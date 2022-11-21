import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class aszr extends AtomicInteger implements asln
{
    private static final long serialVersionUID = -5556924161382950569L;
    final askk a;
    final asmn b;
    final aszs[] c;
    final Object[] d;
    
    public aszr(final askk a, final asmn b) {
        super(2);
        this.a = a;
        this.b = b;
        final aszs[] c = new aszs[2];
        for (int i = 0; i < 2; ++i) {
            c[i] = new aszs(this, i);
        }
        this.c = c;
        this.d = new Object[2];
    }
    
    final void a(final int n) {
        final aszs[] c = this.c;
        final int length = c.length;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= n) {
                break;
            }
            asmr.b(c[n2]);
            ++n2;
        }
        while (++n3 < 2) {
            asmr.b(c[n3]);
        }
    }
    
    final void b(final Throwable t, final int n) {
        if (this.getAndSet(0) > 0) {
            this.a(n);
            this.a.b(t);
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void dispose() {
        int i = 0;
        if (this.getAndSet(0) > 0) {
            final aszs[] c = this.c;
            final int length = c.length;
            while (i < 2) {
                asmr.b(c[i]);
                ++i;
            }
        }
    }
    
    @Override
    public final boolean tz() {
        return this.get() <= 0;
    }
}
