import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asrb implements aujo
{
    private final AtomicReference a;
    private final int b;
    
    public asrb(final AtomicReference a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void as(final aujp aujp) {
        final asrc asrc = new asrc(aujp);
        aujp.f((aujq)asrc);
        asrd b = null;
    Label_0016:
        while (true) {
            final asrd asrd = this.a.get();
            while (true) {
                Label_0040: {
                    if (asrd == null) {
                        break Label_0040;
                    }
                    b = asrd;
                    if (asrd.tx()) {
                        break Label_0040;
                    }
                    asrc[] array;
                    asrc[] array2;
                    do {
                        array = b.e.get();
                        if (array == asrd.b) {
                            continue Label_0016;
                        }
                        final int length = array.length;
                        array2 = new asrc[length + 1];
                        System.arraycopy(array, 0, array2, 0, length);
                        array2[length] = asrc;
                    } while (!atnp.o(b.e, array, array2));
                    break;
                }
                b = new asrd(this.a, this.b);
                final AtomicReference a = this.a;
                while (!a.compareAndSet(asrd, b)) {
                    if (a.get() != asrd) {
                        continue Label_0016;
                    }
                }
                continue;
            }
        }
        if (asrc.get() == Long.MIN_VALUE) {
            b.g(asrc);
        }
        else {
            asrc.b = b;
        }
        b.d();
    }
}
