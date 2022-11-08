// 
// Decompiled by Procyon v0.6.0
// 

public final class aszt implements asgw, asic
{
    aujq a;
    final Object b;
    private final /* synthetic */ int c;
    
    public aszt(final asgo b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    public aszt(final ashj b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        if (this.c != 0) {
            this.a = (aujq)athh.a;
            ((asgo)this.b).b(t);
            return;
        }
        ((ashj)this.b).b(t);
    }
    
    public final void dispose() {
        if (this.c != 0) {
            this.a.tq();
            this.a = (aujq)athh.a;
            return;
        }
        this.a.tq();
        this.a = (aujq)athh.a;
    }
    
    public final void f(final aujq aujq) {
        if (this.c != 0) {
            if (athh.i(this.a, aujq)) {
                this.a = aujq;
                ((asgo)this.b).d((asic)this);
                aujq.e(Long.MAX_VALUE);
            }
            return;
        }
        if (athh.i(this.a, aujq)) {
            this.a = aujq;
            ((ashj)this.b).d((asic)this);
            aujq.e(Long.MAX_VALUE);
        }
    }
    
    public final void tr(final Object o) {
        if (this.c != 0) {
            return;
        }
        ((ashj)this.b).tr(o);
    }
    
    public final void tu() {
        if (this.c != 0) {
            this.a = (aujq)athh.a;
            ((asgo)this.b).tu();
            return;
        }
        ((ashj)this.b).tu();
    }
    
    public final boolean tx() {
        if (this.c != 0) {
            return this.a == athh.a;
        }
        return this.a == athh.a;
    }
}
