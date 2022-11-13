import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class assi implements auke
{
    private final AtomicReference a;
    private final Callable b;
    
    public assi(final AtomicReference a, final Callable b) {
        this.a = a;
        this.b = b;
    }
    
    public final void at(final aukf aukf) {
        assj assj = null;
    Label_0000:
        while ((assj = this.a.get()) == null) {
            try {
                final assj assj2 = new assj((asse)this.b.call());
                final AtomicReference a = this.a;
                while (!a.compareAndSet(null, assj2)) {
                    if (a.get() != null) {
                        continue Label_0000;
                    }
                }
            }
            finally {
                asgz.c((Throwable)assj);
                athw.f((Throwable)assj, aukf);
                return;
            }
            break;
        }
        final assf assf = new assf(assj, aukf);
        aukf.f((aukg)assf);
        assf[] array;
        assf[] array2;
        do {
            array = assj.d.get();
            if (array == assj.b) {
                break;
            }
            final int length = array.length;
            array2 = new assf[length + 1];
            System.arraycopy(array, 0, array2, 0, length);
            array2[length] = assf;
        } while (!aqsx.w(assj.d, array, array2));
        if (assf.tA()) {
            assj.g(assf);
            return;
        }
        assj.d();
        assj.i.b(assf);
    }
}
