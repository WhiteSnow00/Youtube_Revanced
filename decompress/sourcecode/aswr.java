import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswr extends AtomicInteger implements ashj, asic
{
    private static final long serialVersionUID = -9140123220065488293L;
    final ashj a;
    final asjc b;
    final athl c;
    final aswq d;
    final askd e;
    asic f;
    volatile boolean g;
    volatile boolean h;
    Object i;
    volatile int j;
    final int k;
    
    public aswr(final ashj a, final asjc b) {
        this.a = a;
        this.b = b;
        this.k = 1;
        this.c = new athl();
        this.d = new aswq(this);
        this.e = (askd)new atfp(2);
    }
    
    public final void b(final Throwable t) {
        if (athp.e(this.c, t)) {
            if (this.k == 1) {
                asjg.b(this.d);
            }
            this.g = true;
            this.f();
            return;
        }
        aulo.r(t);
    }
    
    public final void d(final asic f) {
        if (asjg.g(this.f, f)) {
            this.f = f;
            this.a.d((asic)this);
        }
    }
    
    public final void dispose() {
        this.h = true;
        this.f.dispose();
        asjg.b(this.d);
        if (this.getAndIncrement() == 0) {
            this.e.c();
            this.i = null;
        }
    }
    
    final void f() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final ashj a = this.a;
        final int k = this.k;
        final askd e = this.e;
        final athl c = this.c;
        int addAndGet = 1;
        while (true) {
            Label_0274: {
                if (this.h) {
                    e.c();
                    this.i = null;
                }
                else {
                    final int j = this.j;
                    if (c.get() != null && k == 1) {
                        e.c();
                        this.i = null;
                        a.b(athp.d(c));
                        return;
                    }
                    if (j == 0) {
                        final boolean g = this.g;
                        final Object tt = e.tt();
                        if (g) {
                            if (tt == null) {
                                final Throwable d = athp.d(c);
                                if (d == null) {
                                    a.tu();
                                    return;
                                }
                                a.b(d);
                                return;
                            }
                        }
                        else if (tt == null) {
                            break Label_0274;
                        }
                        try {
                            final ashb ashb = (ashb)this.b.a(tt);
                            asjv.b((Object)ashb, "The mapper returned a null MaybeSource");
                            this.j = 1;
                            ashb.ag((asgz)this.d);
                            break Label_0274;
                        }
                        finally {
                            final Throwable t;
                            asey.d(t);
                            this.f.dispose();
                            e.c();
                            athp.e(c, t);
                            a.b(athp.d(c));
                            return;
                        }
                    }
                    if (j == 2) {
                        final Object i = this.i;
                        this.i = null;
                        a.tr(i);
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
    
    public final void tr(final Object o) {
        this.e.j(o);
        this.f();
    }
    
    public final void tu() {
        this.g = true;
        this.f();
    }
    
    public final boolean tx() {
        return this.h;
    }
}
