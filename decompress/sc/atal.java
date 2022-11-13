// 
// Decompiled by Procyon v0.6.0
// 

public final class atal implements ashl, asir
{
    aukg a;
    final Object b;
    private final int c;
    
    public atal(final ashd b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    public atal(final ashy b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        if (this.c != 0) {
            this.a = (aukg)athz.a;
            ((ashd)this.b).b(t);
            return;
        }
        ((ashy)this.b).b(t);
    }
    
    public final void dispose() {
        if (this.c != 0) {
            this.a.tt();
            this.a = (aukg)athz.a;
            return;
        }
        this.a.tt();
        this.a = (aukg)athz.a;
    }
    
    public final void f(final aukg aukg) {
        if (this.c != 0) {
            if (athz.i(this.a, aukg)) {
                this.a = aukg;
                ((ashd)this.b).d(this);
                aukg.e(Long.MAX_VALUE);
            }
            return;
        }
        if (athz.i(this.a, aukg)) {
            this.a = aukg;
            ((ashy)this.b).d(this);
            aukg.e(Long.MAX_VALUE);
        }
    }
    
    public final boolean tA() {
        if (this.c != 0) {
            return this.a == athz.a;
        }
        return this.a == athz.a;
    }
    
    public final void tu(final Object o) {
        if (this.c != 0) {
            return;
        }
        ((ashy)this.b).tu(o);
    }
    
    public final void tx() {
        if (this.c != 0) {
            this.a = (aukg)athz.a;
            ((ashd)this.b).tx();
            return;
        }
        ((ashy)this.b).tx();
    }
}
