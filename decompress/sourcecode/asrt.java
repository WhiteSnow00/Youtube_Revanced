import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asrt implements aujo
{
    private final AtomicReference a;
    private final Callable b;
    
    public asrt(final AtomicReference a, final Callable b) {
        this.a = a;
        this.b = b;
    }
    
    public final void as(final aujp aujp) {
        asru asru = null;
    Label_0000:
        while ((asru = this.a.get()) == null) {
            try {
                final asru asru2 = new asru((asrp)this.b.call());
                final AtomicReference a = this.a;
                while (!a.compareAndSet(null, asru2)) {
                    if (a.get() != null) {
                        continue Label_0000;
                    }
                }
            }
            finally {
                asey.d((Throwable)asru);
                athe.f((Throwable)asru, aujp);
                return;
            }
            break;
        }
        final asrq asrq = new asrq(asru, aujp);
        aujp.f((aujq)asrq);
        asrq[] array;
        asrq[] array2;
        do {
            array = asru.d.get();
            if (array == asru.b) {
                break;
            }
            final int length = array.length;
            array2 = new asrq[length + 1];
            System.arraycopy(array, 0, array2, 0, length);
            array2[length] = asrq;
        } while (!aujh.o(asru.d, (Object)array, (Object)array2));
        if (asrq.tx()) {
            asru.g(asrq);
            return;
        }
        asru.d();
        asru.i.b(asrq);
    }
}
