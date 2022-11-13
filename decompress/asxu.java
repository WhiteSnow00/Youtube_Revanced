// 
// Decompiled by Procyon v0.6.0
// 

final class asxu implements ashy, asir
{
    asir a;
    boolean b;
    final Object c;
    private final int d;
    
    public asxu(final ashy c, final int d) {
        this.d = d;
        this.c = c;
    }
    
    public asxu(final asif c, final int d) {
        this.d = d;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.d != 0) {
            if (this.b) {
                atqx.j(t);
                return;
            }
            this.b = true;
            ((ashy)this.c).b(t);
        }
        else {
            if (this.b) {
                atqx.j(t);
                return;
            }
            this.b = true;
            ((asif)this.c).b(t);
        }
    }
    
    @Override
    public final void d(final asir asir) {
        if (this.d != 0) {
            if (asjv.g(this.a, asir)) {
                this.a = asir;
                ((ashy)this.c).d(this);
            }
            return;
        }
        if (asjv.g(this.a, asir)) {
            this.a = asir;
            ((asif)this.c).d(this);
        }
    }
    
    @Override
    public final void dispose() {
        if (this.d != 0) {
            this.a.dispose();
            return;
        }
        this.a.dispose();
    }
    
    @Override
    public final boolean tA() {
        if (this.d != 0) {
            return this.a.tA();
        }
        return this.a.tA();
    }
    
    @Override
    public final void tu(final Object o) {
        final int d = this.d;
        final Boolean value = false;
        if (d != 0) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.a.dispose();
            ((ashy)this.c).tu(value);
            ((ashy)this.c).tx();
        }
        else {
            if (this.b) {
                return;
            }
            this.b = true;
            this.a.dispose();
            ((asif)this.c).ts(value);
        }
    }
    
    @Override
    public final void tx() {
        final int d = this.d;
        final Boolean value = true;
        if (d != 0) {
            if (this.b) {
                return;
            }
            this.b = true;
            ((ashy)this.c).tu(value);
            ((ashy)this.c).tx();
        }
        else {
            if (this.b) {
                return;
            }
            this.b = true;
            ((asif)this.c).ts(value);
        }
    }
}
