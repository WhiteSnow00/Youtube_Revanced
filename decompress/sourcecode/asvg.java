import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asvg extends AtomicReference implements asgz, asic
{
    private static final long serialVersionUID = 2026620218879969836L;
    final asgz a;
    final asjc b;
    final boolean c;
    
    public asvg(final asgz a, final asjc b) {
        this.a = a;
        this.b = b;
        this.c = true;
    }
    
    public final void b(final Throwable t) {
        if (!this.c) {
            if (!(t instanceof Exception)) {
                this.a.b(t);
                return;
            }
        }
        try {
            final ashb ashb = (ashb)((asjs)this.b).a;
            asjv.b((Object)ashb, "The resumeFunction returned a null MaybeSource");
            asjg.h(this, null);
            ashb.ag((asgz)new asvf(this.a, this, 0));
        }
        finally {
            final Throwable t2;
            asey.d(t2);
            this.a.b((Throwable)new asik(new Throwable[] { t, t2 }));
        }
    }
    
    public final void d(final asic asic) {
        if (asjg.f(this, asic)) {
            this.a.d((asic)this);
        }
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    public final void tp(final Object o) {
        this.a.tp(o);
    }
    
    public final void tu() {
        this.a.tu();
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
