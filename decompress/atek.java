import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atek extends AtomicReference implements asku, asln
{
    static final atej[] a;
    static final atej[] b;
    private static final long serialVersionUID = -3251430252873581268L;
    final AtomicBoolean c;
    final AtomicReference d;
    final AtomicReference e;
    Throwable f;
    
    static {
        a = new atej[0];
        b = new atej[0];
    }
    
    public atek(final AtomicReference d) {
        this.c = new AtomicBoolean();
        this.d = d;
        this.e = new AtomicReference();
        this.lazySet(atek.a);
    }
    
    @Override
    public final void b(final Throwable f) {
        this.f = f;
        this.e.lazySet(asmr.a);
        final atej[] array = this.getAndSet(atek.b);
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].a.b(f);
        }
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this.e, asln);
    }
    
    @Override
    public final void dispose() {
        this.getAndSet(atek.b);
        final AtomicReference d = this.d;
        while (true) {
            while (!d.compareAndSet(this, null)) {
                if (d.get() != this) {
                    asmr.b(this.e);
                    return;
                }
            }
            continue;
        }
    }
    
    public final void f(final atej atej) {
        atej[] array;
        atej[] a;
    Label_0092:
        do {
            array = this.get();
            final int length = array.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    while (i < length) {
                        if (array[i] == atej) {
                            if (i < 0) {
                                return;
                            }
                            a = atek.a;
                            if (length != 1) {
                                a = new atej[length - 1];
                                System.arraycopy(array, 0, a, 0, i);
                                System.arraycopy(array, i + 1, a, i, length - i - 1);
                                continue Label_0092;
                            }
                            continue Label_0092;
                        }
                        else {
                            ++i;
                        }
                    }
                    i = -1;
                    continue;
                }
            }
            break;
        } while (!this.compareAndSet(array, a));
    }
    
    @Override
    public final void tt(final Object o) {
        final atej[] array = this.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].a.tt(o);
        }
    }
    
    @Override
    public final void tw() {
        this.e.lazySet(asmr.a);
        final atej[] array = this.getAndSet(atek.b);
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].a.tw();
        }
    }
    
    @Override
    public final boolean tz() {
        return this.get() == atek.b;
    }
}
