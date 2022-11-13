import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atcb extends AtomicReference implements ashy, asir
{
    static final atby[] a;
    static final atby[] b;
    private static final long serialVersionUID = -533785617179540163L;
    final atca c;
    boolean d;
    final AtomicReference e;
    final AtomicBoolean f;
    
    static {
        a = new atby[0];
        b = new atby[0];
    }
    
    public atcb(final atca c) {
        this.c = c;
        this.e = new AtomicReference((V)(Object)atcb.a);
        this.f = new AtomicBoolean();
    }
    
    @Override
    public final void b(final Throwable t) {
        if (!this.d) {
            this.d = true;
            this.c.c(t);
            this.h();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        if (asjv.f(this, asir)) {
            this.g();
        }
    }
    
    @Override
    public final void dispose() {
        this.e.set(atcb.b);
        asjv.b(this);
    }
    
    final void f(final atby atby) {
        atby[] array;
        atby[] a;
    Label_0101:
        do {
            array = this.e.get();
            final int length = array.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    while (i < length) {
                        if (array[i].equals(atby)) {
                            if (i < 0) {
                                return;
                            }
                            if (length == 1) {
                                a = atcb.a;
                                continue Label_0101;
                            }
                            a = new atby[length - 1];
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
        } while (!atwm.f(this.e, (Object)array, (Object)a));
    }
    
    final void g() {
        final atby[] array = this.e.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            this.c.e(array[i]);
        }
    }
    
    final void h() {
        final atby[] array = this.e.getAndSet(atcb.b);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.c.e(array[i]);
        }
    }
    
    @Override
    public final boolean tA() {
        return this.e.get() == atcb.b;
    }
    
    @Override
    public final void tu(final Object o) {
        if (!this.d) {
            this.c.d(o);
            this.g();
        }
    }
    
    @Override
    public final void tx() {
        if (!this.d) {
            this.d = true;
            this.c.b();
            this.h();
        }
    }
}
