import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atac extends AtomicInteger implements asku, asln
{
    private static final long serialVersionUID = -9140123220065488293L;
    final asku a;
    final asmn b;
    final atla c;
    final atab d;
    final asno e;
    asln f;
    volatile boolean g;
    volatile boolean h;
    Object i;
    volatile int j;
    final int k;
    
    public atac(final asku a, final asmn b) {
        this.a = a;
        this.b = b;
        this.k = 1;
        this.c = new atla();
        this.d = new atab(this);
        this.e = (asno)new atje(2);
    }
    
    @Override
    public final void b(final Throwable t) {
        if (atle.e(this.c, t)) {
            if (this.k == 1) {
                asmr.b(this.d);
            }
            this.g = true;
            this.f();
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln f) {
        if (asmr.g(this.f, f)) {
            this.f = f;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.h = true;
        this.f.dispose();
        asmr.b(this.d);
        if (this.getAndIncrement() == 0) {
            this.e.c();
            this.i = null;
        }
    }
    
    final void f() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final asku a = this.a;
        final int k = this.k;
        final asno e = this.e;
        final atla c = this.c;
        int addAndGet = 1;
        while (true) {
            Label_0284: {
                if (this.h) {
                    e.c();
                    this.i = null;
                }
                else {
                    final int j = this.j;
                    if (c.get() != null && k == 1) {
                        e.c();
                        this.i = null;
                        a.b(atle.d(c));
                        return;
                    }
                    if (j == 0) {
                        final boolean g = this.g;
                        final Object tv = e.tv();
                        if (g) {
                            if (tv == null) {
                                final Throwable d = atle.d(c);
                                if (d == null) {
                                    a.tw();
                                    return;
                                }
                                a.b(d);
                                return;
                            }
                        }
                        else if (tv == null) {
                            break Label_0284;
                        }
                        try {
                            final askm askm = (askm)this.b.a(tv);
                            asng.b(askm, "The mapper returned a null MaybeSource");
                            this.j = 1;
                            askm.ag(this.d);
                            break Label_0284;
                        }
                        finally {
                            final Throwable t;
                            asjv.a(t);
                            this.f.dispose();
                            e.c();
                            atle.e(c, t);
                            a.b(atle.d(c));
                            return;
                        }
                    }
                    if (j == 2) {
                        final Object i = this.i;
                        this.i = null;
                        a.tt(i);
                        this.j = 0;
                        continue;
                    }
                }
            }
            if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                return;
            }
        }
    }
    
    @Override
    public final void tt(final Object o) {
        this.e.j(o);
        this.f();
    }
    
    @Override
    public final void tw() {
        this.g = true;
        this.f();
    }
    
    @Override
    public final boolean tz() {
        return this.h;
    }
}
