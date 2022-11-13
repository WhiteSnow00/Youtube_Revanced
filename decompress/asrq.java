import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asrq implements auke
{
    private final AtomicReference a;
    private final int b;
    
    public asrq(final AtomicReference a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void at(final aukf aukf) {
        final asrr asrr = new asrr(aukf);
        aukf.f((aukg)asrr);
        asrs b = null;
    Label_0018:
        while (true) {
            final asrs asrs = this.a.get();
            while (true) {
                Label_0042: {
                    if (asrs == null) {
                        break Label_0042;
                    }
                    b = asrs;
                    if (asrs.tA()) {
                        break Label_0042;
                    }
                    asrr[] array;
                    asrr[] array2;
                    do {
                        array = b.e.get();
                        if (array == asrs.b) {
                            continue Label_0018;
                        }
                        final int length = array.length;
                        array2 = new asrr[length + 1];
                        System.arraycopy(array, 0, array2, 0, length);
                        array2[length] = asrr;
                    } while (!asfn.C(b.e, array, array2));
                    break;
                }
                b = new asrs(this.a, this.b);
                final AtomicReference a = this.a;
                while (!a.compareAndSet(asrs, b)) {
                    if (a.get() != asrs) {
                        continue Label_0018;
                    }
                }
                continue;
            }
        }
        if (asrr.get() == Long.MIN_VALUE) {
            b.g(asrr);
        }
        else {
            asrr.b = b;
        }
        b.d();
    }
}
