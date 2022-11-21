import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class ateg implements asku, asln
{
    static final atef[] a;
    static final atef[] b;
    final AtomicReference c;
    final AtomicReference d;
    final AtomicBoolean e;
    final AtomicReference f;
    
    static {
        a = new atef[0];
        b = new atef[0];
    }
    
    public ateg(final AtomicReference c) {
        this.f = new AtomicReference();
        this.d = new AtomicReference((V)(Object)ateg.a);
        this.c = c;
        this.e = new AtomicBoolean();
    }
    
    @Override
    public final void b(final Throwable t) {
        atzd.q(this.c, (Object)this, (Object)null);
        final atef[] array = this.d.getAndSet(ateg.b);
        final int length = array.length;
        if (length != 0) {
            for (int i = 0; i < length; ++i) {
                array[i].a.b(t);
            }
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this.f, asln);
    }
    
    @Override
    public final void dispose() {
        final AtomicReference d = this.d;
        final atef[] b = ateg.b;
        if (d.getAndSet(b) != b) {
            atzd.q(this.c, (Object)this, (Object)null);
            asmr.b(this.f);
        }
    }
    
    final void f(final atef atef) {
        atef[] array;
        atef[] a;
    Label_0101:
        do {
            array = this.d.get();
            final int length = array.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    while (i < length) {
                        if (array[i].equals(atef)) {
                            if (i < 0) {
                                return;
                            }
                            if (length == 1) {
                                a = ateg.a;
                                continue Label_0101;
                            }
                            a = new atef[length - 1];
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
        } while (!atzd.q(this.d, (Object)array, (Object)a));
    }
    
    @Override
    public final void tt(final Object o) {
        final atef[] array = this.d.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].a.tt(o);
        }
    }
    
    @Override
    public final void tw() {
        atzd.q(this.c, (Object)this, (Object)null);
        final atef[] array = this.d.getAndSet(ateg.b);
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].a.tw();
        }
    }
    
    @Override
    public final boolean tz() {
        return this.d.get() == ateg.b;
    }
}
