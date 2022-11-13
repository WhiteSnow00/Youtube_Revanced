// 
// Decompiled by Procyon v0.6.0
// 

final class atcu implements ashy, asir
{
    boolean a;
    asir b;
    long c;
    final Object d;
    private final int e;
    
    public atcu(final asho d, final int e) {
        this.e = e;
        this.d = d;
    }
    
    public atcu(final ashy d, final long c, final int e) {
        this.e = e;
        this.d = d;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.e != 0) {
            if (this.a) {
                atqx.j(t);
                return;
            }
            this.a = true;
            ((asho)this.d).b(t);
        }
        else {
            if (this.a) {
                atqx.j(t);
                return;
            }
            this.a = true;
            this.b.dispose();
            ((ashy)this.d).b(t);
        }
    }
    
    @Override
    public final void d(final asir asir) {
        if (this.e != 0) {
            if (asjv.g(this.b, asir)) {
                this.b = asir;
                ((asho)this.d).d(this);
            }
            return;
        }
        if (asjv.g(this.b, asir)) {
            this.b = asir;
            if (this.c == 0L) {
                this.a = true;
                asir.dispose();
                asjw.d((ashy)this.d);
                return;
            }
            ((ashy)this.d).d(this);
        }
    }
    
    @Override
    public final void dispose() {
        if (this.e != 0) {
            this.b.dispose();
            return;
        }
        this.b.dispose();
    }
    
    @Override
    public final boolean tA() {
        if (this.e != 0) {
            return this.b.tA();
        }
        return this.b.tA();
    }
    
    @Override
    public final void tu(final Object o) {
        if (this.e == 0) {
            if (!this.a) {
                final long c = this.c;
                final long c2 = -1L + c;
                this.c = c2;
                if (c > 0L) {
                    ((ashy)this.d).tu(o);
                    if (c2 == 0L) {
                        this.tx();
                    }
                }
            }
            return;
        }
        if (this.a) {
            return;
        }
        final long c3 = this.c;
        if (c3 == 0L) {
            this.a = true;
            this.b.dispose();
            ((asho)this.d).ts(o);
            return;
        }
        this.c = c3 + 1L;
    }
    
    @Override
    public final void tx() {
        if (this.e != 0) {
            if (!this.a) {
                this.a = true;
                ((asho)this.d).tx();
            }
            return;
        }
        if (!this.a) {
            this.a = true;
            this.b.dispose();
            ((ashy)this.d).tx();
        }
    }
}
