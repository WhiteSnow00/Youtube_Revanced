import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atdv extends ashp implements ashq
{
    static final atdu[] a;
    static final atdu[] b;
    final ashs c;
    final AtomicInteger d;
    final AtomicReference e;
    Object f;
    Throwable g;
    
    static {
        a = new atdu[0];
        b = new atdu[0];
    }
    
    public atdv(final ashs c) {
        this.c = c;
        this.d = new AtomicInteger();
        this.e = new AtomicReference((V)(Object)atdv.a);
    }
    
    protected final void ae(final ashq ashq) {
        final atdu atdu = new atdu(ashq, this);
        ashq.d((asic)atdu);
        atdu[] array;
        atdu[] array2;
        do {
            array = this.e.get();
            if (array == atdv.b) {
                final Throwable g = this.g;
                if (g != null) {
                    ashq.b(g);
                    return;
                }
                ashq.tp(this.f);
                return;
            }
            else {
                final int length = array.length;
                array2 = new atdu[length + 1];
                System.arraycopy(array, 0, array2, 0, length);
                array2[length] = atdu;
            }
        } while (!atvl.i(this.e, (Object)array, (Object)array2));
        if (atdu.get()) {
            this.af(atdu);
        }
        if (this.d.getAndIncrement() == 0) {
            this.c.ad((ashq)this);
        }
    }
    
    final void af(final atdu atdu) {
        atdu[] array;
        atdu[] a;
    Label_0103:
        do {
            array = this.e.get();
            final int length = array.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    while (i < length) {
                        final int n = i;
                        if (array[i] != atdu) {
                            ++i;
                        }
                        else {
                            if (n < 0) {
                                return;
                            }
                            if (length == 1) {
                                a = atdv.a;
                                continue Label_0103;
                            }
                            a = new atdu[length - 1];
                            System.arraycopy(array, 0, a, 0, n);
                            System.arraycopy(array, n + 1, a, n, length - n - 1);
                            continue Label_0103;
                        }
                    }
                    final int n = -1;
                    continue;
                }
            }
            break;
        } while (!atvl.i(this.e, (Object)array, (Object)a));
    }
    
    public final void b(final Throwable g) {
        this.g = g;
        for (final atdu atdu : this.e.getAndSet(atdv.b)) {
            if (!atdu.get()) {
                atdu.a.b(g);
            }
        }
    }
    
    public final void d(final asic asic) {
    }
    
    public final void tp(final Object f) {
        this.f = f;
        for (final atdu atdu : this.e.getAndSet(atdv.b)) {
            if (!atdu.get()) {
                atdu.a.tp(f);
            }
        }
    }
}
