import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswg extends AtomicInteger implements asic
{
    private static final long serialVersionUID = -5556924161382950569L;
    final asgz a;
    final asjc b;
    final aswh[] c;
    final Object[] d;
    
    public aswg(final asgz a, final asjc b) {
        super(2);
        this.a = a;
        this.b = b;
        final aswh[] c = new aswh[2];
        for (int i = 0; i < 2; ++i) {
            c[i] = new aswh(this, i);
        }
        this.c = c;
        this.d = new Object[2];
    }
    
    final void a(final int n) {
        final aswh[] c = this.c;
        final int length = c.length;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= n) {
                break;
            }
            asjg.b(c[n2]);
            ++n2;
        }
        while (++n3 < 2) {
            asjg.b(c[n3]);
        }
    }
    
    final void b(final Throwable t, final int n) {
        if (this.getAndSet(0) > 0) {
            this.a(n);
            this.a.b(t);
            return;
        }
        aulo.r(t);
    }
    
    public final void dispose() {
        int i = 0;
        if (this.getAndSet(0) > 0) {
            final aswh[] c = this.c;
            final int length = c.length;
            while (i < 2) {
                asjg.b(c[i]);
                ++i;
            }
        }
    }
    
    public final boolean tx() {
        return this.get() <= 0;
    }
}
