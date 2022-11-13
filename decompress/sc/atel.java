import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atel extends asie
{
    private final asih[] a;
    private final Iterable b;
    
    public atel(final asih[] a, final Iterable b) {
        this.a = a;
        this.b = b;
    }
    
    protected final void af(final asif asif) {
        asih[] a = this.a;
        int n2 = 0;
        Label_0146: {
            if (a == null) {
                asih[] array = new asih[8];
                try {
                    final Iterator iterator = this.b.iterator();
                    int n = 0;
                    while (true) {
                        a = array;
                        n2 = n;
                        if (!iterator.hasNext()) {
                            break Label_0146;
                        }
                        final asih asih = (asih)iterator.next();
                        if (asih == null) {
                            break;
                        }
                        a = array;
                        if (n == array.length) {
                            a = new asih[(n >> 2) + n];
                            System.arraycopy(array, 0, a, 0, n);
                        }
                        a[n] = asih;
                        ++n;
                        array = a;
                    }
                    asjw.h((Throwable)new NullPointerException("One of the sources is null"), asif);
                    return;
                }
                finally {
                    final Throwable t;
                    asgz.c(t);
                    asjw.h(t, asif);
                    return;
                }
            }
            n2 = 2;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final asiq asiq = new asiq();
        asif.d((asir)asiq);
        int i = 0;
        while (i < n2) {
            final asih asih2 = a[i];
            if (asiq.b) {
                return;
            }
            if (asih2 == null) {
                asiq.dispose();
                final NullPointerException ex = new NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    asif.b(ex);
                    return;
                }
                atqx.j((Throwable)ex);
            }
            else {
                asih2.ae((asif)new atek(asif, asiq, atomicBoolean));
                ++i;
            }
        }
    }
}
