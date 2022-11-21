import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asyr extends AtomicReference implements askk, asln
{
    private static final long serialVersionUID = 2026620218879969836L;
    final askk a;
    final asmn b;
    final boolean c;
    
    public asyr(final askk a, final asmn b) {
        this.a = a;
        this.b = b;
        this.c = true;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (!this.c) {
            if (!(t instanceof Exception)) {
                this.a.b(t);
                return;
            }
        }
        try {
            final askm askm = (askm)((asnd)this.b).a;
            asng.b(askm, "The resumeFunction returned a null MaybeSource");
            asmr.h(this, null);
            askm.ag(new asyq(this.a, this, 0));
        }
        finally {
            final Throwable t2;
            asjv.a(t2);
            this.a.b(new aslv(new Throwable[] { t, t2 }));
        }
    }
    
    @Override
    public final void d(final asln asln) {
        if (asmr.f(this, asln)) {
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final void tr(final Object o) {
        this.a.tr(o);
    }
    
    @Override
    public final void tw() {
        this.a.tw();
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
