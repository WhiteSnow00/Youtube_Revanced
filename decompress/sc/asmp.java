// 
// Decompiled by Procyon v0.6.0
// 

final class asmp implements ashd, asir
{
    final ashd a;
    asir b;
    final asmq c;
    
    public asmp(final asmq c, final ashd a) {
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.b == asjv.a) {
            atqx.j(t);
            return;
        }
        asiz asiz = null;
        try {
            this.c.c.a(t);
        }
        finally {
            final Throwable t2;
            asgz.c(t2);
            asiz = new asiz(new Throwable[] { t, t2 });
        }
        this.a.b(asiz);
    }
    
    @Override
    public final void d(final asir b) {
        try {
            this.c.b.a(b);
            if (asjv.g(this.b, b)) {
                this.b = b;
                this.a.d(this);
            }
        }
        finally {
            final Throwable t;
            asgz.c(t);
            b.dispose();
            this.b = (asir)asjv.a;
            asjw.f(t, this.a);
        }
    }
    
    @Override
    public final void dispose() {
        try {
            this.c.e.a();
        }
        finally {
            final Throwable t;
            asgz.c(t);
            atqx.j(t);
        }
        this.b.dispose();
    }
    
    @Override
    public final boolean tA() {
        return this.b.tA();
    }
    
    @Override
    public final void tx() {
        if (this.b == asjv.a) {
            return;
        }
        try {
            this.c.d.a();
            this.a.tx();
        }
        finally {
            final Throwable t;
            asgz.c(t);
            this.a.b(t);
        }
    }
}
