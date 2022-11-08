// 
// Decompiled by Procyon v0.6.0
// 

final class asvj implements asgz, asic
{
    final asgz a;
    final asvk b;
    asic c;
    
    public asvj(final asgz a, final asvk b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        if (this.c == asjg.a) {
            aulo.r(t);
            return;
        }
        this.c(t);
    }
    
    final void c(final Throwable t) {
        asik asik = null;
        try {
            this.b.c.a((Object)t);
        }
        finally {
            final Throwable t2;
            asey.d(t2);
            asik = new asik(new Throwable[] { t, t2 });
        }
        this.c = (asic)asjg.a;
        this.a.b((Throwable)asik);
    }
    
    public final void d(final asic c) {
        if (asjg.g(this.c, c)) {
            this.c = c;
            this.a.d((asic)this);
        }
    }
    
    public final void dispose() {
        this.c.dispose();
        this.c = (asic)asjg.a;
    }
    
    public final void tp(final Object o) {
        if (this.c == asjg.a) {
            return;
        }
        try {
            this.b.b.a(o);
            this.c = (asic)asjg.a;
            this.a.tp(o);
        }
        finally {
            final Throwable t;
            asey.d(t);
            this.c(t);
        }
    }
    
    public final void tu() {
        if (this.c == asjg.a) {
            return;
        }
        try {
            this.b.d.a();
            this.c = (asic)asjg.a;
            this.a.tu();
        }
        finally {
            final Throwable t;
            asey.d(t);
            this.c(t);
        }
    }
    
    public final boolean tx() {
        return this.c.tx();
    }
}
