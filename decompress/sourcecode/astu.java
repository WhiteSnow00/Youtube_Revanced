import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class astu extends asgy implements asgz
{
    static final astt[] a;
    static final astt[] b;
    final AtomicReference c;
    final AtomicReference d;
    Object e;
    Throwable f;
    
    static {
        a = new astt[0];
        b = new astt[0];
    }
    
    public astu(final ashb ashb) {
        this.c = new AtomicReference((V)ashb);
        this.d = new AtomicReference((V)(Object)astu.a);
    }
    
    protected final void ah(final asgz asgz) {
        final astt astt = new astt(asgz, this);
        asgz.d((asic)astt);
        astt[] array;
        astt[] array2;
        do {
            array = this.d.get();
            if (array == astu.b) {
                if (!astt.tx()) {
                    final Throwable f = this.f;
                    if (f != null) {
                        asgz.b(f);
                        return;
                    }
                    final Object e = this.e;
                    if (e != null) {
                        asgz.tp(e);
                        return;
                    }
                    asgz.tu();
                }
                return;
            }
            final int length = array.length;
            array2 = new astt[length + 1];
            System.arraycopy(array, 0, array2, 0, length);
            array2[length] = astt;
        } while (!aume.m(this.d, (Object)array, (Object)array2));
        if (astt.tx()) {
            this.ai(astt);
            return;
        }
        final ashb ashb = this.c.getAndSet(null);
        if (ashb != null) {
            ashb.ag((asgz)this);
        }
    }
    
    final void ai(final astt astt) {
        astt[] array;
        astt[] a;
    Label_0103:
        do {
            array = this.d.get();
            final int length = array.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    while (i < length) {
                        final int n = i;
                        if (array[i] != astt) {
                            ++i;
                        }
                        else {
                            if (n < 0) {
                                return;
                            }
                            if (length == 1) {
                                a = astu.a;
                                continue Label_0103;
                            }
                            a = new astt[length - 1];
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
        } while (!aume.m(this.d, (Object)array, (Object)a));
    }
    
    public final void b(final Throwable f) {
        this.f = f;
        for (final astt astt : this.d.getAndSet(astu.b)) {
            if (!astt.tx()) {
                astt.a.b(f);
            }
        }
    }
    
    public final void d(final asic asic) {
    }
    
    public final void tp(final Object e) {
        this.e = e;
        for (final astt astt : this.d.getAndSet(astu.b)) {
            if (!astt.tx()) {
                astt.a.tp(e);
            }
        }
    }
    
    public final void tu() {
        for (final astt astt : this.d.getAndSet(astu.b)) {
            if (!astt.tx()) {
                astt.a.tu();
            }
        }
    }
}
