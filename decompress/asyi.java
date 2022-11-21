// 
// Decompiled by Procyon v0.6.0
// 

final class asyi implements askk, asln
{
    asln a;
    final Object b;
    private final int c;
    
    public asyi(final asjz b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    public asyi(final askk b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.c != 0) {
            this.a = asmr.a;
            ((askk)this.b).b(t);
            return;
        }
        this.a = asmr.a;
        ((asjz)this.b).b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        if (this.c != 0) {
            if (asmr.g(this.a, asln)) {
                this.a = asln;
                ((askk)this.b).d(this);
            }
            return;
        }
        if (asmr.g(this.a, asln)) {
            this.a = asln;
            ((asjz)this.b).d(this);
        }
    }
    
    @Override
    public final void dispose() {
        if (this.c != 0) {
            this.a.dispose();
            this.a = asmr.a;
            return;
        }
        this.a.dispose();
        this.a = asmr.a;
    }
    
    @Override
    public final void tr(final Object o) {
        if (this.c != 0) {
            this.a = asmr.a;
            ((askk)this.b).tw();
            return;
        }
        this.a = asmr.a;
        ((asjz)this.b).tw();
    }
    
    @Override
    public final void tw() {
        if (this.c != 0) {
            this.a = asmr.a;
            ((askk)this.b).tw();
            return;
        }
        this.a = asmr.a;
        ((asjz)this.b).tw();
    }
    
    @Override
    public final boolean tz() {
        if (this.c != 0) {
            return this.a.tz();
        }
        return this.a.tz();
    }
}
