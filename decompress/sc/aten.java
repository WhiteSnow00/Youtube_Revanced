import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aten extends asie implements asif
{
    static final atem[] a;
    static final atem[] b;
    final asih c;
    final AtomicInteger d;
    final AtomicReference e;
    Object f;
    Throwable g;
    
    static {
        a = new atem[0];
        b = new atem[0];
    }
    
    public aten(final asih c) {
        this.c = c;
        this.d = new AtomicInteger();
        this.e = new AtomicReference((V)(Object)aten.a);
    }
    
    protected final void af(final asif asif) {
        final atem atem = new atem(asif, this);
        asif.d((asir)atem);
        atem[] array;
        atem[] array2;
        do {
            array = this.e.get();
            if (array == aten.b) {
                final Throwable g = this.g;
                if (g != null) {
                    asif.b(g);
                    return;
                }
                asif.ts(this.f);
                return;
            }
            else {
                final int length = array.length;
                array2 = new atem[length + 1];
                System.arraycopy(array, 0, array2, 0, length);
                array2[length] = atem;
            }
        } while (!atyh.e(this.e, (Object)array, (Object)array2));
        if (atem.get()) {
            this.ag(atem);
        }
        if (this.d.getAndIncrement() == 0) {
            this.c.ae(this);
        }
    }
    
    final void ag(final atem atem) {
        atem[] array;
        atem[] a;
    Label_0098:
        do {
            array = this.e.get();
            final int length = array.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    while (i < length) {
                        if (array[i] == atem) {
                            if (i < 0) {
                                return;
                            }
                            if (length == 1) {
                                a = aten.a;
                                continue Label_0098;
                            }
                            a = new atem[length - 1];
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
        } while (!atyh.e(this.e, (Object)array, (Object)a));
    }
    
    public final void b(final Throwable g) {
        this.g = g;
        for (final atem atem : this.e.getAndSet(aten.b)) {
            if (!atem.get()) {
                atem.a.b(g);
            }
        }
    }
    
    public final void d(final asir asir) {
    }
    
    public final void ts(final Object f) {
        this.f = f;
        for (final atem atem : this.e.getAndSet(aten.b)) {
            if (!atem.get()) {
                atem.a.ts(f);
            }
        }
    }
}
