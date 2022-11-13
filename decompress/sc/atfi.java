// 
// Decompiled by Procyon v0.6.0
// 

public final class atfi implements asif, asir
{
    asir a;
    final Object b;
    private final int c;
    
    public atfi(final asho b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    public atfi(final asif b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.c != 0) {
            this.a = asjv.a;
            ((asho)this.b).b(t);
            return;
        }
        ((asif)this.b).b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        if (this.c != 0) {
            if (asjv.g(this.a, asir)) {
                this.a = asir;
                ((asho)this.b).d(this);
            }
            return;
        }
        if (asjv.g(this.a, asir)) {
            this.a = asir;
            ((asif)this.b).d(this);
        }
    }
    
    @Override
    public final void dispose() {
        if (this.c != 0) {
            this.a.dispose();
            this.a = asjv.a;
            return;
        }
        this.a.dispose();
    }
    
    @Override
    public final boolean tA() {
        if (this.c != 0) {
            return this.a.tA();
        }
        return this.a.tA();
    }
    
    @Override
    public final void ts(final Object o) {
        if (this.c != 0) {
            this.a = asjv.a;
            ((asho)this.b).ts(o);
            return;
        }
        ((asif)this.b).ts(o);
    }
}
