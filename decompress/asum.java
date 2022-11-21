import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asum implements aumz
{
    private final AtomicReference a;
    private final int b;
    
    public asum(final AtomicReference a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void at(final auna auna) {
        final asun asun = new asun(auna);
        auna.f(asun);
        asuo b = null;
    Label_0018:
        while (true) {
            final asuo asuo = this.a.get();
            while (true) {
                Label_0042: {
                    if (asuo == null) {
                        break Label_0042;
                    }
                    b = asuo;
                    if (asuo.tz()) {
                        break Label_0042;
                    }
                    asun[] array;
                    asun[] array2;
                    do {
                        array = b.e.get();
                        if (array == asuo.b) {
                            continue Label_0018;
                        }
                        final int length = array.length;
                        array2 = new asun[length + 1];
                        System.arraycopy(array, 0, array2, 0, length);
                        array2[length] = asun;
                    } while (!aupp.r(b.e, (Object)array, (Object)array2));
                    break;
                }
                b = new asuo(this.a, this.b);
                final AtomicReference a = this.a;
                while (!a.compareAndSet(asuo, b)) {
                    if (a.get() != asuo) {
                        continue Label_0018;
                    }
                }
                continue;
            }
        }
        if (asun.get() == Long.MIN_VALUE) {
            b.g(asun);
        }
        else {
            asun.b = b;
        }
        b.d();
    }
}
