import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atex extends AtomicReference implements asku, asln
{
    static final ateu[] a;
    static final ateu[] b;
    private static final long serialVersionUID = -533785617179540163L;
    final atew c;
    boolean d;
    final AtomicReference e;
    final AtomicBoolean f;
    
    static {
        a = new ateu[0];
        b = new ateu[0];
    }
    
    public atex(final atew c) {
        this.c = c;
        this.e = new AtomicReference((V)(Object)atex.a);
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
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln asln) {
        if (asmr.f(this, asln)) {
            this.g();
        }
    }
    
    @Override
    public final void dispose() {
        this.e.set(atex.b);
        asmr.b(this);
    }
    
    final void f(final ateu ateu) {
        ateu[] array;
        ateu[] a;
    Label_0101:
        do {
            array = this.e.get();
            final int length = array.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    while (i < length) {
                        if (array[i].equals(ateu)) {
                            if (i < 0) {
                                return;
                            }
                            if (length == 1) {
                                a = atex.a;
                                continue Label_0101;
                            }
                            a = new ateu[length - 1];
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
        } while (!auax.f(this.e, (Object)array, (Object)a));
    }
    
    final void g() {
        final ateu[] array = this.e.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            this.c.e(array[i]);
        }
    }
    
    final void h() {
        final ateu[] array = this.e.getAndSet(atex.b);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.c.e(array[i]);
        }
    }
    
    @Override
    public final void tt(final Object o) {
        if (!this.d) {
            this.c.d(o);
            this.g();
        }
    }
    
    @Override
    public final void tw() {
        if (!this.d) {
            this.d = true;
            this.c.b();
            this.h();
        }
    }
    
    @Override
    public final boolean tz() {
        return this.e.get() == atex.b;
    }
}
