// 
// Decompiled by Procyon v0.6.0
// 

final class atcl implements ashy, asir
{
    final Object a;
    asir b;
    Object c;
    boolean d;
    final Object e;
    private final int f;
    
    public atcl(final ashy e, final asji a, final Object c, final int f) {
        this.f = f;
        this.e = e;
        this.a = a;
        this.c = c;
    }
    
    public atcl(final asif e, final Object a, final int f) {
        this.f = f;
        this.e = e;
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.f != 0) {
            if (this.d) {
                atqx.j(t);
                return;
            }
            this.d = true;
            ((ashy)this.e).b(t);
        }
        else {
            if (this.d) {
                atqx.j(t);
                return;
            }
            this.d = true;
            ((asif)this.e).b(t);
        }
    }
    
    @Override
    public final void d(final asir asir) {
        if (this.f != 0) {
            if (asjv.g(this.b, asir)) {
                this.b = asir;
                ((ashy)this.e).d(this);
                ((ashy)this.e).tu(this.c);
            }
            return;
        }
        if (asjv.g(this.b, asir)) {
            this.b = asir;
            ((asif)this.e).d(this);
        }
    }
    
    @Override
    public final void dispose() {
        if (this.f != 0) {
            this.b.dispose();
            return;
        }
        this.b.dispose();
    }
    
    @Override
    public final boolean tA() {
        if (this.f != 0) {
            return this.b.tA();
        }
        return this.b.tA();
    }
    
    @Override
    public final void tu(Object a) {
        if (this.f != 0) {
            if (this.d) {
                return;
            }
            final Object c = this.c;
            try {
                a = ((asji)this.a).a(c, a);
                askk.b(a, "The accumulator returned a null value");
                this.c = a;
                ((ashy)this.e).tu(a);
                return;
            }
            finally {
                final Throwable t;
                asgz.c(t);
                this.b.dispose();
                this.b(t);
                return;
            }
        }
        if (this.d) {
            return;
        }
        if (this.c != null) {
            this.d = true;
            this.b.dispose();
            ((asif)this.e).b(new IllegalArgumentException("Sequence contains more than one element!"));
            return;
        }
        this.c = a;
    }
    
    @Override
    public final void tx() {
        if (this.f != 0) {
            if (this.d) {
                return;
            }
            this.d = true;
            ((ashy)this.e).tx();
        }
        else {
            if (this.d) {
                return;
            }
            this.d = true;
            final Object c = this.c;
            this.c = null;
            Object a;
            if ((a = c) == null) {
                a = this.a;
            }
            ((asif)this.e).ts(a);
        }
    }
}
