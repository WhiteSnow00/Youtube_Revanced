import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atbk implements ashy, asir
{
    static final atbj[] a;
    static final atbj[] b;
    final AtomicReference c;
    final AtomicReference d;
    final AtomicBoolean e;
    final AtomicReference f;
    
    static {
        a = new atbj[0];
        b = new atbj[0];
    }
    
    public atbk(final AtomicReference c) {
        this.f = new AtomicReference();
        this.d = new AtomicReference((V)(Object)atbk.a);
        this.c = c;
        this.e = new AtomicBoolean();
    }
    
    @Override
    public final void b(final Throwable t) {
        atum.n(this.c, (Object)this, (Object)null);
        final atbj[] array = this.d.getAndSet(atbk.b);
        final int length = array.length;
        if (length != 0) {
            for (int i = 0; i < length; ++i) {
                array[i].a.b(t);
            }
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f(this.f, asir);
    }
    
    @Override
    public final void dispose() {
        final AtomicReference d = this.d;
        final atbj[] b = atbk.b;
        if (d.getAndSet(b) != b) {
            atum.n(this.c, (Object)this, (Object)null);
            asjv.b(this.f);
        }
    }
    
    final void f(final atbj atbj) {
        atbj[] array;
        atbj[] a;
    Label_0101:
        do {
            array = this.d.get();
            final int length = array.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    while (i < length) {
                        if (array[i].equals(atbj)) {
                            if (i < 0) {
                                return;
                            }
                            if (length == 1) {
                                a = atbk.a;
                                continue Label_0101;
                            }
                            a = new atbj[length - 1];
                            System.arraycopy(array, 0, a, 0, i);
                            System.arraycopy(array, i + 1, a, i, length - i - 1);
                            continue Label_0101;
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
        } while (!atum.n(this.d, (Object)array, (Object)a));
    }
    
    @Override
    public final boolean tA() {
        return this.d.get() == atbk.b;
    }
    
    @Override
    public final void tu(final Object o) {
        final atbj[] array = this.d.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].a.tu(o);
        }
    }
    
    @Override
    public final void tx() {
        atum.n(this.c, (Object)this, (Object)null);
        final atbj[] array = this.d.getAndSet(atbk.b);
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].a.tx();
        }
    }
}
