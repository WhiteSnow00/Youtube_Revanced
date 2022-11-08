import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atdt extends ashp
{
    private final ashs[] a;
    private final Iterable b;
    
    public atdt(final ashs[] a, final Iterable b) {
        this.a = a;
        this.b = b;
    }
    
    protected final void ae(final ashq ashq) {
        ashs[] a = this.a;
        int n2 = 0;
        Label_0135: {
            if (a == null) {
                ashs[] array = new ashs[8];
                try {
                    final Iterator iterator = this.b.iterator();
                    int n = 0;
                    while (true) {
                        a = array;
                        n2 = n;
                        if (!iterator.hasNext()) {
                            break Label_0135;
                        }
                        final ashs ashs = (ashs)iterator.next();
                        if (ashs == null) {
                            break;
                        }
                        a = array;
                        if (n == array.length) {
                            a = new ashs[(n >> 2) + n];
                            System.arraycopy(array, 0, a, 0, n);
                        }
                        a[n] = ashs;
                        ++n;
                        array = a;
                    }
                    asjh.h((Throwable)new NullPointerException("One of the sources is null"), ashq);
                    return;
                }
                finally {
                    final Throwable t;
                    asey.d(t);
                    asjh.h(t, ashq);
                    return;
                }
            }
            n2 = 2;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final asib asib = new asib();
        ashq.d((asic)asib);
        int i = 0;
        while (i < n2) {
            final ashs ashs2 = a[i];
            if (asib.b) {
                return;
            }
            if (ashs2 == null) {
                asib.dispose();
                final NullPointerException ex = new NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    ashq.b((Throwable)ex);
                    return;
                }
                aulo.r((Throwable)ex);
            }
            else {
                ashs2.ad((ashq)new atds(ashq, asib, atomicBoolean));
                ++i;
            }
        }
    }
}
