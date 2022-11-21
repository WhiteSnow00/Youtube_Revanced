import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asve implements aumz
{
    private final AtomicReference a;
    private final Callable b;
    
    public asve(final AtomicReference a, final Callable b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void at(final auna auna) {
        asvf asvf = null;
    Label_0000:
        while ((asvf = this.a.get()) == null) {
            try {
                final asvf asvf2 = new asvf((asva)this.b.call());
                final AtomicReference a = this.a;
                while (!a.compareAndSet(null, asvf2)) {
                    if (a.get() != null) {
                        continue Label_0000;
                    }
                }
            }
            finally {
                asjv.a((Throwable)asvf);
                atkt.f((Throwable)asvf, auna);
                return;
            }
            break;
        }
        final asvb asvb = new asvb(asvf, auna);
        auna.f(asvb);
        asvb[] array;
        asvb[] array2;
        do {
            array = asvf.d.get();
            if (array == asvf.b) {
                break;
            }
            final int length = array.length;
            array2 = new asvb[length + 1];
            System.arraycopy(array, 0, array2, 0, length);
            array2[length] = asvb;
        } while (!aqvq.x(asvf.d, (Object)array, (Object)array2));
        if (asvb.tz()) {
            asvf.g(asvb);
            return;
        }
        asvf.d();
        asvf.i.b(asvb);
    }
}
