// 
// Decompiled by Procyon v0.6.0
// 

final class atat implements ashy, asir
{
    asir a;
    final Object b;
    private final int c;
    
    public atat(final ashd b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    public atat(final ashy b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        final int c = this.c;
        if (c == 0) {
            ((ashy)this.b).b(t);
            return;
        }
        if (c == 1) {
            ((ashy)this.b).b(t);
            return;
        }
        if (c != 2) {
            askk.b((Object)t, "error is null");
            ((ashy)this.b).tu(new ashs(atil.b(t)));
            ((ashy)this.b).tx();
            return;
        }
        ((ashd)this.b).b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        final int c = this.c;
        if (c == 0) {
            this.a = asir;
            ((ashy)this.b).d(this);
            return;
        }
        if (c == 1) {
            if (asjv.g(this.a, asir)) {
                this.a = asir;
                ((ashy)this.b).d(this);
            }
            return;
        }
        if (c != 2) {
            if (asjv.g(this.a, asir)) {
                this.a = asir;
                ((ashy)this.b).d(this);
            }
            return;
        }
        this.a = asir;
        ((ashd)this.b).d(this);
    }
    
    @Override
    public final void dispose() {
        final int c = this.c;
        if (c == 0) {
            this.a.dispose();
            return;
        }
        if (c == 1) {
            this.a.dispose();
            return;
        }
        if (c != 2) {
            this.a.dispose();
            return;
        }
        this.a.dispose();
    }
    
    @Override
    public final boolean tA() {
        final int c = this.c;
        if (c == 0) {
            return this.a.tA();
        }
        if (c == 1) {
            return this.a.tA();
        }
        if (c != 2) {
            return this.a.tA();
        }
        return this.a.tA();
    }
    
    @Override
    public final void tu(final Object o) {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    final Object b = this.b;
                    askk.b(o, "value is null");
                    ((ashy)b).tu(new ashs(o));
                }
                return;
            }
            ((ashy)this.b).tu(o);
        }
    }
    
    @Override
    public final void tx() {
        final int c = this.c;
        if (c == 0) {
            ((ashy)this.b).tx();
            return;
        }
        if (c == 1) {
            ((ashy)this.b).tx();
            return;
        }
        if (c != 2) {
            ((ashy)this.b).tu(ashs.a);
            ((ashy)this.b).tx();
            return;
        }
        ((ashd)this.b).tx();
    }
}
