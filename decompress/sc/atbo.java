import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atbo extends AtomicReference implements ashy, asir
{
    static final atbn[] a;
    static final atbn[] b;
    private static final long serialVersionUID = -3251430252873581268L;
    final AtomicBoolean c;
    final AtomicReference d;
    final AtomicReference e;
    Throwable f;
    
    static {
        a = new atbn[0];
        b = new atbn[0];
    }
    
    public atbo(final AtomicReference d) {
        this.c = new AtomicBoolean();
        this.d = d;
        this.e = new AtomicReference();
        this.lazySet(atbo.a);
    }
    
    @Override
    public final void b(final Throwable f) {
        this.f = f;
        this.e.lazySet(asjv.a);
        final atbn[] array = this.getAndSet(atbo.b);
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].a.b(f);
        }
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f(this.e, asir);
    }
    
    @Override
    public final void dispose() {
        this.getAndSet(atbo.b);
        final AtomicReference d = this.d;
        while (true) {
            while (!d.compareAndSet(this, null)) {
                if (d.get() != this) {
                    asjv.b(this.e);
                    return;
                }
            }
            continue;
        }
    }
    
    public final void f(final atbn atbn) {
        atbn[] array;
        atbn[] a;
    Label_0092:
        do {
            array = this.get();
            final int length = array.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    while (i < length) {
                        if (array[i] == atbn) {
                            if (i < 0) {
                                return;
                            }
                            a = atbo.a;
                            if (length != 1) {
                                a = new atbn[length - 1];
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
    public final boolean tA() {
        return this.get() == atbo.b;
    }
    
    @Override
    public final void tu(final Object o) {
        final atbn[] array = this.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].a.tu(o);
        }
    }
    
    @Override
    public final void tx() {
        this.e.lazySet(asjv.a);
        final atbn[] array = this.getAndSet(atbo.b);
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].a.tx();
        }
    }
}
