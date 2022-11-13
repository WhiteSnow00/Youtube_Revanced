import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asuj extends ashn implements asho
{
    static final asui[] a;
    static final asui[] b;
    final AtomicReference c;
    final AtomicReference d;
    Object e;
    Throwable f;
    
    static {
        a = new asui[0];
        b = new asui[0];
    }
    
    public asuj(final ashq ashq) {
        this.c = new AtomicReference((V)ashq);
        this.d = new AtomicReference((V)(Object)asuj.a);
    }
    
    protected final void ah(final asho asho) {
        final asui asui = new asui(asho, this);
        asho.d(asui);
        asui[] array;
        asui[] array2;
        do {
            array = this.d.get();
            if (array == asuj.b) {
                if (!asui.tA()) {
                    final Throwable f = this.f;
                    if (f != null) {
                        asho.b(f);
                        return;
                    }
                    final Object e = this.e;
                    if (e != null) {
                        asho.ts(e);
                        return;
                    }
                    asho.tx();
                }
                return;
            }
            final int length = array.length;
            array2 = new asui[length + 1];
            System.arraycopy(array, 0, array2, 0, length);
            array2[length] = asui;
        } while (!aqsy.w(this.d, array, array2));
        if (asui.tA()) {
            this.ai(asui);
            return;
        }
        final ashq ashq = this.c.getAndSet(null);
        if (ashq != null) {
            ashq.ag(this);
        }
    }
    
    final void ai(final asui asui) {
        asui[] array;
        asui[] a;
    Label_0098:
        do {
            array = this.d.get();
            final int length = array.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    while (i < length) {
                        if (array[i] == asui) {
                            if (i < 0) {
                                return;
                            }
                            if (length == 1) {
                                a = asuj.a;
                                continue Label_0098;
                            }
                            a = new asui[length - 1];
                            System.arraycopy(array, 0, a, 0, i);
                            System.arraycopy(array, i + 1, a, i, length - i - 1);
                            continue Label_0098;
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
        } while (!aqsy.w(this.d, array, a));
    }
    
    public final void b(final Throwable f) {
        this.f = f;
        for (final asui asui : this.d.getAndSet(asuj.b)) {
            if (!asui.tA()) {
                asui.a.b(f);
            }
        }
    }
    
    public final void d(final asir asir) {
    }
    
    public final void ts(final Object e) {
        this.e = e;
        for (final asui asui : this.d.getAndSet(asuj.b)) {
            if (!asui.tA()) {
                asui.a.ts(e);
            }
        }
    }
    
    public final void tx() {
        for (final asui asui : this.d.getAndSet(asuj.b)) {
            if (!asui.tA()) {
                asui.a.tx();
            }
        }
    }
}
