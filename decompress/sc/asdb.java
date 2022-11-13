import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

final class asdb extends asax
{
    final aruo c;
    final arwo d;
    final artx e;
    final asdc f;
    
    public asdb(final asdc f, final aruo c, final arwo d, final artx e) {
        this.f = f;
        super(f.c.d(e), f.c.k, e.b);
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    protected final void d() {
        this.f.c.n.execute((Runnable)new asba(this, 20));
    }
    
    final void j() {
        final aruo a = this.c.a();
        try {
            final arua c = this.f.c(this.d, this.e);
            this.c.c(a);
            synchronized (this) {
                Object o;
                if (super.b != null) {
                    monitorexit(this);
                    o = null;
                }
                else {
                    super.i(c);
                    monitorexit(this);
                    o = new asar(this, super.a);
                }
                if (o == null) {
                    this.f.c.n.execute((Runnable)new asba(this, 20));
                    return;
                }
                this.f.c.d(this.e).execute((Runnable)new asat(this, (Runnable)o, 18));
            }
        }
        finally {
            this.c.c(a);
        }
    }
}
