import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atbd extends ashe
{
    final athv a;
    atbb b;
    
    public atbd(final athv a) {
        this.a = a;
    }
    
    final void a(final atbb atbb) {
        final athv a = this.a;
        if (a instanceof asic) {
            ((asic)a).dispose();
            return;
        }
        if (a instanceof asjj) {
            ((asjj)a).ty((asic)atbb.get());
        }
    }
    
    final void b(final atbb atbb) {
        synchronized (this) {
            if (this.a instanceof atau) {
                final atbb b = this.b;
                if (b != null && b == atbb) {
                    this.b = null;
                    final asic b2 = atbb.b;
                }
                final long c = atbb.c - 1L;
                atbb.c = c;
                if (c == 0L) {
                    this.a(atbb);
                }
            }
            else {
                final atbb b3 = this.b;
                if (b3 != null && b3 == atbb) {
                    final asic b4 = atbb.b;
                    final long c2 = atbb.c - 1L;
                    atbb.c = c2;
                    if (c2 == 0L) {
                        this.b = null;
                        this.a(atbb);
                    }
                }
            }
        }
    }
    
    final void c(final atbb atbb) {
        synchronized (this) {
            if (atbb.c == 0L && atbb == this.b) {
                this.b = null;
                final asic asic = (asic)atbb.get();
                asjg.b((AtomicReference)atbb);
                final athv a = this.a;
                if (a instanceof asic) {
                    ((asic)a).dispose();
                }
                else if (a instanceof asjj) {
                    if (asic == null) {
                        atbb.e = true;
                    }
                    else {
                        ((asjj)a).ty(asic);
                    }
                }
            }
        }
    }
    
    protected final void f(final ashj ashj) {
        synchronized (this) {
            atbb b;
            if ((b = this.b) == null) {
                b = new atbb(this);
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
            ((ashe)this.a).aJ((ashj)new atbc(ashj, this, b));
            if (n != 0) {
                this.a.a((asix)b);
            }
        }
    }
}
