// 
// Decompiled by Procyon v0.6.0
// 

final class asui implements ashq, asic
{
    final asgz a;
    final asjd b;
    asic c;
    
    public asui(final asgz a, final asjd b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    public final void d(final asic c) {
        if (asjg.g(this.c, c)) {
            this.c = c;
            this.a.d((asic)this);
        }
    }
    
    public final void dispose() {
        final asic c = this.c;
        this.c = (asic)asjg.a;
        c.dispose();
    }
    
    public final void tp(final Object o) {
        try {
            if (this.b.a(o)) {
                this.a.tp(o);
                return;
            }
            this.a.tu();
        }
        finally {
            final Throwable t;
            asey.d(t);
            this.a.b(t);
        }
    }
    
    public final boolean tx() {
        return this.c.tx();
    }
}
