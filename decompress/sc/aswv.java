import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswv extends AtomicInteger implements asir
{
    private static final long serialVersionUID = -5556924161382950569L;
    final asho a;
    final asjr b;
    final asww[] c;
    final Object[] d;
    
    public aswv(final asho a, final asjr b) {
        super(2);
        this.a = a;
        this.b = b;
        final asww[] c = new asww[2];
        for (int i = 0; i < 2; ++i) {
            c[i] = new asww(this, i);
        }
        this.c = c;
        this.d = new Object[2];
    }
    
    final void a(final int n) {
        final asww[] c = this.c;
        final int length = c.length;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= n) {
                break;
            }
            asjv.b((AtomicReference)c[n2]);
            ++n2;
        }
        while (++n3 < 2) {
            asjv.b((AtomicReference)c[n3]);
        }
    }
    
    final void b(final Throwable t, final int n) {
        if (this.getAndSet(0) > 0) {
            this.a(n);
            this.a.b(t);
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void dispose() {
        int i = 0;
        if (this.getAndSet(0) > 0) {
            final asww[] c = this.c;
            final int length = c.length;
            while (i < 2) {
                asjv.b((AtomicReference)c[i]);
                ++i;
            }
        }
    }
    
    @Override
    public final boolean tA() {
        return this.get() <= 0;
    }
}
