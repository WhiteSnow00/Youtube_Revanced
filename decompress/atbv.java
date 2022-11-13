import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atbv extends asht
{
    final atin a;
    atbt b;
    
    public atbv(final atin a) {
        this.a = a;
    }
    
    final void a(final atbt atbt) {
        final atin a = this.a;
        if (a instanceof asir) {
            ((asir)a).dispose();
            return;
        }
        if (a instanceof asjy) {
            ((asjy)a).tB((asir)atbt.get());
        }
    }
    
    final void b(final atbt atbt) {
        synchronized (this) {
            if (this.a instanceof atbm) {
                final atbt b = this.b;
                if (b != null && b == atbt) {
                    this.b = null;
                    final asir b2 = atbt.b;
                }
                final long c = atbt.c - 1L;
                atbt.c = c;
                if (c == 0L) {
                    this.a(atbt);
                }
            }
            else {
                final atbt b3 = this.b;
                if (b3 != null && b3 == atbt) {
                    final asir b4 = atbt.b;
                    final long c2 = atbt.c - 1L;
                    atbt.c = c2;
                    if (c2 == 0L) {
                        this.b = null;
                        this.a(atbt);
                    }
                }
            }
        }
    }
    
    final void c(final atbt atbt) {
        synchronized (this) {
            if (atbt.c == 0L && atbt == this.b) {
                this.b = null;
                final asir asir = (asir)atbt.get();
                asjv.b((AtomicReference)atbt);
                final atin a = this.a;
                if (a instanceof asir) {
                    ((asir)a).dispose();
                }
                else if (a instanceof asjy) {
                    if (asir == null) {
                        atbt.e = true;
                    }
                    else {
                        ((asjy)a).tB(asir);
                    }
                }
            }
        }
    }
    
    protected final void f(final ashy ashy) {
        synchronized (this) {
            atbt b;
            if ((b = this.b) == null) {
                b = new atbt(this);
                this.b = b;
            }
            long c;
            if ((c = b.c) == 0L) {
                c = 0L;
            }
            final long c2 = c + 1L;
            b.c = c2;
            final boolean d = b.d;
            int n = 0;
            if (!d) {
                n = n;
                if (c2 == 1L) {
                    n = 1;
                    b.d = true;
                }
            }
            monitorexit(this);
            ((asht)this.a).aP((ashy)new atbu(ashy, this, b));
            if (n != 0) {
                this.a.a((asjm)b);
            }
        }
    }
}
