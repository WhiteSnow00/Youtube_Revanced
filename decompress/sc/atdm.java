import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

final class atdm implements ashy, asir
{
    Collection a;
    asir b;
    final Object c;
    private final int d;
    
    public atdm(final ashy c, final Collection a, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    public atdm(final asif c, final Collection a, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final int d = this.d;
        this.a = null;
        if (d != 0) {
            ((ashy)this.c).b(t);
            return;
        }
        ((asif)this.c).b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        if (this.d != 0) {
            if (asjv.g(this.b, asir)) {
                this.b = asir;
                ((ashy)this.c).d(this);
            }
            return;
        }
        if (asjv.g(this.b, asir)) {
            this.b = asir;
            ((asif)this.c).d(this);
        }
    }
    
    @Override
    public final void dispose() {
        if (this.d != 0) {
            this.b.dispose();
            return;
        }
        this.b.dispose();
    }
    
    @Override
    public final boolean tA() {
        if (this.d != 0) {
            return this.b.tA();
        }
        return this.b.tA();
    }
    
    @Override
    public final void tu(final Object o) {
        if (this.d != 0) {
            this.a.add(o);
            return;
        }
        this.a.add(o);
    }
    
    @Override
    public final void tx() {
        if (this.d != 0) {
            final Collection a = this.a;
            this.a = null;
            ((ashy)this.c).tu(a);
            ((ashy)this.c).tx();
            return;
        }
        final Collection a2 = this.a;
        this.a = null;
        ((asif)this.c).ts(a2);
    }
}
