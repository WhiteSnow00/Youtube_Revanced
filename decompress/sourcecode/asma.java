// 
// Decompiled by Procyon v0.6.0
// 

final class asma implements asgo, asic
{
    final asgo a;
    asic b;
    final /* synthetic */ asmb c;
    
    public asma(final asmb c, final asgo a) {
        this.c = c;
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        if (this.b == asjg.a) {
            aulo.r(t);
            return;
        }
        asik asik = null;
        try {
            this.c.c.a((Object)t);
        }
        finally {
            final Throwable t2;
            asey.d(t2);
            asik = new asik(new Throwable[] { t, t2 });
        }
        this.a.b((Throwable)asik);
    }
    
    public final void d(final asic b) {
        try {
            this.c.b.a((Object)b);
            if (asjg.g(this.b, b)) {
                this.b = b;
                this.a.d((asic)this);
            }
        }
        finally {
            final Throwable t;
            asey.d(t);
            b.dispose();
            this.b = (asic)asjg.a;
            asjh.f(t, this.a);
        }
    }
    
    public final void dispose() {
        try {
            this.c.e.a();
        }
        finally {
            final Throwable t;
            asey.d(t);
            aulo.r(t);
        }
        this.b.dispose();
    }
    
    public final void tu() {
        if (this.b == asjg.a) {
            return;
        }
        try {
            this.c.d.a();
            this.a.tu();
        }
        finally {
            final Throwable t;
            asey.d(t);
            this.a.b(t);
        }
    }
    
    public final boolean tx() {
        return this.b.tx();
    }
}
