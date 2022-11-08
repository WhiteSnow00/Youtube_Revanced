// 
// Decompiled by Procyon v0.6.0
// 

public final class askn implements ashj, asic
{
    final ashj a;
    final asix b;
    final asir c;
    asic d;
    
    public askn(final ashj a, final asix b, final asir c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void b(final Throwable t) {
        if (this.d != asjg.a) {
            this.d = (asic)asjg.a;
            this.a.b(t);
            return;
        }
        aulo.r(t);
    }
    
    public final void d(final asic d) {
        try {
            this.b.a((Object)d);
            if (asjg.g(this.d, d)) {
                this.d = d;
                this.a.d((asic)this);
            }
        }
        finally {
            final Throwable t;
            asey.d(t);
            d.dispose();
            this.d = (asic)asjg.a;
            asjh.g(t, this.a);
        }
    }
    
    public final void dispose() {
        final asic d = this.d;
        if (d != asjg.a) {
            this.d = (asic)asjg.a;
            try {
                this.c.a();
            }
            finally {
                final Throwable t;
                asey.d(t);
                aulo.r(t);
            }
            d.dispose();
        }
    }
    
    public final void tr(final Object o) {
        this.a.tr(o);
    }
    
    public final void tu() {
        if (this.d != asjg.a) {
            this.d = (asic)asjg.a;
            this.a.tu();
        }
    }
    
    public final boolean tx() {
        return this.d.tx();
    }
}
