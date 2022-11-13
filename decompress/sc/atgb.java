import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atgb extends AtomicInteger implements asir
{
    private static final long serialVersionUID = -5556924161382950569L;
    final asif a;
    final asjr b;
    final atgc[] c;
    final Object[] d;
    
    public atgb(final asif a, final asjr b) {
        super(2);
        this.a = a;
        this.b = b;
        final atgc[] c = new atgc[2];
        for (int i = 0; i < 2; ++i) {
            c[i] = new atgc(this, i);
        }
        this.c = c;
        this.d = new Object[2];
    }
    
    final void a(final Throwable t, final int n) {
        int n2 = 0;
        if (this.getAndSet(0) > 0) {
            final atgc[] c = this.c;
            final int length = c.length;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= n) {
                    break;
                }
                asjv.b(c[n2]);
                ++n2;
            }
            while (++n3 < 2) {
                asjv.b(c[n3]);
            }
            this.a.b(t);
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void dispose() {
        int i = 0;
        if (this.getAndSet(0) > 0) {
            final atgc[] c = this.c;
            final int length = c.length;
            while (i < 2) {
                asjv.b(c[i]);
                ++i;
            }
        }
    }
    
    @Override
    public final boolean tA() {
        return this.get() <= 0;
    }
}
