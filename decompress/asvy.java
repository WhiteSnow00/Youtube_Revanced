// 
// Decompiled by Procyon v0.6.0
// 

final class asvy implements asho, asir
{
    final asho a;
    final asvz b;
    asir c;
    
    public asvy(final asho a, final asvz b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.c == asjv.a) {
            atqx.j(t);
            return;
        }
        this.c(t);
    }
    
    final void c(final Throwable t) {
        asiz asiz = null;
        try {
            this.b.c.a(t);
        }
        finally {
            final Throwable t2;
            asgz.c(t2);
            asiz = new asiz(new Throwable[] { t, t2 });
        }
        this.c = (asir)asjv.a;
        this.a.b(asiz);
    }
    
    @Override
    public final void d(final asir c) {
        if (asjv.g(this.c, c)) {
            this.c = c;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.c.dispose();
        this.c = (asir)asjv.a;
    }
    
    @Override
    public final boolean tA() {
        return this.c.tA();
    }
    
    @Override
    public final void ts(final Object o) {
        if (this.c == asjv.a) {
            return;
        }
        try {
            this.b.b.a(o);
            this.c = (asir)asjv.a;
            this.a.ts(o);
        }
        finally {
            final Throwable t;
            asgz.c(t);
            this.c(t);
        }
    }
    
    @Override
    public final void tx() {
        if (this.c == asjv.a) {
            return;
        }
        try {
            this.b.d.a();
            this.c = (asir)asjv.a;
            this.a.tx();
        }
        finally {
            final Throwable t;
            asgz.c(t);
            this.c(t);
        }
    }
}
