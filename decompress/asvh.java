// 
// Decompiled by Procyon v0.6.0
// 

public final class asvh implements ashd, asir
{
    asir a;
    final Object b;
    private final int c;
    
    public asvh(final ashd b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    public asvh(final asho b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.c != 0) {
            ((ashd)this.b).b(t);
            return;
        }
        this.a = (asir)asjv.a;
        ((asho)this.b).b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        if (this.c != 0) {
            if (asjv.g(this.a, asir)) {
                this.a = asir;
                ((ashd)this.b).d(this);
            }
            return;
        }
        if (asjv.g(this.a, asir)) {
            this.a = asir;
            ((asho)this.b).d(this);
        }
    }
    
    @Override
    public final void dispose() {
        if (this.c != 0) {
            this.a.dispose();
            this.a = (asir)asjv.a;
            return;
        }
        this.a.dispose();
        this.a = (asir)asjv.a;
    }
    
    @Override
    public final boolean tA() {
        if (this.c != 0) {
            return this.a.tA();
        }
        return this.a.tA();
    }
    
    @Override
    public final void tx() {
        if (this.c != 0) {
            ((ashd)this.b).tx();
            return;
        }
        this.a = (asir)asjv.a;
        ((asho)this.b).tx();
    }
}
